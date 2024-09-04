import java.util.Enumeration;
import java.util.Vector;

public class VectorDemo {
    public static void main(String[] args) {
        
        Vector<String> v=new Vector<>();

        v.add("Zimi");
        v.add("Aman");
        v.add("1Aman");
        v.add("Rajat");
        v.add("Divyansh");
        v.add("Aman");
        v.add("Aman");
        v.add("Aman");
        v.add("aman");
        v.add("Shiv");

        // System.out.println(v);

        Enumeration<String> en=v.elements();
        while (en.hasMoreElements()) 
        {
            System.out.println(en.nextElement());
        }

        // vector vs ArrayList 
        
    }
}
