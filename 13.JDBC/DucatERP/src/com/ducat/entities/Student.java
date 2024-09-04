package com.ducat.entities;

import java.time.LocalDate;

public class Student {
    
    private int stuId;
    private String stuName;
    private LocalDate dob;
    private boolean isMembershipExpired;
    private long phoneNo;
    private char gender;
    private double fee;
//    create table student(stuId int primary key auto_increrment,name varchar(50),dob LocalDate,ismembershipexpired bool,phone bigint,gender char(1),fee double);
    public Student() {
    }

    public Student(int stuId, String stuName, LocalDate dob, boolean isMembershipExpired, long phoneNo, char gender, double fee) {
        this.stuId = stuId;
        this.stuName = stuName;
        this.dob = dob;
        this.isMembershipExpired = isMembershipExpired;
        this.phoneNo = phoneNo;
        this.gender = gender;
        this.fee = fee;
    }
    
    public int getStuId() {
        return stuId;
    }

    public void setStuId(int stuId) {
        this.stuId = stuId;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public boolean isIsMembershipExpired() {
        return isMembershipExpired;
    }

    public void setIsMembershipExpired(boolean isMembershipExpired) {
        this.isMembershipExpired = isMembershipExpired;
    }

    public long getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(long phoneNo) {
        this.phoneNo = phoneNo;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public double getFee() {
        return fee;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }

    @Override
    public String toString() {
        return "Student{" + "stuId=" + stuId + ", stuName=" + stuName + ", dob=" + dob + ", isMembershipExpired=" + isMembershipExpired + ", phoneNo=" + phoneNo + ", gender=" + gender + ", fee=" + fee + '}';
    }
}
