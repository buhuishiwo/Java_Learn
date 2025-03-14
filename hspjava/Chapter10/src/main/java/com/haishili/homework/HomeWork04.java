package com.haishili.homework;

public class HomeWork04 {
    public static void main(String[] args) {
        AA aa = new AA("张三");
    }
}

class AA {
    private String name;
    public AA(String name) {
        this.name = name;
        class BB {
            private String name;
            public BB(String name) {
                this.name = name;
            }
            public void show() {
                System.out.println(this.name);
                System.out.println(AA.this.name);
            }
        }
        BB bb = new BB("BB");
        bb.show();
    }
}
