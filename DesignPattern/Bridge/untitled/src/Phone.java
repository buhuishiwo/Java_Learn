public abstract class Phone {

    private Brand brand;

    //构造器
    public Phone(Brand brand) {
        this.brand = brand;
    }

    protected void open() {
        this.brand.open();
    }
    protected void close() {
        this.brand.close();
    }
    protected void call() {
        this.brand.call();
    }

}
