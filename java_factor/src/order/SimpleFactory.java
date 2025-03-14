package order;

import pizzafactor1.Cheesepizza;
import pizzafactor1.Greekpizza;
import pizzafactor1.Pepperpizza;
import pizzafactor1.Pizza;

//简单工厂类
public class SimpleFactory {
    //根据 orderType返回对应的 Pizza 对象
    public Pizza createPizza(String orderType){

        Pizza pizza = null;

        System.out.println("使用简单工厂模式");
        if(orderType.equals("greek")){
            pizza = new Greekpizza();
            pizza.setName("希腊披萨");
        }else if(orderType.equals("cheese")){
            pizza = new Cheesepizza();
            pizza.setName("奶酪披萨");
        } else if (orderType.equals("pepper")) {
            pizza = new Pepperpizza();
            pizza.setName("胡椒披萨");
        }
        return pizza;
    }
}
