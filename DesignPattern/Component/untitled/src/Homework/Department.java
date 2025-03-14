package Homework;

public class Department extends Organization {
    public Department(String name) {
        super(name);
    }
    public String getName() {
        return super.getName();
    }
    public void display() {
        System.out.println(getName());
    }
}
