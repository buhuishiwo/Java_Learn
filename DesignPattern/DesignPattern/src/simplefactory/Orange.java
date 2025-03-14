//designpatterns.simplefactory.Orange.java
package simplefactory;

//橙子类，充当具体产品类
public class Orange implements Fruit {
	public Orange() {
		System.out.println("获得橙子树！");
	}
	
	public void display() {
		System.out.println("获得橙子！");
	}
}