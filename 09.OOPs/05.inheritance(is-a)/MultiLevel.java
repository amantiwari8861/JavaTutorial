class Mammal
{
    String bloodType;
    Mammal()
    {
        System.out.println("Mammal Created");
        bloodType="Warm";
    }
    void showMammalProperty()
    {
        System.out.println("Mammal's Property are :");
        System.out.println("Blood Type : "+bloodType);
    }
}
class Cat extends Mammal
{
    String food;
    Cat()
    {
        System.out.println("Cat created");
        food="omnivorus";
    }
    void showCatProperty()
    {
        System.out.println("Cat's Property");
        System.out.println("Cats are :"+food);
    }
}
class Leopard extends Cat 
{
    double speed;
    Leopard()
    {
        System.out.println("leopard created");
        speed=150.5;
    }
    void showLeopardProperty()
    {
        System.out.println("Leopard's Property");
        System.out.println("Leopard's speed is :"+speed);
    }
}

public class MultiLevel {

    public static void main(String[] args) {
     
    Leopard liala=new Leopard();
    liala.showMammalProperty();
    liala.showCatProperty();
    liala.showLeopardProperty();

    }
}