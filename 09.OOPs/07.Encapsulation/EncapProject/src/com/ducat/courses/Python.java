package com.ducat.courses;

public class Python {
    
    public double duration;
    public double fee;
    public Python(double duration, double fee) 
    {
        this.duration = duration;
        this.fee = fee;
    }
    public void showDetails()
    {
        System.out.println(" Python Details ");
        System.out.println("Duration :"+duration);
        System.out.println("Fee :"+fee);
    }
}
