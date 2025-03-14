import java.util.Date;

public class Person {
    private Date birthday;
    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
    public void getBirthday() {
        System.out.println(birthday.toString());
    }
    public Person() {
        System.out.println("Person 的无参构造被调用");
    }
}
