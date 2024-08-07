class Person
{
    double height;
    void showHeight()
    {
        height=5.6;
        System.out.println("Height "+height);
    }
    void showEmpDetails()
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
    void showEmpDetails()
    {
        System.out.println("****** Employee Details ******");
        System.out.println("Id :"+id);
        System.out.println("Name :"+name);
        System.out.println("salary :"+salary);
    }
}
class PermanentEmployee extends Employee
{
    double healthInsurance;
    PermanentEmployee()
    { 
        super();// by default in every constructor
    }
    public PermanentEmployee(int id, String name, double salary, double healthInsurance) {
        super(id, name, salary);
        this.healthInsurance = healthInsurance;
        // super(id, name, salary); // error
    }

    void showPermanentEmpDetails()
    {
        super.showEmpDetails();
        super.showHeight();
        // showEmpDetails();
        System.out.println("***** Permanent Employee *******");
        System.out.println("Health Insurance :"+healthInsurance);
        System.out.println(super.name);
    }
}
public class Super {

    public static void main(String[] args) {
        
        // PermanentEmployee perEmp=new PermanentEmployee();
        
    PermanentEmployee pEmployee=new PermanentEmployee(100, "Rajat", 12000, 50000);

    pEmployee.showPermanentEmpDetails();
        
    }
}