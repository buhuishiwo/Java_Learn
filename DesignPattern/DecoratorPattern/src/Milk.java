public class Milk extends Decorator{
    public Milk(Drink drink) {
        super(drink);
        setDes("Milk");
        setPrice(2.0f);
    }
}
