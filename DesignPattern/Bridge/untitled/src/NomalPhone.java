public class NomalPhone extends Phone{
    public NomalPhone(Brand brand) {
        super(brand);
    }

    public void open() {
        super.open();
        System.out.println("普通手机");
    }
    public void close() {
        super.close();
        System.out.println("普通手机");
    }
    public void call() {
        super.call();
        System.out.println("普通手机");
    }
}
