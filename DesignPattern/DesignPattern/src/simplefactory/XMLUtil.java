<<<<<<< HEAD
package simplefactory;
import javax.xml.parsers.*;
import org.w3c.dom.*;
import java.io.*;

public class XMLUtil {
	//该方法用于从XML配置文件中提取水果类型，并返回类型名
    public static String getFruitType() {
        try {
        	//创建文档对象
            DocumentBuilderFactory dFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = dFactory.newDocumentBuilder();
            Document doc;							
            doc = builder.parse(new File("src//simplefactory//config.xml"));
		
            //获取包含图表类型的文本结点
            NodeList nl = doc.getElementsByTagName("fruitType");
            Node classNode = nl.item(0).getFirstChild();
            String fruitType = classNode.getNodeValue().trim();
            return fruitType;
        }   
        catch(Exception e) {
            e.printStackTrace();
            return null;
        }
    }
=======
package simplefactory;
import javax.xml.parsers.*;
import org.w3c.dom.*;
import java.io.*;

public class XMLUtil {
	//该方法用于从XML配置文件中提取水果类型，并返回类型名
    public static String getFruitType() {
        try {
        	//创建文档对象
            DocumentBuilderFactory dFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = dFactory.newDocumentBuilder();
            Document doc;							
            doc = builder.parse(new File("src//simplefactory//config.xml"));
		
            //获取包含图表类型的文本结点
            NodeList nl = doc.getElementsByTagName("fruitType");
            Node classNode = nl.item(0).getFirstChild();
            String fruitType = classNode.getNodeValue().trim();
            return fruitType;
        }   
        catch(Exception e) {
            e.printStackTrace();
            return null;
        }
    }
>>>>>>> a5613707a74e9d14e557944f071f76b9d422af2b
}