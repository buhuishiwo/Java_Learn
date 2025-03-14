package type3;

import type2.SingletonTest02;

public class SingletonTest03 {
    public static void main(String[] args) {
        Singleton instance = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance==instance2);
    }
}


class Singleton {
    private static Singleton instance;

    private Singleton() {};

    //当调用类时，实例化。
    public static Singleton getInstance() {
        if(instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}