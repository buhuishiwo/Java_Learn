package com.haishili.inner;

public class InnerClass01 {
    public static void main(String[] args) {
        Outer outer = new Outer();
        Outer.Inner inner = outer.new Inner();
        inner.print();
    }
}

//类五大成员：属性、方法、构造器、代码块、内部类
class Outer {
    private int a = 100;
    //局部内部类
     class Inner {
        private int a = 300;
        public void print() {
            //如果内部类成员与外部类重名，按照就近原则调用，也可以使用*外部类名.this.成员名*调用
            System.out.println(a+" "+Outer.this.a+" "+" "+Other.a);
        }
    }

}

class Other{
    public static int a = 400;
}