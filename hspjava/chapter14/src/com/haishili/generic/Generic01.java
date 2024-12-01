package com.haishili.generic;

public class Generic01 {
    public static void main(String[] args) {
        Person<Integer> integerPerson = new Person<>(123);
        System.out.println(integerPerson.getS());
    }
}

//泛型的作用可以是：可以在类声明时通过一个标识表示类中某个属性的类型
//或者是某个方法的返回值的类型，或者是参数类型

class Person<E> {
    E s;    //E表示 s 的数据类型，该数据类型在定义 Person 对象的时候指定，即在编译期间，就确定 E 是什么类型
    public Person(E s) {
        this.s = s;
    }
    public E getS() {
        return s;
    }
}
