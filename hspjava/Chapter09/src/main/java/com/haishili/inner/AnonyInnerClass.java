package com.haishili.inner;

public class AnonyInnerClass {
    public static void main(String[] args) {
        Person person = new Person();
        person.method();
        Animal animal = new Animal();
        animal.tig.cry();
    }
}

class Person {
    private String name;
    public void method() {
        //实际上是 Person$1 implements IA {}
        IA tiger = new IA() {
            @Override
            public void cry() {
                System.out.println("叫唤");
            }
        };
        tiger.cry();
    }

}
class Animal {
    private String name;
    IA tig =  new IA() {
        @Override
        public void cry() {
            System.out.println("老虎叫唤");
        }
    };
}
interface IA {
    public void cry();
}