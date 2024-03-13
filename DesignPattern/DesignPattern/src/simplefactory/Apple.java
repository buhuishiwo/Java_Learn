//designpatterns.simplefactory.Apple.java
package simplefactory;

//苹果类，充当具体产品类
public class Apple implements Fruit {
	public Apple() {
		System.out.println("获得苹果树！");
	}
	
	public void display() {
		System.out.println("获得苹果！");
	}
}