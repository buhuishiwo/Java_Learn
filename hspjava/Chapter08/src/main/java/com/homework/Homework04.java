package com.homework;

public class Homework04 {
    public static void main(String[] args) {
        Worker worker = new Worker(30,200,"李四");
        Manager manager = new Manager(30,300,"王五");
        System.out.println(worker.getSalary());
        System.out.println(manager.getSalary());
    }
}
class Empolyee {
    private int workday;
    private int daysalary;
    private String name;
    public Empolyee(int workday, int daysalary, String name) {
        this.workday = workday;
        this.daysalary = daysalary;
        this.name = name;
    }
    public String getSalary()
    {
        return "Name: " + name + "\nWorkday: " + workday + "\nDaySalary: " + daysalary;
    }

    public int getWorkday() {
        return workday;
    }

    public void setWorkday(int workday) {
        this.workday = workday;
    }

    public int getDaysalary() {
        return daysalary;
    }

    public void setDaysalary(int daysalary) {
        this.daysalary = daysalary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
class Manager extends Empolyee {
    public Manager(int workday, int daysalary, String name) {
        super(workday, daysalary, name);
    }
    public String getSalary() {
        return super.getSalary()+"\nSalary: " + (1000+super.getWorkday()*super.getDaysalary()*1.2);
    }
}
class Worker extends Empolyee {
    public Worker(int workday, int daysalary, String name) {
        super(workday, daysalary, name);
    }
    public String getSalary() {
        return super.getSalary()+"\nSalary: " + (super.getWorkday()*super.getDaysalary()*1.0);
    }
}
