 class Building //class is a set of objects which shares a common structure and behaviour
{
    int noOfRooms=10;
    int noOfFloors;
    double height;
    String ownerName;
    String color;

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
public class BuildingHandler 
{
    public static void main(String[] args) 
    {
        Building sanjanaKiBuilding;// created reference variable of Building
        sanjanaKiBuilding=new Building();

        Building amanKiBuilding=new Building();

        sanjanaKiBuilding.color="pink";
        sanjanaKiBuilding.showBuildingDetails();

        amanKiBuilding.color="grey and black";
        amanKiBuilding.showBuildingDetails();

        System.out.println(sanjanaKiBuilding);
        System.out.println(amanKiBuilding);
    }
}