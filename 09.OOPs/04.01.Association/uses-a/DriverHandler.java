class Driver 
{
    //instance variable 

    void driveBike()
    {
        Bike b=new Bike(); // uses-a 
        b.drive();
    }
    void driveCar()
    {
        Car c=new Car();
        c.drive();
    }
}
public class DriverHandler {

    public static void main(String[] args) {
        
        Driver d=new Driver();//instantiation relationship

        d.driveBike();
        d.driveCar();


    }
}