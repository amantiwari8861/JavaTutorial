import java.util.Scanner;

public class StudentArray {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. of students :");
        int noOfStudent = sc.nextInt();
        Student stuArr[] = new Student[noOfStudent];

        for (int i = 0; i < stuArr.length; i++) 
        {
            Student tempStudent = new Student();
            System.out.println("Enter Student "+(i+1)+" Details ");
            System.out.print("enter id :");
            tempStudent.id = sc.nextInt();
            sc.nextLine();
            System.out.print("enter name :");
            tempStudent.name = sc.nextLine();
            System.out.print("enter gender :");
            tempStudent.gender = sc.next().charAt(0);
            System.out.print("enter fee :");
            tempStudent.fee = sc.nextDouble();
            System.out.print("enter phoneNo :");
            tempStudent.phoneNo = sc.nextLong();

            stuArr[i]=tempStudent;
        }

        System.out.println("**************All Details of Students ******************");
        for (int i = 0; i < stuArr.length; i++) 
        {
            stuArr[i].showStudentDetails();
        }

        // Class is also an user-defined data type
        

        sc.close();
    }
}