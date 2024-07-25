import java.util.Scanner;

class Student
{
    int id;
    String name;
    char gender;
    double fee;
    long phoneNo;
    String institute;
    Student()
    {
        institute="Ducat Gurugram";
    }
    void showStudentDetails()
    {
        System.out.println("**************** Student Details **************");
        System.out.println("id :"+id);
        System.out.println("name :"+name);
        System.out.println("gender :"+gender);
        System.out.println("fee :"+fee);
        System.out.println("phoneNo :"+phoneNo);
        System.out.println("institute :"+institute);
    }
}

class InputMethod1
{
    public static void main(String[] args) {
    
        Scanner sc=new Scanner(System.in);
        Student s1=new Student();
        System.out.println("Enter Student 1 Details ");
        System.out.print("enter id :");
        s1.id=sc.nextInt();
        sc.nextLine();
        System.out.print("enter name :");
        s1.name=sc.nextLine();
        System.out.print("enter gender :");
        s1.gender=sc.next().charAt(0);
        System.out.print("enter fee :");
        s1.fee=sc.nextDouble();
        System.out.print("enter phoneNo :");
        s1.phoneNo=sc.nextLong();
        
        
        Student s2=new Student();
        System.out.println("Enter Student 2 Details ");
        System.out.print("enter id :");
        s2.id=sc.nextInt();
        sc.nextLine();
        System.out.print("enter name :");
        s2.name=sc.nextLine();
        System.out.print("enter gender :");
        s2.gender=sc.next().charAt(0);
        System.out.print("enter fee :");
        s2.fee=sc.nextDouble();
        System.out.print("enter phoneNo :");
        s2.phoneNo=sc.nextLong();
        
        s1.showStudentDetails();
        s2.showStudentDetails();

        sc.close();
    }
}