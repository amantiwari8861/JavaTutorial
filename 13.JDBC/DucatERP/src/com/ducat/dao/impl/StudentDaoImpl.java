package com.ducat.dao.impl;

import com.ducat.dao.StudentDao;
import com.ducat.entities.Student;
import java.sql.Date;
import ducaterp.util.ConnectionProvider;
import java.util.ArrayList;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.ZoneId;

public class StudentDaoImpl implements StudentDao{

    @Override
    public boolean enrollStudent(Student student) {
        boolean status=false;
        try(Connection con=ConnectionProvider.getMySQLConnection())
        {
        	/*
            create table student(stuId int primary key auto_increrment,
            		name varchar(50),dob date,ismembershipexpired bool,
            		phone bigint,gender char(1),fee double);*/
            PreparedStatement ps=con.prepareStatement("insert into student values(?,?,?,?,?,?,?)");
            ps.setInt(1, student.getStuId());
            ps.setString(2, student.getStuName());
            ps.setDate(3,Date.from(student.getDob().atStartOfDay(ZoneId.systemDefault()).toInstant()));
            ps.setBoolean(4, student.isIsMembershipExpired());
            ps.setLong(5, student.getPhoneNo());
            ps.setString(6,String.valueOf(student.getGender()));
            ps.setDouble(7, student.getFee());
            
            System.out.println(ps);
            
            int rowsAffected=ps.executeUpdate();
            status=rowsAffected>0?true:false;
        }
        catch( SQLException se)
        {
            se.printStackTrace();
        }
        return status;
    }

    @Override
    public boolean updateStudent(int id, Student newStudata) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean deleteStudentData(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ArrayList<Student> getAllStudents() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Student getStudentById(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
