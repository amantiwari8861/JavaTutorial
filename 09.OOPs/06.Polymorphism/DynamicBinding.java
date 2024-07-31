import java.util.Scanner;

class Employee
{
    double salary;
    void calculateSalary(double time)
    {
        salary=100*time*30;
    }
    void showSalary()
    {
        System.out.println("Showing Employee Salary");
        System.out.println("Salary :"+salary);
    }
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
    @Override
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
public class DynamicBinding {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the profile:");
        String profile=sc.nextLine();

        Employee emp=null;
        if (profile.equalsIgnoreCase("intern")) 
            emp=new Intern();
        else if(profile.equalsIgnoreCase("permanent"))
            emp=new PermanentEmployee();
        else
            emp=new Employee();

        System.out.print("how many hours u worked :");
        emp.calculateSalary(sc.nextDouble());
        emp.showSalary();
        // emp.getTravelAllowance();
        // emp.deductHealthInsurancePremium();

        sc.close();
    }
}