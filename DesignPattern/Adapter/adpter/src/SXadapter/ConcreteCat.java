package SXadapter;

public class ConcreteCat implements Cat{
    @Override
    public void meow() {
        System.out.println("喵喵喵喵喵");
    }

    @Override
    public void catchMouse() {
        System.out.println("猫抓耗子");
    }
}
