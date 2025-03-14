import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest {
    @Test
    public void test() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring6.xml");
        Gun gunBean = applicationContext.getBean("gunBean", Gun.class);

    }
    @Test
    public void test2() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring6.xml");
        Person personBean = applicationContext.getBean("personBean", Person.class);
        personBean.getBirthday();
    }
}
