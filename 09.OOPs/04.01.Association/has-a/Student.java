class Student 
{
    int id;
    String name;
    char gender;
    double fee;
    long phoneNo;
    String institute;
    Address localAddress;
    Address permanentAddress;

    Student() {
        institute = "Ducat Gurugram";
    }

    Student(int id, String name, char gender, double fee, long phoneNo,Address localAddress) 
    {
        this();// calling default constructor from parameterized constructor
        this.id = id;// here this is used to differentiate b/w local and instance variable
        this.name = name;
        this.gender = gender;
        this.fee = fee;
        this.phoneNo = phoneNo;
        this.localAddress=localAddress;
        //this represents to current class object 
    }

    void showStudentDetails() {
        System.out.println("**************** Student Details **************");
        System.out.println("id :" + id);
        System.out.println("name :" + name);
        System.out.println("gender :" + gender);
        System.out.println("fee :" + fee);
        System.out.println("phoneNo :" + phoneNo);
        System.out.println("institute :" + institute);
        localAddress.showAddressDetails();
    }
}