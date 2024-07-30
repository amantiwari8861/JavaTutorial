class Women
{
    // Method-Overloading : to acheive method overloading the no. of arguments or the data type of arguments must be different
    void behave()
    {
        System.out.println("Normal behaviour");
    }
    // void behave() // Error bcz method signature are same as above
    // {
    // }
    // void behave(double salary)
    // {
    //     System.out.println("Working as an employee");
    // }
    // void behave(double money,String task)
    // {
        
    // }
    // void behave(String task,double money)
    // {
        
    // }
    // void spend(float money)
    // {
    //     System.out.println("spending on movie");
    // }
    // void spend(double money)
    // {
    //     System.out.println("spending on travelling ");
    // }
    void spend(byte money)
    {
        System.out.println("spending on metro recharge");
    }
    void spend(int time)
    {
        System.out.println("spending with kids");
    }
}
public class _01_MethodOverLoading {

    public static void main(String[] args) {
        
        //Polymorphoism : poly -> many  morphs -> forms

        Women w=new Women();
        // w.behave();
        // w.behave(50000);
        // System.out.println();
        // w.spend(350.5f);
        // w.spend(50050.5);
        w.spend((byte)100);
        w.spend(200);
    }
}