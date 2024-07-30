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
    // @Override // Annotation throw error bcz it's not overriding any superclass
    void test()
    {

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
public class _02_MethodOverriding {

    public static void main(String[] args) {
        
        PermanentEmployee pe=new PermanentEmployee();
        pe.calculateSalary(8);
        pe.showSalary();

        Intern i=new Intern();
        i.calculateSalary(12);
        i.showSalary();

        // superclass = parent class = base class 
        // subclass = child class = derived class
        // normal classes -> concrete class

        // overloading -> static polymorphism -> compile time polymorphism
        // overriding -> dynamic polymorphism -> run time polymorphism
        // Dynamic binding (pending)
    }
}