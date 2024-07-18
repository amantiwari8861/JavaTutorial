import java.util.Scanner;

public class TwoDArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String country[] = { "india", "America", "Australia" };
        String states[][] = {
                { "delhi", "goa", "up", "mp" },
                { "new york", "san fransisco", "san diego", "texas" },
                { "sydney", "south wales", "melbourn", "victoria" }
        };
        int covidCases[][] = new int[3][4];

        for (int i = 0; i < covidCases.length; i++) 
        {
            System.out.println("enter covid cases in " + country[i] + ":");
            for (int j = 0; j < covidCases[i].length; j++) 
            {
                System.out.print("\t\t\t" + states[i][j] + ":");
                covidCases[i][j] = sc.nextInt();
            }
            System.out.println();
        }

        System.out.println("The covid cases are as follows ");
        for (int i = 0; i < covidCases.length; i++) 
        {
            for (int j = 0; j < covidCases[i].length; j++) 
            {
                System.out.print("\t" + covidCases[i][j]);
            }
            System.out.println();
        }

        sc.close();
    }
}