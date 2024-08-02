package com.ducat.management;

import com.ducat.councellors.Councellor1;

public class Receptionist extends Councellor1
{
    public void showDeepikaMaamDetails()
    {
        Councellor1 c1=new Councellor1();
        System.out.println("Deepika Ma'am's Details ");
        System.out.println(c1.name);
        // System.out.println(c1.cabinNo);// why ?
        System.out.println(super.cabinNo);
        // System.out.println(super.mobileNo);
        // System.out.println(c1.mobileNo);
        // System.out.println(c1.salary);
    }
}
