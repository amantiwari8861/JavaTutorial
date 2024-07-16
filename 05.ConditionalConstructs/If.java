import java.util.Scanner;

public class If {

    public static void main(String[] args) {
        
       // if,if-else,else if (ladder),switch
       
       Scanner sc=new Scanner(System.in);
        // int age;
        // System.out.println("enter ur age:");
        // age=sc.nextInt();

        // if (age>=18)  //true block
        // {
        //     System.out.println("you can vote!");
        // }

        // if (age>=18)  //true block
        // {
        //     System.out.println("you can vote!");
        // }
        // else
        // {
        //     System.out.println("you can't vote!");
        // }

        double marks;
        System.out.println("enter ur marks(%)");
        marks=sc.nextDouble();// -10

        // if (marks>=80 &&  marks<=100 ) // 80 <= marks <= 100   
        // {
        //     System.out.println("A grade!");
        // }
        // else if (marks>=60) 
        // {
        //     System.out.println("B grade!");
        // }
        // else if (marks>=33) 
        // {
        //     System.out.println("C grade!");
        // }
        // else if (marks>=0) 
        // {
        //     System.out.println("Chai becho..");
        // }
        // else
        // {
        //     System.out.println("invalid input");
        // }


        if (marks>=80 &&  marks<=100 ) // 80 <= marks <= 100   
        {
            System.out.println("A grade!");
            if (marks==100) 
            {
                System.out.println("no fee will be charged");
            }
            else if(marks>=95)
            {
                System.out.println("50K scholarship");
            }
        }
        else if (marks>=60) 
        {
            System.out.println("B grade!");
        }
        else if (marks>=33) 
        {
            System.out.println("C grade!");
        }
        else if (marks>=0) 
        {
            System.out.println("Chai becho..");
        }
        else
        {
            System.out.println("invalid input");
        }
       sc.close();
    }
}