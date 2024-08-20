import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatch {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        try 
        {
            int arr[]={10,20};
            System.out.println(arr[2]);
            System.out.println(10/0);
            System.out.println("Enter no. 1 :");
            double num1=sc.nextDouble();
            System.out.println("Enter no. 2 :");
            double num2=sc.nextDouble();
            double result=num1/num2;
            System.out.println("The result is "+result);
        } 
        catch (InputMismatchException im) 
        {
            System.out.println("Kindly input numbers only");
            im.printStackTrace();
        //    System.out.println(im.getLocalizedMessage());
        }
        catch(ArithmeticException e)
        {
            System.out.println("pls do not "+e.getMessage());
        }
        catch(Exception e)
        {
            e.printStackTrace();
            // System.out.println(e.getMessage());
        }
        System.out.println("after exception code");
        System.out.println("after exception code");
        System.out.println("after exception code");
        System.out.println("after exception code");
        System.out.println("after exception code");
        System.out.println("after exception code");
        sc.close();
    }
}
