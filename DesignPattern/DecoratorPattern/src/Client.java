public class Client {
    public static void main(String[] args) {
        Drink order = new LongBlack();
        order = new Soy(order);
        System.out.println("费用"+order.cost());
        System.out.println("描述="+order.getDes());
    }
}
