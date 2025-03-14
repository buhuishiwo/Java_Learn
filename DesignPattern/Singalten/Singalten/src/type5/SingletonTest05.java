package type5;

public class SingletonTest05 {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
        System.out.println(singleton2 == singleton);
    }


}

class Singleton {
    private static volatile Singleton singleton;
    private Singleton() {};
    public static Singleton getInstance() {
        if (singleton == null){
            synchronized (Singleton.class) {
                if(singleton == null) {
                    singleton = new Singleton();
                }
            }
        }
        return singleton;
    }
}
