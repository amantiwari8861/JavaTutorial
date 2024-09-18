
public class Talk extends Thread
{
    @Override
    public void run() {
        System.out.println("Talking..."+Thread.currentThread());
    } 
}
