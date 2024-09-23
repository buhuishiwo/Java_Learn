class Doubleton {
    // 私有静态实例列表，最多存储两个实例
    private static Doubleton[] instances = new Doubleton[2];
    private static int counter = 0;

    // 私有构造函数，防止外部实例化
    private Doubleton() {
        System.out.println("Instance created");
    }

    // 公有的静态方法来获取实例
    public static Doubleton getInstance() {
        if (instances[0] == null) {
            instances[0] = new Doubleton();
        }
        if (instances[1] == null) {
            instances[1] = new Doubleton();
        }

        // 返回两个实例中的一个，并以轮询的方式交替返回
        Doubleton instance = instances[counter];
        counter = (counter + 1) % 2;
        return instance;
    }

    public void showMessage() {
        System.out.println("Hello from instance " + (counter == 0 ? 2 : 1));
    }

    public static void main(String[] args) {
        Doubleton instance1 = Doubleton.getInstance();
        instance1.showMessage(); // Hello from instance 1

        Doubleton instance2 = Doubleton.getInstance();
        instance2.showMessage(); // Hello from instance 2

        Doubleton instance3 = Doubleton.getInstance();
        instance3.showMessage(); // Hello from instance 1 again

        // 输出验证两个实例的轮询返回
        System.out.println(instance1 == instance3); // true
        System.out.println(instance1 == instance2); // false
    }
}
