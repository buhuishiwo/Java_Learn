package SXadapter;

public class Client {
    public static void main(String[] args) {
        Dog dog1 = new ConcreteDog();
        Cat cat1 = new ConcreteCat();
        Adapter adapter = new Adapter();
        adapter.setDog(dog1);
        adapter.setCat(cat1);
        adapter.action();
        adapter.cry();
    }
}
