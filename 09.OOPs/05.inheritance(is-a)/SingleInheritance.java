//inheritance : inheriting the ancestors property into child
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
class Human extends Mammal
{
    int legs;
    Human()
    {
        super();// calling of parent class default constructor
        System.out.println("Human Created");
        legs=2;
    }
    void showHumanProperty()
    {
        System.out.println("Human Property");
        System.out.println("Legs :"+legs);
    }
}

public class SingleInheritance 
{
    public static void main(String[] args) 
    {
        // Mammal whale=new Mammal();
        // whale.showMammalProperty();

        Human rajat=new Human();
        rajat.showMammalProperty();
        rajat.showHumanProperty();


    }
}