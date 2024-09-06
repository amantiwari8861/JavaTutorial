import java.util.LinkedList;
import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        
        // Stack<String> books=new Stack<>();
        LinkedList<String> books=new LinkedList<>();

        books.push("C");
        books.push("C++");
        books.push("Java");
        books.push("Python");
        System.out.println(books);

        // System.out.println(books.pop());
        // System.out.println(books);

        books.add(2,"C#");

        System.out.println(books);

        
        

    }
}
