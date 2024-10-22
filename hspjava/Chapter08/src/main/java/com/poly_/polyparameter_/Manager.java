package com.poly_.polyparameter_;

public class Manager extends Employee{
    private double bonus;

    public Manager(String name, double salary, double bonus) {
        super(name, salary);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public void manage() {
        System.out.println("Employee managed.");
    }

    @Override
    public String getAnnualSalary() {
        return "经理："+super.getName()+"的年薪是："+super.getAnnualSalary();
    }
}
