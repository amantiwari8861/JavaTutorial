class Person
{
    double height;
    Person(){
        height=5.6;
    }
    void showHeight()
    {
        System.out.println("Height "+height);
    }
    void showDetails()
    {
        System.out.println("****** Person Details ******");
        System.out.println("Height "+height);
    }
}
class Employee extends Person
{
    int id;
    String name;
    double salary;
    public Employee() {
        System.out.println("Employee createds");
    }
    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
    void showDetails()
    {
        System.out.println("****** Employee Details ******");
        System.out.println("Id :"+id);
        System.out.println("Name :"+name);
        System.out.println("salary :"+salary);
    }
    void callParentShowDetails()
    {
        // parent class = super class = base class
        // child class = sub class = derived class
        super.showDetails();
    }
}
class PermanentEmployee extends Employee
{
    double healthInsurancePremium;
    PermanentEmployee()
    { 
        super();// by default in every constructor
    }
    public PermanentEmployee(int id, String name, double salary, double healthInsurancePremium) {
        super(id, name, salary);
        // this.id = id;
        // this.name = name;
        // this.salary = salary;
        this.healthInsurancePremium = healthInsurancePremium;
        // super(id, name, salary); // error
    }
    void showPermanentEmpDetails()
    {
        super.showHeight();
        showDetails();
        super.showDetails();
        System.out.println("***** Permanent Employee *******");
        System.out.println("Health Insurance :"+healthInsurancePremium);
        System.out.println(super.name);
    }
}
public class Super {

    public static void main(String[] args) {
        
        // Employee emp=new Employee(18353, "Ashutosh", 12000);
        // emp.showDetails();
        // emp.callParentShowDetails();

    // PermanentEmployee perEmp=new PermanentEmployee();
    PermanentEmployee pEmployee=new PermanentEmployee(18050, "Rajat", 12000, 50000);
    pEmployee.showPermanentEmpDetails();
        
    }
}