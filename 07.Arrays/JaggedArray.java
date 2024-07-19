import java.util.Scanner;

public class JaggedArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String countries[];
        String statesName[][];
        int covidCases[][];

        System.out.print("how many countries data u wanna insert :");
        countries=new String[sc.nextInt()];
        statesName=new String[countries.length][];
        covidCases=new int[countries.length][];
        
        for (int i = 0; i < covidCases.length; i++) 
        {
            sc.nextLine();
            System.out.print("enter country "+(i+1)+" name:");
            countries[i]=sc.nextLine();
            System.out.print("\tenter no. states:");
            statesName[i]=new String[sc.nextInt()];
            covidCases[i]=new int[statesName[i].length];
            for (int j = 0; j < covidCases[i].length; j++) 
            {
                sc.nextLine();
                System.out.print("\t\tenter state "+(j+1)+" name:");
                statesName[i][j]=sc.nextLine();
                System.out.print("\t\t\t covid cases in " + statesName[i][j] + ":");
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