<<<<<<< HEAD
//designpatterns.simplefactory.Client.java
package simplefactory;

public class Client {
	public static void main(String args[]) {
		Fruit fruit;
		
		String type = XMLUtil.getFruitType(); //读取配置文件中的参数
		fruit = FruitFactory.getChart(type);  //创建产品对象

		fruit.display();
	}
}
=======
//designpatterns.simplefactory.Client.java
package simplefactory;

public class Client {
	public static void main(String args[]) {
		Fruit fruit;
		
		String type = XMLUtil.getFruitType(); //读取配置文件中的参数
		fruit = FruitFactory.getChart(type);  //创建产品对象

		fruit.display();
	}
}
>>>>>>> a5613707a74e9d14e557944f071f76b9d422af2b
