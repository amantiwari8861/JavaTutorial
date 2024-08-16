interface SalariedEmp {
    double WORKING_HOUR = 9.5;
    double withdrawSalary();
    double withdrawPerdayAmount(double time);
}
interface OfficeWork {
    void doTask();
}
abstract class Employee {
    int id;
    String name;
    abstract void showSalary();
}

class Intern extends Employee implements SalariedEmp, OfficeWork {
    double chargePerHour;

    public Intern() {
        chargePerHour = 50;
    }

    @Override
    public void doTask() {
        System.out.println("I will do coding " + WORKING_HOUR + " hours");
    }

    @Override
    public double withdrawSalary() {
        return chargePerHour * WORKING_HOUR * 30;
    }

    @Override
    public double withdrawPerdayAmount(double time) {
        return WORKING_HOUR * chargePerHour;
    }

    @Override
    void showSalary() {
        System.out.println("Salary is :" + withdrawSalary());
    }
}

public class Multiple {
    public static void main(String[] args) {

        // Cat
        // lion tiger
        // liger

        // class extends class
        // class implements interface
        // interface extends interface
        // interface can't extend or implement class

        SalariedEmp emp = new Intern();
        System.out.println(emp.withdrawPerdayAmount(8));
        System.out.println(emp.withdrawSalary());

        OfficeWork of = new Intern();
        of.doTask();

        Employee employee = new Intern();

        Intern i = new Intern();
        i.showSalary();

    }
}
