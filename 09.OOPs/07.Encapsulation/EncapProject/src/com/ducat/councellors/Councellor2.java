package com.ducat.councellors;

public class Councellor2 
{
    public String name;
    long mobileNo; // default
    private double salary;
    protected int cabinNo;

    public Councellor2()
    {
        name="Neetu Ma'am";
        mobileNo=123456789123L;
        salary=80000;
        cabinNo=1;
    }
    public void tellDeepikaMamNo()
    {
        // System.out.println(new Councellor1().salary);
        System.out.println(new Councellor1().cabinNo);
        System.out.println("Deepika ma'am No :"+new Councellor1().mobileNo);
    }
}