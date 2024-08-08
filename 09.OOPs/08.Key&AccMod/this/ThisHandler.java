import java.time.LocalDate;

class Employee {
    int id;
    String name;
    double salary;
    LocalDate dob;
    String company;

    Employee() {
        System.out.println("Default constructor");
        company = "Ducat";
    }

    Employee(int id, String name, double salary) {
        this();
        System.out.println("3 parameterized constructor");
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    Employee(int id, String name, double salary, LocalDate dob) {
        this(id, name, salary);
        System.out.println("4 parameterized const.");
        this.dob = dob;
        showDetails();
        // this.showDetails();
    }

    void showDetails() {
        System.out.println("********* Employee Details *********");
        System.out.println("id :" + id);
        System.out.println("name :" + name);
        System.out.println("salary :" + salary);
        System.out.println("dob :" + dob);
        System.out.println("company :" + company);
    }

}

public class ThisHandler {
    public static void main(String[] args) {

        // Employee emp=new Employee();

        // Employee emp2 = new Employee(100, "Prachi", 12000);
        Employee emp2 = new Employee(100, "Prachi", 12000, LocalDate.of(1996, 8, 8));
    }
}