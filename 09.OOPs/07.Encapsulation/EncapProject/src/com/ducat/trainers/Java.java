package com.ducat.trainers;

public class Java {
    
    public double duration;
    public double fee;
    public Java(double duration, double fee) 
    {
        this.duration = duration;
        this.fee = fee;
    }
    public void showDetails()
    {
        System.out.println(" Java Details according to trainer ");
        System.out.println("Duration :"+duration);
        System.out.println("Fee :"+fee);
    }
}
