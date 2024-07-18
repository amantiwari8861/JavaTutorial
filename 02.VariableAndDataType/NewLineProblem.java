import java.util.Scanner;

public class NewLineProblem {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);

        System.out.println("enter id");
        int id=sc.nextInt();
        sc.nextLine();
        System.out.println("enter full name ");
        String fname=sc.nextLine();//capturing empty string

        System.out.println("The id is :"+id);
        System.out.println("The full name is :"+fname);
        sc.close();
    }
}