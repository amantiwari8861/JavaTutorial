import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteIntoFile {
    public static void main(String[] args) throws IOException
    {
       BufferedOutputStream bis=
        new BufferedOutputStream(new FileOutputStream("UserData.txt",true));

        // bis.write(65);
        // bis.write('M');
        bis.write(" Hello Aman Sir !".getBytes());

        bis.close();


    }
}
