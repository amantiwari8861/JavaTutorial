import java.time.LocalDate;
import java.util.Date;

/**
 * <pre> .
 * Student -> pojo class
 * StudentDao -> interface
 * StudentDaoImpl -> child of StudentDao interface
 * this class havig main
 * </pre>
 */
public class MainHandler 
{
    public static void main(String[] args) 
    {
        StudentDao dao=new StudentDaoImpl();
        Student stu=new Student(100, "Rajat Deep", LocalDate.of(2004, 9, 28), "java Full Stack", 1234567L, 'M', new Date().toString(), true);
        dao.renewMembership(stu);
        
    }
}
