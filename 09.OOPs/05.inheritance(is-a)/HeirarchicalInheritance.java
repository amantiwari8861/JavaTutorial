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
class Human extends Mammal
{
    int legs;
    Human()
    {
        System.out.println("Human Created");
        legs=2;
    }
    void showHumanProperty()
    {
        System.out.println("Human Property");
        System.out.println("Legs :"+legs);
    }
}
class Dog extends Mammal
{
    boolean isLoyal;
    Dog()
    {
        System.out.println("Dog Created");
        isLoyal=true;
    }
    void showDogProperty()
    {
        System.out.println("Dog's Property");
        System.out.println("Dogs are  :"+isLoyal);
    }
}

class HeirarchicalInheritance
{
    public static void main(String args[])
    {

    }
}