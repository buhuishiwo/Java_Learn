package com.test01;

public class Test01 {
    public Test01()
    {}
//    public String name;
//    public int age;
//    static void Hello(String name)
//    {
//        //public int birthday   方法中不允许使用 public 等访问修饰符修饰
//        int age;
//        System.out.println(age);    //局部变量没有默认值，直接输出会报错。
//    }
//    static void Hello (int age)
//    {
//        System.out.println(age);
//        this.age;
//    }
    int x;
    static int y;       //静态成员属于类本身
    void showXY()
    {
        System.out.printf("%d,%d\n",x,y);
    }
    static void showY(){
        System.out.printf("%d\n",y);
    }
//    void Test01()
//    {
//        System.out.println("ok");
//    }
//    Test01(int b){
//        System.out.println("nihao");
//    }
}

class Tom{
    public static void main(String[] args) {
        Test01.y=100;
        Test01 cat = new Test01();
        cat.x=100;
        cat.y=200;      //不推荐将静态成员用实例调用。
//        Test01.x=300; 非静态变量不能直接使用类名调用。
        cat.showXY();
        Test01.showY();
    }
}