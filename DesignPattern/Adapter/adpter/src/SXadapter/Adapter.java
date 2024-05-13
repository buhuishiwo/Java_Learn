package SXadapter;

public class Adapter implements Dog,Cat{
    private Cat cat;

    public Cat getCat() {
        return cat;
    }

    public void setCat(Cat cat) {
        this.cat = cat;
    }

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }

    private Dog dog;

    @Override
    public void braking() {
        System.out.println("狺狺狂吠");
    }
    public void cry() {
        System.out.println("猫学");
        dog.braking();
    }
    @Override
    public void meow() {
        System.out.println("喵喵喵喵喵");
    }

    @Override
    public void catchMouse() {
        System.out.println("抓老鼠");
    }
    public void action() {
        System.out.println("狗学");
        cat.catchMouse();
    }
}
