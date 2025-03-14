package order;

public class PizzaStore {
    public static void main(String[] args) {
        //使用简单工厂模式
        new OrderPizza(new SimpleFactory());
        System.out.println("~~退出程序~~");
    }
}
