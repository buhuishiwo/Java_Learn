package com.method;

public class Monkey {
    public static void main(String[] args) {
        Eat eat = new Eat();
        System.out.println(eat.eat(1));
    }
}

class Eat {
    public int eat(int day) {
        if(day == 10) {
            return 1;
        } else if (day>=1 &&day<=9) {
            return (eat(day+1)+1)*2;
        }else {
            return -1;
        }
    }
}
