import java.time.LocalDate;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;
import java.util.Set;

class MapDemo
{
    public static void main(String args[])
    {
        // Map<String,Object> userDetails=new HashMap<>();
        // LinkedHashMap<String,Object> userDetails=new LinkedHashMap<>();
        // TreeMap<String,Object> userDetails=new TreeMap<>();
        ConcurrentHashMap<String,Object> userDetails=new ConcurrentHashMap<>();

        userDetails.put("id", 18050);
        userDetails.put("name", "Ankit");
        userDetails.put("name1", "Ankit");
        userDetails.put("name2", null);
        userDetails.put("Name", "Ankit");
        userDetails.put("mobileNo", "1453753376");
        userDetails.put("age", 22);
        userDetails.put("Name", "raj");
        // userDetails.put(null, null);
        // userDetails.put(null, "Hello");
        userDetails.put("dob", LocalDate.of(1999, 4, 22));
        userDetails.

        System.out.println(userDetails);
        // System.out.println(userDetails.get("age"));
        // System.out.println(userDetails.get(null));

        // Set<Entry<String,Object>> entries =userDetails.entrySet();
        // for (Entry<String,Object> entry : entries) 
        // {
        //     // System.out.println(entry);
        //     System.out.println(entry.getKey()+" : "+entry.getValue());
        // }

        // for (String k  : userDetails.keySet()) 
        // {
        //     System.out.println(k+":"+userDetails.get(k));
        // }
    }
}