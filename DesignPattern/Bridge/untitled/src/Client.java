public class Client {
    public static void main(String[] args) {
        FoldedPhone foldedPhone = new FoldedPhone(new Xiaomi());
        foldedPhone.open();
        NomalPhone nomalPhone = new NomalPhone(new Apple());
        nomalPhone.close();
    }
}
