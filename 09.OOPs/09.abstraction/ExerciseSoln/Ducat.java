import java.util.Arrays;

abstract class Course
{
    String courseCode;
    String courseName;
    double duration;
    boolean isPassed;
    long credentials;
    Course(){}
    public Course(String courseCode, String courseName, double duration, boolean isPassed, long credentials) {
        this.courseCode = courseCode;
        this.courseName = courseName;
        this.duration = duration;
        this.isPassed = isPassed;
        this.credentials = credentials;
    }
    abstract void giveExam();
    abstract void showProgrammeDetails();
}
abstract class Certification extends Course
{
    String poweredBy[];
    public Certification(String[] poweredBy) {
        this.poweredBy = poweredBy;
    }
    @Override
    void giveExam() 
    {
        System.out.println("giving 2 hour exam");
    }
}
class Excel extends Certification
{
    String courseContent;
    public Excel(String[] poweredBy) {
        super(poweredBy);
    }
    public Excel(String[] poweredBy, String courseContent) {
        super(poweredBy);
        this.courseContent = courseContent;
    }
    public Excel(String courseCode,String courseName,double duration,boolean isPassed,String[] poweredBy, String courseContent) {
        super(poweredBy);
        this.courseContent = courseContent;
        this.courseCode = courseCode;
        this.courseName = courseName;
        this.duration = duration;
        this.isPassed = isPassed;
    }
    @Override
    void showProgrammeDetails() 
    {
        System.out.println(" Certification Details ");
        System.out.println("courseCode :"+courseCode);
        System.out.println("courseName :"+courseName);
        System.out.println("duration :"+duration);
        System.out.println("isPassed :"+isPassed);
        System.out.println("credentials :"+credentials);
        System.out.println("Powered by :"+Arrays.toString(poweredBy));
        System.out.println("course content :"+courseContent);
    }
}
public class Ducat {

    public static void main(String[] args) {
        
        Course c;
        // c=new Excel(new String[]{"NSDC","Ducat"}, "Full Excel 3 weeks course");
        c=new Excel("Ex-001", "Excel 3 week workshop",4*21, false, new String[]{"NSDC","Ducat"}, "Full Excel 3 weeks course") ;
        c.showProgrammeDetails();
    }
}