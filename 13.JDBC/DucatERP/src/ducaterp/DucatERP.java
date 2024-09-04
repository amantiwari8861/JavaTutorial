
package ducaterp;

import ducaterp.util.ConnectionProvider;
import java.sql.Connection;
import java.time.LocalDate;
//import java.util.Date;

import com.ducat.dao.StudentDao;
import com.ducat.dao.impl.StudentDaoImpl;
import com.ducat.entities.Student;
import java.time.LocalDateTime;

public class DucatERP {

    public static void main(String[] args) {

//        Connection con = ConnectionProvider.getMySQLConnection();
        
        /**
         * Design patterns : it is a proven solution from decades for a particular problem
         * 
         * DAO -> data accessing objects
         */
        StudentDao dao=new StudentDaoImpl();
        
        boolean status=dao.enrollStudent(new Student(18050, "rajat deep",LocalDate.of(2004,9,28), false, 123456789L, 'M',25000.67));
        if (status) {
			System.out.println("student enrolled succesfully!");
		} else {
			System.out.println("unable to enroll student!");
		}
        
        System.out.println(LocalDate.of(2004, 9, 28));
    }
    
    
    
    
    
}
