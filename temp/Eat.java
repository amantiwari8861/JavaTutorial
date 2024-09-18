
public class Eat extends Thread
{
    @Override
    public void run() {
        System.out.println("eating..."+Thread.currentThread());
        try{
            Thread.sleep(8000);
        }
        catch(InterruptedException i)
        {
            System.out.println(i.getMessage());
        }
        System.out.println("eating finished..."+Thread.currentThread());
    } 
}
