import java.util.Scanner;

class Student {
    int id;
    String name;
    char gender;
    double fee;
    long phoneNo;
    String institute;

    Student() {
        System.out.println("default called ");
        institute = "Ducat Gurugram";
    }

    Student(int i, String n, char gen, double f, long ph) 
    {
        this();// calling default constructor from parameterized constructor
        System.out.println("parameterized called");
        id = i;
        name = n;
        gender = gen;
        fee = f;
        phoneNo = ph;
    }

    void showStudentDetails() {
        System.out.println("**************** Student Details **************");
        System.out.println("id :" + id);
        System.out.println("name :" + name);
        System.out.println("gender :" + gender);
        System.out.println("fee :" + fee);
        System.out.println("phoneNo :" + phoneNo);
        System.out.println("institute :" + institute);
    }
}

public class InputMethod3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Student  Details ");
        System.out.print("enter id :");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.print("enter name :");
        String name = sc.nextLine();
        System.out.print("enter gender :");
        char gender = sc.next().charAt(0);
        System.out.print("enter fee :");
        double fee = sc.nextDouble();
        System.out.print("enter phoneNo :");
        long phoneNo = sc.nextLong();

        Student tempStudent = new Student(id, name, gender, fee, phoneNo);
        tempStudent.showStudentDetails();

        new Student(id, name, gender, fee, phoneNo).showStudentDetails();

        sc.close();
    }
}