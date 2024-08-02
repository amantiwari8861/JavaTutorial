package com.ducat.courses;

public class CSharp {
    
    public double duration;
    public double fee;
    public CSharp(double duration, double fee) 
    {
        this.duration = duration;
        this.fee = fee;
    }
    public void showDetails()
    {
        System.out.println(" C# Details ");
        System.out.println("Duration :"+duration);
        System.out.println("Fee :"+fee);
    }
}
