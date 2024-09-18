import java.util.Scanner;

public class _04_Misc {
    public static void main(String[] args) {
        
        String name="Aman";
        System.out.println(name instanceof String);

        Scanner sc=new Scanner(System.in);
        Scanner inputSc=new Scanner(System.in);
        System.out.println(sc instanceof Scanner);
        System.out.println(inputSc instanceof Scanner);
    }
}
