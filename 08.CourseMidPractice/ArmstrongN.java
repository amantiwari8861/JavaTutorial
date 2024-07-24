import java.util.Scanner;

public class ArmstrongN {

    public static void main(String[] args) {
        
        // 153 -> 1*1*1 + 5*5*5 + 3*3*3 => 153 
        // 1634 -> armstrong

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int num=sc.nextInt();

        int temp1,temp2,count=0;
        temp1=temp2=num;

        while (temp1>0) // 153
        {
            count++;
            temp1=temp1/10; // 153.3 -> 15
        }
        System.out.println("the digit length is "+count);

        int rem,sum=0;

        while (temp2>0) 
        {
            rem=temp2%10;  // 15%10 =>5
            sum=sum+(int)Math.pow(rem,count);
            temp2/=10;
        }

        if (sum==num) 
        {
            System.out.println(num+" is an armstrong no.");
        }
        else
        {
            System.out.println(num+" is not an armstrong no.");
        }


        sc.close();
    }
}