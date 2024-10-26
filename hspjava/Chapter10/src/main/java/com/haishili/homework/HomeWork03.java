package com.haishili.homework;

public class HomeWork03 {
    public static void main(String[] args) {
        A a = new A();
        a.setName("zhangsan");
        A.B b = a.new B();
        b.show();
    }
}

class A {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    class B {
        private final String name = "展会 Sam";

        public void show() {
            System.out.println(name);
            System.out.println(A.this.name);
        }
    }
}
