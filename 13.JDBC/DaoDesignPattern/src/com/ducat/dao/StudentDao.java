package com.ducat.dao;

import java.util.ArrayList;

import com.ducat.models.Student;

public interface StudentDao {
    
    boolean enrollStudent(Student student);
    boolean updateStudent(int id,Student stuNewData);
    boolean deleteStudent(int id);
    Student getStudentById(int id);
    ArrayList<Student> getAllStudentsData();
    Student getStudentByMobileNo(long mobileNo);
    String[] getAllColumns();
}
