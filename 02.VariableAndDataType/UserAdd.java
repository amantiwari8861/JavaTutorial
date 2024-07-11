import java.util.Scanner;

public class UserAdd {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        int num1,num2,result;
        System.out.print("enter the value of num1:");
        num1=sc.nextInt();
        System.out.print("enter the value of num2:");
        num2=sc.nextInt();
        result=num1+num2;

        System.out.println("the sum of "+num1+" and "+num2+" is "+result);
        sc.close();
    }
}