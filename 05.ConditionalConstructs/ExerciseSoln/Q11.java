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


// import java.util.Scanner;

// public class QuadraticEquation {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);

//         System.out.print("Enter the coefficient of x^2: ");
//         double a = scanner.nextDouble();
//         System.out.print("Enter the coefficient of x: ");
//         double b = scanner.nextDouble();
//         System.out.print("Enter the constant term: ");
//         double c = scanner.nextDouble();

//         scanner.close();

//         double discriminant = b * b - 4 * a * c;

//         if (discriminant > 0) {
//             double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
//             double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
//             System.out.println("Roots are real and distinct:");
//             System.out.println("Root 1: " + root1);
//             System.out.println("Root 2: " + root2);
//         } else if (discriminant == 0) {
//             double root = -b / (2 * a);
//             System.out.println("Roots are real and equal:");
//             System.out.println("Root: " + root);
//         } else {
//             System.out.println("Roots are imaginary");
//         }
//     }
// }