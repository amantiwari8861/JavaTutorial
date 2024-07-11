public class TypeCasting {

    public static void main(String[] args) {
        
        // byte num1=10,num2=20,result;
        // result=(byte)(num1+num2);//here + promotes the type to int
        // System.out.println("the result is "+result);

        // int a=num1;
        // short s=(short)a;// explicit typecasting 

        // float f=10.56f; 
        // float f=(float)10.56; 

        char ch=65;
        System.out.println(ch);

        // ASCII -> American standard code for information interchange

        //  A  -> 65 -> 1000001
        // System.out.println(Integer.toBinaryString(65));

        /*
         * A -> 65
         * B -> 66
         * . -> .
         * Z -> 90
         * 
         * a -> 97
         * b -> 98
         * .  -> .
         * z -> 122
         * 
         * 0 -> 48
         * 1 -> 49
         * . -> .
         * 9 -> 57
         * 
         */
        int a='D'; // implicit typecasting
        System.out.println(a);

    }
}