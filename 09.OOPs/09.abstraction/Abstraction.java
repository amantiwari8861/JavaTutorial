import java.util.Scanner;

abstract class Employee
{
    double salary;
    abstract void calculateSalary(double time);

}
class PermanentEmployee extends Employee
{
    void deductHealthInsurancePremium()
    {
        salary-=salary*0.15;
        System.out.println("Getting health insurance of 10 Lac.");
        System.out.println("Deducting 15%("+(salary*0.15)+") of salary as health insurance premium ");
    }
    void calculateSalary(double time)
    {
        salary=200*time*30;
    }
    void showSalary()
    {
        System.out.println("Permanent Employee details ");
        deductHealthInsurancePremium();
        System.out.println("Salary :"+salary);
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
}



public class Abstraction {

    public static void main(String[] args) {
        
        PermanentEmployee p=new PermanentEmployee();

    }
}