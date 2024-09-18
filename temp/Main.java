class Main 
{
    public static void eat() throws InterruptedException
    {
        System.out.println("eating....");
        Thread.sleep(8000);
    }
    public static void talk()
    {
        System.out.println("talking....");
    }
    public static void watchTv()
    {
        System.out.println("watching tv....");
    }

    public static void main(String[] args) throws Exception
    {
        
        // System.out.println(1/0);
        // System.out.println(Thread.currentThread().getName());
        // System.out.println(Thread.currentThread());

        // to create a thread we have 2 ways 
        // 1. use Thread class 
        // 2. use Runnable interface

        // 1 class   can extend      only 1 class
        // 1 class   can implement   multiple interfaces

        //sequential execution
        // eat();
        // talk();
        // watchTv();

        Eat e=new Eat();
        Talk t=new Talk();
        WatchingTv tv=new WatchingTv();

        e.start();
        t.start();
        tv.start();
    }
}