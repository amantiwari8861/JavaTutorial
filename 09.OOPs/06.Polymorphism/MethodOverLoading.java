class Customer
{
    void pay()
    {
        System.out.println("Customer is paying cash");
    }
    void pay(String upiId)
    {
        System.out.println("paying to UPI ID :"+upiId);
    }
    void pay(long accNo,String custName)
    {
        System.out.println("sending money in acc No:"+accNo+" in "+custName+"'s Account");
    }
}
class MethodOverloading
{
    public static void main(String[] args) {
        
        Customer c=new Customer();
        c.pay();
        c.pay("9891062743@paytm");
        c.pay(4838001500055449L, "Aman Tiwari");
    }
}