package type1;

public class SingletonTest01 {
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

    private final static Singleton instance = new Singleton();

    public static Singleton getInstance() {
        return instance;
    }
}
