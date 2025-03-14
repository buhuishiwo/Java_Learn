package DeepClone;

import java.io.*;

public class DeepProtoType implements Serializable, Cloneable {
    public String name;
    public DeepCloneableTarget deepCloneableTarget;
    public DeepProtoType() {
        super();
    }

    //方法 1 深拷贝
    @Override
    protected Object clone() throws CloneNotSupportedException {
        Object deep = null;
        //对基本数据类型的克隆
        deep = super.clone();
        //对引用类型的属性，进行单独处理
        DeepProtoType deepProtoType = (DeepProtoType)deep;
        deepProtoType.deepCloneableTarget = (DeepCloneableTarget)deepCloneableTarget.clone();
        return deepProtoType;
    }

    //方法 2 深拷贝

    public Object deepClone() {

        ByteArrayOutputStream bos = null;
        ObjectOutputStream oos = null;
        ByteArrayInputStream bis = null;
        ObjectInputStream ois = null;

        try {
            //序列化
            bos = new ByteArrayOutputStream();
            oos = new ObjectOutputStream(bos);
            oos.writeObject(this);
            //反序列化
            bis = new ByteArrayInputStream(bos.toByteArray());
            ois = new ObjectInputStream(bis);
            DeepProtoType cloneObj = (DeepProtoType) ois.readObject();
            return cloneObj;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        } finally {
            //关闭流
            try{
                bos.close();
                oos.close();
                bis.close();
                ois.close();
            } catch (Exception e2) {
                System.out.println(e2.getMessage());
            }
        }

    }
}
