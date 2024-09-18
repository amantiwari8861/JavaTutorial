import java.util.Scanner;

public class Armstrong {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number:");
        int num=sc.nextInt();// 153

        int rem,sum=0,temp;
        temp=num;
        while (num>0) 
        {
            // remainder
            rem=num%10;
            // cube sum
            sum=sum+rem*rem*rem;// 152+1
            // remove last digit
            num=num/10;// 1
        }
        System.out.println(sum);
        if (sum==temp)
            System.out.println(temp+" is an armstrong no. ");
        else
            System.out.println(temp+" is not an armstrong no. ");

    }
}