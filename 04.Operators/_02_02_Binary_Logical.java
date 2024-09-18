public class _02_02_Binary_Logical {

    public static void main(String[] args) {

        // logical operator eg. &&,||,!

        // both the coditions must be true to get true otherwise we get false
        System.out.println(10>20 && 300<50); // false && false -> false
        System.out.println(100>20 && 300<50); // True && false -> false
        System.out.println(10>20 && 30<50); // false && True -> false
        System.out.println(100>20 && 30<50); // True && True -> True

        // // atleast one of the conditions must be true to get true otherwise we get
        // false
        System.out.println(10>20 || 300<50);
        System.out.println(100>20 || 300<50);
        System.out.println(10>20 || 30<50);
        System.out.println(100>20 || 30<50);

        System.out.println( !(10>20) );
        System.out.println( !(100>20) );

        // System.out.println(10==10 && 20<50 && 56<23 && 57>12);
        // int num=12;
        // System.out.println(num%2==0 || num%3==0 || num%4==0 || num%5==0);

        System.out.println(10==10 && 20<50 || 56<23 && 57>12);

    }
}