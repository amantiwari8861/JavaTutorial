import java.util.List;
import java.util.stream.Collectors;
import java.util.ArrayList;
import java.util.Arrays;

public class SomeMethod {

public static void main(String[] args) {
    
    List<String> list=List.of("hello","there");
    // list.add("hii");
    String arr[]=new String[list.size()];
    list.toArray(arr);
    list=Arrays.stream(arr).map(e->e.concat("_")).collect(Collectors.toList());
    for(var e :List.of("A","B","C","D"))
    {
        list.add(e);
    }
    System.out.println(list);

}
}