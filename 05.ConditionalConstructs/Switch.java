import java.util.Scanner;

public class Switch {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // System.out.println(
        // "1.start game\n" +
        // "2.load game\n" +
        // "3.settings\n" +
        // "4.exit\n");
        // System.out.print("enter ur choice:");
        // int choice = sc.nextInt();

        // switch (choice)
        // {
        // case 1:
        // System.out.println("starting the game");
        // // break;
        // case 2:
        // System.out.println("loading the game");
        // break;
        // case 3:
        // System.out.println("setting the game");
        // break;
        // case 4:
        // System.out.println("exiting the game");
        // break;
        // default:System.out.println("invalid choice");
        // break;
        // }

        System.out.println("enter operation");
        char op = sc.next().charAt(0);

        switch (op) {
            case '+':
                System.out.println("adding...");
                break;
            case '-':
                System.out.println("subtracting...");
                break;
            case '*':
                System.out.println("multiply...");
                break;

            default:System.out.println("invalid choice");
                break;
        }

        sc.close();
    }
}