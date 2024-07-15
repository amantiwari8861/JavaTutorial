public class _03_Ternary {

    public static void main(String[] args) {
        
        //Ternary or conditional operator
        // syntax : (condition) ? (if true) : (if false)

        int num1,num2,max,min;
        num1=10;num2=20;

        max = num1>num2 ? num1 : num2 ;
        System.out.println("max="+max); 

        min = num1<num2 ? num1 : num2 ;
        System.out.println("min="+min);
    }
}