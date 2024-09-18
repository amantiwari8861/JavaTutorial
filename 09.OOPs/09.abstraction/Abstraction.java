import java.util.Scanner;

abstract class Person
{
    String name;
    long mobileNo;
    char gender;
    abstract void tellMeAboutYourself(); 
}
abstract class Employee extends Person
{
    int empId;
    double salary;
    abstract void calculateSalary(double time);
    abstract void showSalary();
}
class PermanentEmployee extends Employee
{
    // @Override error
    void deductHealthInsurancePremium()
    {
        salary-=salary*0.15;
        System.out.println("Getting health insurance of 10 Lac.");
        System.out.println("Deducting 15%("+(salary*0.15)+") of salary as health insurance premium ");
    }
    @Override
    void calculateSalary(double time)
    {
        salary=200*time*30;
    }
    @Override
    void showSalary()
    {
        System.out.println("Permanent Employee details ");
        deductHealthInsurancePremium();
        System.out.println("Salary :"+salary);
    }
    @Override
    void tellMeAboutYourself() {
    }
}
class Intern extends Employee
{
    void getTravelAllowance()
    {
        salary+=5000;
        System.out.println("getting travel allowance of 5K");
    }
    void calculateSalary(double time)
    {
        salary=50*time*30;
    }
    void showSalary()
    {
        System.out.println("Intern Details ");
        getTravelAllowance();
        System.out.println("Salary :"+salary);
    }
    @Override
    void tellMeAboutYourself() {
        
    }
}



public class Abstraction {
    public static void main(String[] args) {
        
        // PermanentEmployee p=new PermanentEmployee();

        // Employee emp=new Employee();
        // Employee emp=new PermanentEmployee();// generalization
        Employee emp=new Intern();// generalization
        emp.calculateSalary(8);
        emp.showSalary();
        // emp.deductHealthInsurancePremium();

    }
}

/**
 * Abstract classes gives 0 to 100% abstraction
 * Difference Between Concrete class and Abstract class 
 * Key Differences:
 * Instantiation:
 * Concrete classes can be instantiated, while abstract classes cannot.
 * Implementation:
 * Concrete classes provide complete implementation for all methods, while abstract classes may have abstract methods without implementation.
 * Purpose:
 * Concrete classes represent specific objects, while abstract classes define common characteristics and behaviors for a group of related classes.
 * Keyword:
 * Concrete classes do not require any special keyword, while abstract classes are declared using the abstract keyword.
 */