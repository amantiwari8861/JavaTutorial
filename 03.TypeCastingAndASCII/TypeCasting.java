public class TypeCasting {

    public static void main(String[] args) {
        
        // Byte range : -128 to 127 
        byte num1=10,num2=20,result;
        // // result=num1+num2;//here + promotes the type to int
        // result=(byte)(num1+num2);// here we performed explicit type-casting
        // System.out.println("the result is "+result);


        // int a=num1;
        // short s=(short)a;// explicit typecasting 

        // int numbr=8448179216;
        // long mobl=8448179216;
        // long mobile=8448179216l;
        // long mobileNo=8448179216L;

        // float f=67.62772;
        // float f1=(float)10.56; 
        // float f2=10.56f; 
        // float f3=10.56F; 

        // char ch=65; // implicit typecasting
        // System.out.println(ch);

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