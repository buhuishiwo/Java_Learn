public class ConfigurationManager {
    // 单例实例
    private static ConfigurationManager instance;

    // 私有构造方法，防止外部实例化
    private ConfigurationManager() {}

    // 获取单例实例的方法
    public static synchronized ConfigurationManager getInstance() {
        if (instance == null) {
            instance = new ConfigurationManager();
        }
        return instance;
    }

    // 示例方法，加载配置
    public void loadConfiguration() {
        System.out.println("加载配置项......");
    }

    // 示例方法，获取配置
    public void getConfiguration() {
        System.out.println("获取配置项......");
    }
}
