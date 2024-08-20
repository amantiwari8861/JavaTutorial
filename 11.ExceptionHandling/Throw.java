class Throw
{
    public static void main(String[] args) throws Exception
    {
        int age=12;   
        if(age>=18)
        {
            System.out.println("Ready to vote");
        }
        else
        {
            throw new Exception("invalid age");
        }
        System.out.println("after exception code");
        System.out.println("after exception code");
        System.out.println("after exception code");
        System.out.println("after exception code");
        System.out.println("after exception code");
        System.out.println("after exception code");
    }
}