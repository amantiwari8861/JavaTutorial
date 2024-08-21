import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class ThrowsExample 
{
    public static void m1()
    {
        try {
            m2();
        } 
        catch (ArithmeticException e) 
        {
            e.printStackTrace();
        }
    }
    public static void m2() throws ArithmeticException,ArrayIndexOutOfBoundsException
    {
        System.out.println(10/0);
    }


    // public static void main(String[] args) throws IOException
    public static void main(String[] args)
    {
        InputStream is=null;
        try {
            is=new FileInputStream("hello.txt");
            System.out.println((char)is.read());
            
        } catch (Exception e) 
        {
            e.printStackTrace();
        }
        finally
        {
            System.out.println("i will run always");
            if (is != null) 
            {
                System.out.println("closing the InputStream object");
                try {
                    is.close();
                    
                } catch (IOException e) 
                {
                    e.printStackTrace();
                }
            }
        }
    // m1();

    }
}