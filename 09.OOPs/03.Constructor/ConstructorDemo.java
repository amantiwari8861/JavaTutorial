class Building 
{
    int noOfRooms=10;//instance variable (global variable in c)
    int noOfFloors;
    double height;
    String ownerName;
    String color;
    //constructor name is same as class name and it doesn't have any return type
    //this is default constructor
    Building() // constructor is a special type of method which is used to initialize the data member or member functions of a class 
    {
        System.out.println("Building created");
    }
    Building(int r,int f,double h,String o,String c)//parameterized constructor
    {
        noOfRooms=r;
        noOfFloors=f;
        height=h;
        ownerName=o;
        color=c;
    }
    void manageInfraStructure()
    {
        System.out.println("managing the infra of building");
    }
    void showBuildingDetails() //method
    {
        System.out.println("********** Building Details **************");
        System.out.println("noOfRooms :"+noOfRooms);
        System.out.println("noOfFloors :"+noOfFloors);
        System.out.println("height :"+height);
        System.out.println("ownerName :"+ownerName);
        System.out.println("color :"+color);
    }
}

public class ConstructorDemo {

    public static void main(String[] args) {
        
        new Building();

        // the process of making object(instance) is called instatntiation
        // object -> real world entity
        Building b=new Building(10, 2, 10023.56, "Aman", "Grey");
        b.showBuildingDetails();

    }
}