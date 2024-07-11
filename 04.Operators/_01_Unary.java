public class _01_Unary {

    public static void main(String[] args) {
     
        // 4+6  here + is an operator and 4,5 is operands
        // 1.unary operator (only 1 operand is required)
        // 2.Binary operator (only 2 operand is required)
        // 3.Ternary operator (only 3 operand is required)

        //1. unary eg. ++,--

        // int num=10;
        // num+1;
        // System.out.println(num+1);
        // System.out.println(num); // ?
        // num=num+1;
        // or 
        // num++;
        // num++;
        // num++;
        // System.out.println(num);

        // num--;
        // System.out.println(num);

        // pre-fix and post-fix

        // int num=10;
        // // int result=num++;
        // int result=++num;

        // System.out.println("num="+num);
        // System.out.println("result="+result);

        //tricky
        int a=11, b=22, c;
         
        c = a + b + a++ + b++ + ++a + ++b;//  11+22+11+22+13+24
        System.out.println("a="+a);// 13
        System.out.println("b="+b);// 24
        System.out.println("c="+c);// 103

        //abhishek -> 11 22 102
        // rajat -> 
        // dheeraj -> 
        // kumkum -> 11 22 103
        // anjali -> 

    }
}