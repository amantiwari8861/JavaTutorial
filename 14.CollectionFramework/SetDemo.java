import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

class SetDemo
{
    public static void main(String[] args) {
        
        /**
         * Set doesn't allows any duplicate values and it is unordered collection of data
         * and it can't be indexed
         */
        // Set<String> mySet=new HashSet<>();
        // Set<String> mySet=new LinkedHashSet<>();
        Set<String> mySet=new TreeSet<>();

        mySet.add("Zimi");
        mySet.add("Aman");
        mySet.add("1Aman");
        mySet.add("Rajat");
        mySet.add("Divyansh");
        mySet.add("Aman");
        mySet.add("Aman");
        mySet.add("Aman");
        mySet.add("aman");
        mySet.add("Shiv");

        System.out.println(mySet);
        

        // What is hashing ?
    }
}