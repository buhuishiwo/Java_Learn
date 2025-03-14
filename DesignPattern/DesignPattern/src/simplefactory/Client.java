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
