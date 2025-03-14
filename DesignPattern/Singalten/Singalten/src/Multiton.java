import java.util.HashMap;
import java.util.Map;

public class Multiton {
    private static final int MAX_INSTANCES = 3;
    private static final Map<String, Multiton> instances = new HashMap<>();
    private String value;

    private Multiton(String value) {
        this.value = value;
    }

    public static Multiton getInstance(String key, String value) {
        if (instances.containsKey(key)) {
            return instances.get(key);
        }

        if (instances.size() >= MAX_INSTANCES) {
            throw new RuntimeException("Cannot create more instances");
        }

        Multiton instance = new Multiton(value);
        instances.put(key, instance);
        return instance;
    }

    public static Multiton getInstance(String key) {
        return instances.get(key);
    }

    public static Map<String, Multiton> getAllInstances() {
        return instances;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public static void main(String[] args) {
        try {
            Multiton instance1 = Multiton.getInstance("one", "First Instance");
            System.out.println("Instance 1: key=one, value=" + instance1.getValue());

            Multiton instance2 = Multiton.getInstance("two", "Second Instance");
            System.out.println("Instance 2: key=two, value=" + instance2.getValue());

            Multiton instance3 = Multiton.getInstance("three", "Third Instance");
            System.out.println("Instance 3: key=three, value=" + instance3.getValue());

            // 尝试创建第四个实例
            Multiton instance4 = Multiton.getInstance("four", "Fourth Instance");
            System.out.println("Instance 4: key=four, value=" + instance4.getValue());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
