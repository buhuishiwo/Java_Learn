package com.poly_.polyarr_;


public class Teacher extends Person {
    private int selary;

    public Teacher(String name, int age, int selary) {
        super(name, age);
        this.selary = selary;
    }

    public int getSelary() {
        return selary;
    }

    public void setSelary(int selary) {
        this.selary = selary;
    }

    @Override
    public String say() {
        return super.say()+"Salary: "+getSelary();
    }

    public void teach() {
        System.out.println("Teacher: "+ super.getName()+" is teaching");
    }
}
