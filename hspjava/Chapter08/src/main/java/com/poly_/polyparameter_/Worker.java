package com.poly_.polyparameter_;

public class Worker extends Employee{
    public Worker(String name, double salary) {
        super(name, salary);
    }

    @Override
    public String getAnnualSalary() {
        return "员工："+super.getName()+"的年薪是："+super.getAnnualSalary();
    }

    public void work() {
        System.out.println("Working " + getName());
    }
}
