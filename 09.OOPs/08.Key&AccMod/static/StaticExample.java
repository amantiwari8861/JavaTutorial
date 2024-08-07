class Calculator
{
    static void showCompany()
    {
        System.out.println("Casio scientific calculator");
    }
}
public class StaticExample {

    static void myFuction()
    {
        System.out.println("Good Morning!");
    }
    public static void main(String[] args) {
     
        // Calculator calc=new Calculator();
        // calc.showCompany();

        Calculator.showCompany();

        // StaticExample s=new StaticExample();
        // s.myFuction();

        // StaticExample.myFuction();
        myFuction();
        // this.myFuction();
    }
}
