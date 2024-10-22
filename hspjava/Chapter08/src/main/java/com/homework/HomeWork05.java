package com.homework;

public class HomeWork05 {
    public static void main(String[] args) {
        Doctor doctor = new Doctor(20,"张三","女","护士",3000);
        Doctor doctor1 = new Doctor(20,"张三","女","护士",3000);
        Doctor doctor2 = new Doctor(21,"王五","男","医生",5000);
        System.out.println(doctor.equals(doctor2));
        System.out.println(doctor.equals(doctor1));
        System.out.println(doctor1 == doctor);
        System.out.println(doctor == doctor2);
        System.out.println(doctor2 == doctor1);
    }
}
class Doctor {
    private int age;
    private String name;
    private String gender;
    private String job;
    private int salary;
    public Doctor(int age, String name, String gender, String job, int salary) {
        this.age = age;
        this.name = name;
        this.gender = gender;
        this.job = job;
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) {
            return true;
        }else{
            if(obj instanceof Doctor) {
                Doctor doctor = (Doctor) obj;
                return this.age == doctor.age && this.name.equals(doctor.name) && this.gender.equals(doctor.gender) && this.job.equals(doctor.job) && this.salary == doctor.salary;
            }
        }
        return false;
    }
}
