public class HasA {

    public static void main(String[] args) {
        
        Address a=new Address("delhi", "Delhi", "india", 110096, "gazipur");
        Student stu=new Student(10, "rajat", 'M', 12000, 1234454646L,a);
        stu.showStudentDetails();
    }
}