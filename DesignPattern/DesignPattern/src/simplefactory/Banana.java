//designpatterns.simplefactory.Banana.java
package simplefactory;

//香蕉类，充当具体产品类
public class Banana implements Fruit {
	public Banana() {
		System.out.println("获得香蕉树！");
	}
	
	public void display() {
		System.out.println("获得香蕉！");
	}
}