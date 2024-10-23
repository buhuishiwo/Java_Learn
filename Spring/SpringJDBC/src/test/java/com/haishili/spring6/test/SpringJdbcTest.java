package com.haishili.spring6.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class SpringJdbcTest {
    @Test
    public void test() {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring6.xml");
        JdbcTemplate jdbcTemplate = context.getBean("jdbc", JdbcTemplate.class);
        System.out.println(jdbcTemplate);
        //修改操作
        String sql = "insert into websites values(?,?,?,?,?)";
        int update = jdbcTemplate.update(sql, 1, "小米", "https://xiaomi.com", 500, "CN");
        System.out.println(update);
    }
}
