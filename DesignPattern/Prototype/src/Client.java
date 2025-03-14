public class Client {
    public static void main(String[] args) {
        Sheep sheep = new Sheep("tom",1,"white");
        Sheep sheep1 = (Sheep)sheep.clone();
        Sheep sheep2 = (Sheep)sheep.clone();
        Sheep sheep3 = (Sheep)sheep.clone();
        Sheep sheep4 = (Sheep)sheep.clone();
        Sheep sheep5 = (Sheep)sheep.clone();
        System.out.println(sheep1);
        System.out.println(sheep2);
        System.out.println(sheep3);
    }
}
