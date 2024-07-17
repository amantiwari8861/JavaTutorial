import java.util.Scanner;

public class Q11 {

    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        
        int a, b, c, d; // Declare variables to store coefficients and discriminant.
        double x1, x2; // Declare variables to store roots.
        System.out.println("Input the value of a, b & c : "); // Prompt user for input.
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();

        d = b * b - 4 * a * c; // Calculate the discriminant.

        if (d == 0) // Check if discriminant is zero.
        {
            System.out.println("Both roots are equal.\n");
            x1 = -b / (2.0 * a); // Calculate the single root.
            x2 = x1;
            System.out.println("First  Root Root1 ="+ x1); // Print the roots.
            System.out.println("Second Root Root2 = "+ x2);
        } 
        else if (d > 0) // Check if discriminant is positive.
        {
            System.out.println("Both roots are real and different.\n");
            x1 = (-b + Math.sqrt(d)) / (2 * a); // Calculate the first root.
            x2 = (-b - Math.sqrt(d)) / (2 * a); // Calculate the second root.
            System.out.println("First  Root Root1 = "+ x1); // Print the roots.
            System.out.println("Second Root Root2 = "+ x2);
        } else // If discriminant is negative.
            System.out.println("Roots are imaginary;\nNo Solution. \n"); // Print no solution message.
    }
}
