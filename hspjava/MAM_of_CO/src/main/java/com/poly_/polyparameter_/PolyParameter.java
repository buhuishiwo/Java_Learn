package com.poly_.polyparameter_;

public class PolyParameter {
    public void showEmpAnnal(Employee e) {
        System.out.println(e.getAnnualSalary());
    }
    public void testWork(Employee e) {
        if(e instanceof Manager) {
            ((Manager) e).manage();
        } else if(e instanceof Worker) {
            ((Worker) e).work();
        } else{
            System.out.println("Employee is not manager or worker !");
        }
    }
    public static void main(String[] args) {
        Employee employee = new Manager("张三",6000,500);
        Employee employee1 = new Worker("王五",4000);
        System.out.println(employee1.getAnnualSalary());
        System.out.println(employee.getAnnualSalary());
        PolyParameter polyParameter = new PolyParameter();
        polyParameter.showEmpAnnal(employee);
        polyParameter.showEmpAnnal(employee1);
        polyParameter.testWork(employee);
        polyParameter.testWork(employee1);
    }
}
