class Student 
{
    static int id;
    String name;
    char gender;
    double fee;
    long phoneNo;
    String institute;
    static{
        id=100;
        System.out.println("static block ");
    }
    Student() {
        System.out.println("Default constructor");        institute = "Ducat Gurugram";    }
    Student(String name, char gender, double fee, long phoneNo) 
    {
        this();// calling default constructor from parameterized constructor
        System.out.println("parameterized constructor");
        this.name = name;
        this.gender = gender;
        this.fee = fee;
        this.phoneNo = phoneNo;
        setID();
    }
    public static void setID()
    {
        System.out.println("setting student's id ");
        id++;
    }
    void showStudentDetails() 
    {
        System.out.println("**************** Student Details **************");
        System.out.println("id :" + id);
        System.out.println("name :" + name);
        System.out.println("gender :" + gender);
        System.out.println("fee :" + fee);
        System.out.println("phoneNo :" + phoneNo);
        System.out.println("institute :" + institute);
    }
}

public class StudentHandler {
    public static void main(String[] args) {
     
        Student stu1=new Student("rajat", 'M', 12000, 12233453L);
        stu1.showStudentDetails();
        Student stu2=new Student("rajat", 'M', 12000, 12233453L);
        stu2.showStudentDetails();
        Student stu3=new Student("rajat", 'M', 12000, 12233453L);
        stu3.showStudentDetails();
        Student stu4=new Student("rajat", 'M', 12000, 12233453L);
        stu4.showStudentDetails();
        

    }
}
