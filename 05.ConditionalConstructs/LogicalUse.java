import java.util.Scanner;

public class LogicalUse {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int marks;
        System.out.println("enter ur marks:");
        marks=sc.nextInt();

        // if (marks>=80 || marks<=100) 
        // {
        //     System.out.println("A grade");
        // }
        /*
         * case 1: marks=12
         *         12>=80 || 12<=100
         *           false || true
         *              true
         * case 2: marks=120
         *         120>=80 || 120<=100
         *            true || false
         *              true
         * case 3: marks=85
         *         85>=80 || 85<=100
         *            true || true
         *              true
         */
        if (marks>=80 && marks<=100) 
        {
            System.out.println("A grade");
        }
        /*
         * case 1: marks=12
         *         12>=80 && 12<=100
         *           false && true
         *              false
         * case 2: marks=120
         *         120>=80 && 120<=100
         *            true && false
         *              false
         * case 3: marks=85
         *         85>=80 && 85<=100
         *            true && true
         *              true
         */
        sc.close();
    }
}