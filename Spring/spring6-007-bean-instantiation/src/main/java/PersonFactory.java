import org.springframework.beans.factory.FactoryBean;
import java.util.*;
public class PersonFactory implements FactoryBean<Person> {
    //PersonFactory也是一个 Bean，只不过这个 Bean 是工厂 Bean。
    //通过工厂 Bean 可以获取一个普通的 Bean
    private Date birth;
    public void setBirth(Date birth) {
        this.birth = birth;
    }
    @Override
    public Person getObject() throws Exception {
        Person person = new Person();
        person.setBirthday(birth);
        return person;
    }

    @Override
    public Class<?> getObjectType() {
        return null;
    }

    @Override
    public boolean isSingleton() {
        return FactoryBean.super.isSingleton();
    }
}
