package type2;

public class SingletonTest02 {
    public static void main(String[] args) {
        Singleton instance = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance==instance2);
    }
}


//饿汉式（静态变量）

class Singleton {
    //构造器私有化
    private Singleton() {
    }

    private static Singleton instance;

    //在静态代码块中完成实例化
    static {
        instance = new Singleton();
    }
    public static Singleton getInstance() {
        return instance;
    }
}
