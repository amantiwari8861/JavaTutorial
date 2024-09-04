package com.ducat.dao;
import com.ducat.entities.Student;
import java.util.ArrayList;

public interface StudentDao {
    
    boolean enrollStudent(Student student);
    boolean updateStudent(int id,Student newStudata);
    boolean deleteStudentData(int id);
    ArrayList<Student> getAllStudents();
    Student getStudentById(int id);
}
