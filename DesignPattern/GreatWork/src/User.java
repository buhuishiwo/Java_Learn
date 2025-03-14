import java.util.HashMap;
import java.util.Map;

class User {
    private String username;
    private String password;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public boolean authenticate(String password) {
        return this.password.equals(password);
    }
}

class UserManager {
    private Map<String, User> users = new HashMap<>();

    public void register(String username, String password) {
        if (!users.containsKey(username)) {
            users.put(username, new User(username, password));
            System.out.println("用户注册: " + username);
        } else {
            System.out.println("已存在用户: " + username);
        }
    }

    public User login(String username, String password) {
        User user = users.get(username);
        if (user != null && user.authenticate(password)) {
            System.out.println("用户登陆: " + username);
            return user;
        }
        System.out.println(username+"登录失败" );
        return null;
    }
}
