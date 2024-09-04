package com.ducat.models;

import java.time.LocalDate;

public class Student 
{
    private int id;
    private String name;
    private double fee;
    private char gender;
    private boolean isMemExpired;
    private LocalDate dob;
    private String joining;
    private long mobileNo;
    // create table student(id int primary key auto_increment ,name varchar(50),fee float,gender char(1),mShipexpired bool,dob date,joining varchar(50),mobileNo bigint);
    public Student() {
    }
    public Student(int id, String name, double fee, char gender, boolean isMemExpired, LocalDate dob, String joining,
            long mobileNo) {
        this.id = id;
        this.name = name;
        this.fee = fee;
        this.gender = gender;
        this.isMemExpired = isMemExpired;
        this.dob = dob;
        this.joining = joining;
        this.mobileNo = mobileNo;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getFee() {
        return fee;
    }
    public void setFee(double fee) {
        this.fee = fee;
    }
    public char getGender() {
        return gender;
    }
    public void setGender(char gender) {
        this.gender = gender;
    }
    public boolean isMemExpired() {
        return isMemExpired;
    }
    public void setMemExpired(boolean isMemExpired) {
        this.isMemExpired = isMemExpired;
    }
    public LocalDate getDob() {
        return dob;
    }
    public void setDob(LocalDate dob) {
        this.dob = dob;
    }
    public String getJoining() {
        return joining;
    }
    public void setJoining(String joining) {
        this.joining = joining;
    }
    public long getMobileNo() {
        return mobileNo;
    }
    public void setMobileNo(long mobileNo) {
        this.mobileNo = mobileNo;
    }
    @Override
    public String toString() {
        return "Student [id=" + id + ", name=" + name + ", fee=" + fee + ", gender=" + gender + ", isMemExpired="
                + isMemExpired + ", dob=" + dob + ", joining=" + joining + ", mobileNo=" + mobileNo + "]";
    }    
}
