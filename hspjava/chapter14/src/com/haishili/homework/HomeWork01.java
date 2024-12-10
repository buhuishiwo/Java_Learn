package com.haishili.homework;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HomeWork01 {
    @Test
    public void saveTest() {
        Dao<User> dao = new Dao<>();
        dao.save("no1",new User("张三",20));
        System.out.println(dao.get("no1"));
    }
    @Test
    public void listTest() {
        Dao<User> dao = new Dao<>();
        dao.save("no1",new User("jack",22));
        dao.save("no2",new User("john",23));
        System.out.println(dao.list());
    }
}



class Dao<T> {
    Map<String , T> map = new HashMap<>();

    public void save(String id ,T entity) {
        map.put(id , entity);
    }
    public T get(String id) {
        return map.get(id);
    }
    public void update(String id , T entity) {
        map.put(id , entity);
    }
    public List<T> list() {
        return new ArrayList<T>(map.values());
    }
    public void delete(String id) {
        map.remove(id);
    }
}

class User {
    private String name;
    private int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
