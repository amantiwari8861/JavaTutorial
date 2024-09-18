public class _02_01_Binary_Relational {

    public static void main(String[] args) {
        
        //Relational operator eg. <,>,<=,>=,==,!= (boolean output)
        int num1=10,num2=20;
        boolean result=num1<num2;
        System.out.println(result);

        System.out.println(10<20);
        System.out.println(100<20);
        
        System.out.println(20>10);
        System.out.println(2>10);

        System.out.println(5<=10);
        System.out.println(10<=10);

        System.out.println(20>=10);
        System.out.println(20>=20);

        System.out.println(10==10);
        System.out.println(15==10);

        System.out.println(15!=10);
        System.out.println(15!=15);

    }
}