import java.util.Scanner;

class Student {
    int id;
    String name;
    char gender;
    double fee;
    long phoneNo;
    String institute;

    Student() {
        institute = "Ducat Gurugram";
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

    void inputStudentDetails() 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Student Details ");
        System.out.print("enter id :");
        id = sc.nextInt();
        sc.nextLine();
        System.out.print("enter name :");
        name = sc.nextLine();
        System.out.print("enter gender :");
        gender = sc.next().charAt(0);
        System.out.print("enter fee :");
        fee = sc.nextDouble();
        System.out.print("enter phoneNo :");
        phoneNo = sc.nextLong();
    }
}

public class InputMethod2 {

    public static void main(String[] args) {

        Student student=new Student();
        student.inputStudentDetails();
        student.showStudentDetails();

        Student student2=new Student();
        student2.inputStudentDetails();
        student2.showStudentDetails();


    }
}