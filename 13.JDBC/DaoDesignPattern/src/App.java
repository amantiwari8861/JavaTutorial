// import java.sql.Connection;
// import util.ConnectionProvider;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import com.ducat.dao.StudentDao;
import com.ducat.dao.impl.StudentDaoImpl;
import com.ducat.models.Student;

public class App {
    public static void main(String[] args) throws Exception {

        /**
         * design patterns : proven solution for a particular problem 
         * DAO -> data accessing objects 
         * 1. Student -> POJO (Bean)
         * 2. StudentDao interface uses Student
         * 3. StudentDaoImpl class implements StudentDao
         * 4. Main uses StudentDao 
         * 5. ConnectionProvider haves connections with Databases
        */

        // Connection con=ConnectionProvider.getMySQLConnection();

        StudentDao dao=new StudentDaoImpl();

        // Student stu=new Student(18055, "Dheeraj Kumar", 12000, 'M', false, LocalDate.of(2005, 1, 10), new Date().toString(), 12345678L);
        // boolean status=dao.enrollStudent(stu);
        // if (status) {
        //     System.out.println("Student enrolled succesfully!");
        // } else {
        //     System.out.println("unable to enroll student!");
        // }

        // Student newStuData=new Student(18121, "udit Kumar", 12000, 'M', true, LocalDate.of(2001, 12, 27), new Date().toString(), 9878767557L);
        // boolean status=dao.updateStudent(18055, newStuData);
        // if (status) 
        // {
        //     System.out.println("Student updated succesfully!");
        // } else {
        //     System.out.println("unable to update student data!");
        // }
        // Student stu=dao.getStudentById(18055);
        // System.out.println(stu);

        // boolean status=dao.deleteStudent(1000);
        // if (status) 
        // {
        //     System.out.println("Student deleted succesfully!");
        // } else {
        //     System.out.println("unable to delete student data!");
        // }
        
        // String colArr[]=dao.getAllColumns();
        // Map<String,String> cols=new HashMap<>();
        // cols.put(colArr[0],"%-7s");
        // cols.put(colArr[1],"%-18s");
        // cols.put(colArr[2],"%-8s");
        // cols.put(colArr[3],"%-8s");
        // cols.put(colArr[4],"%-15s");
        // cols.put(colArr[5],"%-15s");
        // cols.put(colArr[6],"%-26s");
        // cols.put(colArr[7],"%-15s");

        // for (String colString : colArr) 
        // {
        //     System.out.printf(cols.get(colString),colString);
        // }
        // System.out.println();
        // ArrayList<Student> students= dao.getAllStudentsData();
        // for (int i = 0; i < students.size(); i++) 
        // {
        //     // System.out.println(students.get(i));
        //     Student stu=students.get(i);
        //     System.out.print(stu.getId()+"   ");
        //     System.out.print(stu.getName()+"   ");
        //     System.out.print(stu.getFee()+"   ");
        //     System.out.print(stu.getGender()+"   ");
        //     System.out.print(stu.isMemExpired()+"   ");
        //     System.out.print(stu.getDob()+"   ");
        //     System.out.print(stu.getJoining()+"   ");
        //     System.out.println(stu.getMobileNo()+"   ");
        // }
    
        // for (int i = 0; i < students.size(); i++) 
        // {
        //     // System.out.println(students.get(i));
        //     Student stu=students.get(i);
        //     System.out.printf("%-7s",stu.getId());
        //     System.out.printf("%-18s",stu.getName());
        //     System.out.printf("%-8s",stu.getFee());
        //     System.out.printf("%8s",stu.getGender());
        //     System.out.printf("%-15s",stu.isMemExpired());
        //     System.out.printf("%-12s",stu.getDob());
        //     System.out.printf("%-26s",stu.getJoining());
        //     // System.out.printf("%-26s",stu.getJoining().substring(0,stu.getJoining().length()-5));
        //     System.out.printf("%-15s\n",stu.getMobileNo());
        // }

    }
}
