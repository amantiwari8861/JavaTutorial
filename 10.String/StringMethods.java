public class StringMethods {
 public static void main(String[] args) {
    
    String name="Aman";
    String name2="aman";

    // System.out.println(name.length());
    // System.out.println(name.compareTo(name2));
    // System.out.println(name2.compareTo(name));
    // System.out.println(name2.compareTo("aman"));

    int i=10;
    // String s=i;
    String s=String.valueOf(i);
    System.out.println(s);

    int i2=Integer.parseInt(s);
    System.out.println(i2);

 }   
}
