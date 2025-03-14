<<<<<<< HEAD
//designpatterns.simplefactory.FruitFactory.java
package simplefactory;

//水果工厂类，充当工厂类
public class FruitFactory {
    //静态工厂方法
	public static Fruit getChart(String type) {
		Fruit fruit = null;
		if (type.equalsIgnoreCase("Apple")) {
			fruit = new Apple();
			System.out.println("种苹果树！");
		}
		else if (type.equalsIgnoreCase("Orange")) {
			fruit = new Orange();
			System.out.println("种橙子树!");
		}
		else if (type.equalsIgnoreCase("Banana")) {
			fruit = new Banana();
			System.out.println("种香蕉树！");
		}
		return fruit;
	}
=======
//designpatterns.simplefactory.FruitFactory.java
package simplefactory;

//水果工厂类，充当工厂类
public class FruitFactory {
    //静态工厂方法
	public static Fruit getChart(String type) {
		Fruit fruit = null;
		if (type.equalsIgnoreCase("Apple")) {
			fruit = new Apple();
			System.out.println("种苹果树！");
		}
		else if (type.equalsIgnoreCase("Orange")) {
			fruit = new Orange();
			System.out.println("种橙子树!");
		}
		else if (type.equalsIgnoreCase("Banana")) {
			fruit = new Banana();
			System.out.println("种香蕉树！");
		}
		return fruit;
	}
>>>>>>> a5613707a74e9d14e557944f071f76b9d422af2b
}