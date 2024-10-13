package com.poly_.polyarr_;


public class Student extends Person {
    private int score;

    public Student(String name, int age, int score) {
        super(name, age);
        this.score = score;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public String say() {
        return super.say()+"Score: "+score;
    }

    public void study() {
        System.out.println("Student: "+super.getName()+" is studying.");
    }
}
