package com.ducat.trainers;

public class Trainer1 {
    
    private String name;
    private long mobileNo;
    private double salary;
    private int age;

    public Trainer1() {
    }

    public void setAge(int age) //setter or mutator
    {
        if (age<0) {
            return;
        }
        this.age=age;
    }
    public int getAge() // getter or accesor
    {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(long mobileNo) {
        this.mobileNo = mobileNo;
    }

    // public double getSalary() {
    //     return salary;
    // }

    // public void setSalary(double salary) {
    //     this.salary = salary;
    // }

    
}
