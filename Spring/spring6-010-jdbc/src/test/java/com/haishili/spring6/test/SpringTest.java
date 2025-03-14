package com.haishili.spring6.test;


import com.haishili.spring6.bean.Spring6Config;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class SpringTest {
    @Test
    public void addTest() {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Spring6Config.class);
        JdbcTemplate jdbcTemplate = applicationContext.getBean("jdbcTemplate", JdbcTemplate.class);
        String sql = "insert into websites(id, name,url,alexa,country) values(?,?,?,?,?)";
        int count = jdbcTemplate.update(sql,5,"vivo","https://www.baidu.com",1010,"CN");
        System.out.println(count);
    }

    @Test
    public void deleteTest() {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Spring6Config.class);
        JdbcTemplate jdbcTemplate = applicationContext.getBean("jdbcTemplate", JdbcTemplate.class);
        String sql = "delete from websites where id = 1";
        int count = jdbcTemplate.update(sql);
        System.out.println(count);
    }

    @Test
    public void updateTest() {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Spring6Config.class);
        JdbcTemplate jdbcTemplate = applicationContext.getBean("jdbcTemplate", JdbcTemplate.class);
        String sql = "update websites set name = ?,url = ?,alexa = ?,country = ? where id = ?";
        int count = jdbcTemplate.update(sql,"OPPO","https://www.baidu.com",1010,"CN",4);
        System.out.println(count);
    }

    @Test
    public void queryTest() {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Spring6Config.class);
        JdbcTemplate jdbcTemplate = applicationContext.getBean("jdbcTemplate", JdbcTemplate.class);
        
    }

    @Test
    public void test() {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Spring6Config.class);
        JdbcTemplate jdbcTemplate = applicationContext.getBean("jdbcTemplate", JdbcTemplate.class);
        System.out.println(jdbcTemplate);
    }
}
