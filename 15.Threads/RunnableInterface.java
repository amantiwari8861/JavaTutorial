class Eating implements Runnable {
    @Override
    public void run() {
        System.out.println("Eating by " + Thread.currentThread());
        try {
            Thread.sleep(5000);
        } catch (InterruptedException i) {
            i.printStackTrace();
        }
        System.out.println("eating finished");
    }
}

class WatchingTv implements Runnable {
    @Override
    public void run() {
        System.out.println("Watching tv by " + Thread.currentThread());
        try {
            Thread.sleep(2000);
        } catch (InterruptedException i) {
            i.printStackTrace();
        }
        System.out.println("Watching finished");
    }
}

class Talking implements Runnable {
    @Override
    public void run() {
        System.out.println("Talking by " + Thread.currentThread());
        try {
            Thread.sleep(3000);
        } catch (InterruptedException i) {
            i.printStackTrace();
        }
        System.out.println("Talking finished");
    }
}

class RunnableInterface {
    public static void main(String[] args) throws InterruptedException {

        // sequential execution
        // eating(); // 5 min
        // watchingTv();
        // talking();

        Eating e = new Eating();
        WatchingTv w = new WatchingTv();
        Talking t = new Talking();

       Thread t1=new Thread(e);
       Thread t2=new Thread(w,"Second Thread");
       t1.start();
       t2.start();
       new Thread(t,"Third Thread").start();

        // for(int i=0;i<10000;i++)
        // {
        //     System.out.print(i+" ");
        // }
        // t1.join();
        t2.join();

        System.out.println("2 Task Done! Main finished");
    }
}