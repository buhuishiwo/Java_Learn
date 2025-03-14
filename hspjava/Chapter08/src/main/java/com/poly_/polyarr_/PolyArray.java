package com.poly_.polyarr_;

public class PolyArray {
    public static void main(String[] args) {
        Person[] people = new Person[5];
        people[0] = new Person("jack",12);
        people[1] = new Student("jane",13,99);
        people[2] = new Student("john",16,29);
        people[3] = new Teacher("jane",17,33000);
        people[4] = new Teacher("jne",18,33020);
        //Java动态绑定机制，JVM 根据实际情况调用 say 方法
        for (Person p : people) {
            System.out.println(p.say());
            if(p instanceof Student) {
                ((Student)p).study();
            } else if(p instanceof Teacher) {
                ((Teacher)p).teach();
            }
        }
    }
}
