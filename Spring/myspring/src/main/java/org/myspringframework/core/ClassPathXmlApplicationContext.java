package org.myspringframework.core;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.Node;
import org.dom4j.io.SAXReader;

import java.io.InputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ClassPathXmlApplicationContext implements ApplicationContext {

    private Map<String, Object> singletons = new HashMap<>();
    //接收 xml 配置文件路径并解析配置文件，初始化所有 Bean 对象
    public ClassPathXmlApplicationContext(String configLocation) {
        try{
            //解析 myspring.xml文件，然后实例化 Bean，将 Bean 存放到singletons集合中
            //这是 dom4j 解析 XML 文件的核心对象
            SAXReader reader = new SAXReader();
            //获取一个输入流，指向配置文件
            InputStream is = ClassLoader.getSystemClassLoader().getResourceAsStream(configLocation);
            //读文件
            Document doc = reader.read(is);
            //获取所有 bean 标签
            List<Node> nodes = doc.selectNodes("//bean");
            //遍历 bean 标签
            for (Node node : nodes) {
//                System.out.println(node);
                //向下转型，使用 Element 接口里的更多方法
                Element beanElement = (Element) node;
                //获取 id
                String id = beanElement.attributeValue("id");
                //获取 className
                String className = beanElement.attributeValue("class");
                //通过反射机制创建对象，将其放入 Map 集合提前曝光
                Class<?> clazz = Class.forName(className);
                Constructor<?> declaredConstructor = clazz.getDeclaredConstructor();
                Object instance = declaredConstructor.newInstance();
                singletons.put(id, instance);
            }

            nodes.forEach(node -> {
                try{
                    Element element = (Element) node;
                    //获取 id
                    String id = element.attributeValue("id");
                    //获取 className
                    String className = element.attributeValue("class");
                    //获取 class
                    Class<?> clazz = Class.forName(className);
                    //获取该 bean 标签下所有的 property 标签
                    List<Element> propertys = element.elements("property");
                    //遍历所有的属性标签
                    propertys.forEach(property -> {
                        try {
                            //获取属性名
                            String propertyName = property.attributeValue("name");
                            //获取属性类型
                            Field field = clazz.getDeclaredField(propertyName);
                            //获取方法名
                            String setMethodName = "set" + propertyName.substring(0, 1).toUpperCase() + propertyName.substring(1);
                            //获取方法
                            Method method = clazz.getDeclaredMethod(setMethodName, field.getType());
                            //获取 value
                            String value = property.attributeValue("value");
                            //获取 ref
                            String ref = property.attributeValue("ref");
                            Object actualValue = null;
                            if (ref != null) {
                                //表示非简单类型值
                                method.invoke(singletons.get(id), singletons.get(ref));
                            }
                            if(value != null) {
                                //表示简单类型值
                                //获取属性类型名
                                String propertyTypeSimpleName = field.getType().getSimpleName();
                                switch (propertyTypeSimpleName) {
                                    case "boolean":
                                        actualValue = Boolean.parseBoolean(value);
                                        break;
                                    case "byte":
                                        actualValue = Byte.parseByte(value);
                                        break;
                                    case "short":
                                        actualValue = Short.parseShort(value);
                                        break;
                                    case "int":
                                        actualValue = Integer.parseInt(value);
                                        break;
                                    case "long":
                                        actualValue = Long.parseLong(value);
                                        break;
                                    case "float":
                                        actualValue = Float.parseFloat(value);
                                        break;
                                    case "double":
                                        actualValue = Double.parseDouble(value);
                                        break;
                                    case "char":
                                        actualValue = value.charAt(0);
                                        break;
                                    case "String":
                                        actualValue = value;
                                }
                                //调用方法
                                method.invoke(singletons.get(id), actualValue);
                            }

                        } catch (Exception e ) {
                            e.printStackTrace();
                        }
                    });
                }catch (Exception e){
                    e.printStackTrace();
                }

            });
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public Object getBean(String beanName) {
        return singletons.get(beanName);
    }
}
