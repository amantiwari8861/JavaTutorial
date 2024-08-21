import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class TryWithResource {
    public static void main(String[] args) {
        
        try (InputStream is=new FileInputStream("hello.txt")) 
        {
            // System.out.println((char)is.read());
            String alldata=new String(is.readAllBytes());
            System.out.println(alldata);
        } 
        catch (FileNotFoundException e) 
        {
            System.out.println(e.getMessage());
        } 
        catch (IOException e) 
        {
            System.out.println("error opening file "+e.getMessage());
        }
    }
}
