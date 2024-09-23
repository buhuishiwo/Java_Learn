import java.util.Map;

public class OnlineLearningManagementSystem {
    private UserManager userManager = new UserManager();
    private CourseManager courseManager = new CourseManager();
    private LearningRecordManager learningRecordManager = new LearningRecordManager();

    public void registerUser(String username, String password) {
        userManager.register(username, password);
        learningRecordManager.createRecord(username);
    }

    public User loginUser(String username, String password) {
        return userManager.login(username, password);
    }

    public void addCourse(CourseFactory factory) {
        courseManager.addCourse(factory);
    }

    public void updateLearningProgress(String username, String courseName, String status) {
        learningRecordManager.updateProgress(username, courseName, status);
    }

    public void showCourses() {
        for (Course course : courseManager.getCourses()) {
            System.out.println(course.getCourseName());
        }
    }

    public void showLearningProgress(String username) {
        LearningRecord record = learningRecordManager.getRecord(username);
        if (record != null) {
            for (Map.Entry<String, String> entry : record.getProgress().entrySet()) {
                System.out.println("课程: " + entry.getKey() + ", 状态: " + entry.getValue());
            }
        }
    }

    public static void main(String[] args) {
        // 配置管理示例
        ConfigurationManager configManager = ConfigurationManager.getInstance();
        configManager.loadConfiguration();
        configManager.getConfiguration();

        // 在线学习管理系统示例
        OnlineLearningManagementSystem olms = new OnlineLearningManagementSystem();

        // 注册用户
        olms.registerUser("张三", "password123");
        olms.registerUser("李四", "password456");

        // 用户登录
        User john = olms.loginUser("张三", "password123");
        User jane = olms.loginUser("李四", "password456");

        // 添加课程
        olms.addCourse(new ProgrammingCourseFactory());
        olms.addCourse(new MathCourseFactory());

        // 显示课程
        System.out.println("可用课程：");
        olms.showCourses();

        // 更新学习进度
        olms.updateLearningProgress("张三", "编程", "已完成");
        olms.updateLearningProgress("李四", "数学", "进行中");

        // 显示学习进度
        System.out.println("张三的课程");
        olms.showLearningProgress("张三");

        System.out.println("李四的课程");
        olms.showLearningProgress("李四");
    }
}
