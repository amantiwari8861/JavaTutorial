import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class ShowNum implements Runnable {
    int num;

    ShowNum(int num) {
        this.num = num;
    }

    @Override
    public void run() {
        System.out.println("Num=" + num + " by " + Thread.currentThread().getName());
    }
}

class HundredThread {
    public static void main(String[] args) throws InterruptedException
    {

        // Thread threads[] = new Thread[100];
        // for (int i = 1; i <= 100; i++) {
        //     threads[i-1] = new Thread(new ShowNum(i));
        //     threads[i-1].start();
        // }
        // for (int i = 0; i < 100; i++)
        //     threads[i].join();
        
        // ExecutorService executor=Executors.newSingleThreadExecutor();
        ExecutorService executor=Executors.newFixedThreadPool(10);
        for(int i = 0; i < 100; i++)
        {
            executor.submit(new ShowNum(i));
        }
        executor.shutdown();
        System.out.println("All Task Done!");
    }
}