class Eating extends Thread {
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

class WatchingTv extends Thread {
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

class Talking extends Thread {
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

class ThreadClass {
    public static void main(String[] args) throws InterruptedException {

        // System.out.println(1/0);
        // System.out.println(Thread.currentThread());
        // Thread.currentThread().setName("Parent Thread");
        // System.out.println(Thread.currentThread());

        // System.out.println("Hiiii");
        // Thread.sleep(4000);
        // System.out.println("Hello there");

        // sequential execution
        // eating(); // 5 min
        // watchingTv();
        // talking();

        Eating e = new Eating();
        WatchingTv w = new WatchingTv();
        Talking t = new Talking();

        //here no new Thread is creating(running) 
        // e.run();
        // w.run();
        // t.run();
        e.start();
        w.start();
        t.start();

    }
}