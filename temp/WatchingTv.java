
public class WatchingTv extends Thread
{
    @Override
    public void run() {
        System.out.println("watching tv..."+Thread.currentThread());
    } 
}
