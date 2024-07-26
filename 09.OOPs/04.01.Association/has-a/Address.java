public class Address 
{
    String city;
    String state;
    String country;
    int pincode;
    String street;
    public Address(String city, String state, String country, int pincode, String street) {
        this.city = city;
        this.state = state;
        this.country = country;
        this.pincode = pincode;
        this.street = street;
    }
    void showAddressDetails()
    {
        System.out.println("*********** Address *********");
        System.out.println(" city : "+city);
        System.out.println(" state : "+state);
        System.out.println(" country : "+country);
        System.out.println(" pincode : "+pincode);
        System.out.println(" street : "+street);
    }  
}