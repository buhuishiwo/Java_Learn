package com.homework;

public class Homework03 {

    public static void main(String[] args) {
        Teacher t1 = new Professor("jack",25,"教授",13000);
        Teacher t2 = new AssociateProfessor("Amy",30,"副教授",13000);
        Teacher t3 = new Instructor("John",18,"讲师",13000);
        System.out.println(t1.introduce());
        System.out.println(t2.introduce());
        System.out.println(t3.introduce());

    }
}
class Teacher {
    private String name;
    private int age;
    private String post;
    private double salary;
    public Teacher(String name, int age, String post, double salary) {
        this.name = name;
        this.age = age;
        this.post = post;
        this.salary = salary;
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
    public String getPost() {
        return post;
    }
    public void setPost(String post) {
        this.post = post;
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String introduce() {
        return "\nName: "+name+"\nAge: "+age+"\nPost: "+post;
    }
}
class Professor extends Teacher{
    public Professor(String name, int age, String post, double salary) {
        super(name, age, post, salary);
    }
    public String introduce() {
       return super.introduce() + "\nSalary: " + super.getSalary()*1.3;
    }
}
class AssociateProfessor extends Teacher {
    public AssociateProfessor(String name, int age, String post, double salary) {
        super(name, age, post, salary);
    }
    public String introduce() {
        return super.introduce() + "\nSalary: " + super.getSalary()*1.2;
    }
}
class Instructor extends Teacher {
    public Instructor(String name, int age, String post, double salary) {
        super(name, age, post, salary);
    }
    public String introduce() {
        return super.introduce() + "\nSalary: " + super.getSalary()*1.1;
    }
}