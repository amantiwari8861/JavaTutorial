import java.util.Scanner;

public class SwitchString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Shirt colour :");
        String color = sc.nextLine();
        switch (color) 
        {
            case "Red":
                System.out.println("The price is 800 ");
                break;
            case "Green":
                System.out.println("The price is 900 ");
                break;
            case "Pink":
                System.out.println("The price is 400 ");
                break;
            default:System.out.println("invalid choice!");
                break;
        }
        sc.close();
    }
}
