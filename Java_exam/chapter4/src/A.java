public class A {
    static int m;
    static void f(){
        m=200;
        System.out.println(m);
    }
}
class B extends A{
    static void f(){
        m=222;
        System.out.println(m);
    }

}

class Test{
    public static void main(String[] args) {
//        B b = new B();
        B.f();
        A.f();
    }
}