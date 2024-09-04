package com.ducat.dao.impl;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;

import com.ducat.dao.StudentDao;
import com.ducat.models.Student;

import util.ConnectionProvider;

public class StudentDaoImpl implements StudentDao {

    static boolean isTableExists = false;

    void createTable() {
        try (Connection con = ConnectionProvider.getMySQLConnection()) {
            Statement st = con.createStatement();
            st.execute(
                    "create table if not exists student (id int primary key auto_increment ,name varchar(50),fee float,gender char(1),mShipexpired bool,dob date,joining varchar(50),mobileNo bigint);");
            isTableExists = true;
            System.out.println("table created");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public StudentDaoImpl() {
        if (!isTableExists) {
            createTable();
        }
    }

    @Override
    public boolean enrollStudent(Student student) {
        boolean status = false;
        try (Connection con = ConnectionProvider.getMySQLConnection()) {

            PreparedStatement ps = con.prepareStatement("insert into student values(?,?,?,?,?,?,?,?)");

            ps.setInt(1, student.getId());
            ps.setString(2, student.getName());
            ps.setDouble(3, student.getFee());
            ps.setString(4, String.valueOf(student.getGender()));
            ps.setBoolean(5, student.isMemExpired());
            ps.setDate(6, Date.valueOf(student.getDob()));
            ps.setString(7, student.getJoining());
            ps.setLong(8, student.getMobileNo());

            // System.out.println(ps);
            int rowsAffected = ps.executeUpdate();// DML -> insert,update,delete
            status = rowsAffected > 0 ? true : false;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return status;
    }

    @Override
    public boolean updateStudent(int id, Student stuNewData) {
        boolean status = false;
        try (Connection con = ConnectionProvider.getMySQLConnection()) {

            PreparedStatement ps = con.prepareStatement(
                    "update student set id=?,name=?,fee=?,gender=?,mShipexpired=?,dob=?,joining=?,mobileNo=? where id=?;");
            ps.setInt(1, stuNewData.getId());
            ps.setString(2, stuNewData.getName());
            ps.setDouble(3, stuNewData.getFee());
            ps.setString(4, String.valueOf(stuNewData.getGender()));
            ps.setBoolean(5, stuNewData.isMemExpired());
            ps.setDate(6, Date.valueOf(stuNewData.getDob()));
            ps.setString(7, stuNewData.getJoining());
            ps.setLong(8, stuNewData.getMobileNo());
            ps.setInt(9, id);

            // System.out.println(ps);
            int rowsAffected = ps.executeUpdate();// DML -> insert,update,delete
            status = rowsAffected > 0 ? true : false;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return status;
    }

    @Override
    public boolean deleteStudent(int id) {
        boolean status = false;
        try (Connection con = ConnectionProvider.getMySQLConnection()) {

            Statement st = con.createStatement();
            int rowsAffected = st.executeUpdate("delete from student where id=" + id + ";");// DML ->
                                                                                            // insert,update,delete
            status = rowsAffected > 0 ? true : false;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return status;
    }

    @Override
    public Student getStudentById(int id) {
        Student stu = null;
        try (Connection con = ConnectionProvider.getMySQLConnection()) {

            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select * from student where id=" + id + ";");
            rs.next();
            stu = new Student();
            stu.setId(rs.getInt(1));
            stu.setName(rs.getString(2));
            stu.setFee(rs.getDouble(3));
            stu.setGender(rs.getString(4).charAt(0));
            stu.setMemExpired(rs.getBoolean(5));
            stu.setDob(rs.getDate(6).toLocalDate());
            stu.setJoining(rs.getString(7));
            stu.setMobileNo(rs.getLong(8));
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return stu;
    }

    @Override
    public ArrayList<Student> getAllStudentsData() {
        ArrayList<Student> stuList = new ArrayList<>();
        try (Connection con = ConnectionProvider.getMySQLConnection()) {

            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select * from student;");

            while (rs.next()) {
                Student tempStuObj = new Student();
                tempStuObj.setId(rs.getInt(1));
                tempStuObj.setName(rs.getString(2));
                tempStuObj.setFee(rs.getDouble(3));
                tempStuObj.setGender(rs.getString(4).charAt(0));
                tempStuObj.setMemExpired(rs.getBoolean(5));
                tempStuObj.setDob(rs.getDate(6).toLocalDate());
                tempStuObj.setJoining(rs.getString(7));
                tempStuObj.setMobileNo(rs.getLong(8));
                stuList.add(tempStuObj);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return stuList;
    }

    @Override
    public Student getStudentByMobileNo(long mobileNo) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getStudentByMobileNo'");
    }

    public String[] getAllColumns() {
        String columns[] = null;
        try (Connection con = ConnectionProvider.getMySQLConnection()) {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select * from student;");
            ResultSetMetaData rsmd = rs.getMetaData();
            columns = new String[rsmd.getColumnCount()];
            for (int i = 0; i < rsmd.getColumnCount(); i++) {
                columns[i] = rsmd.getColumnLabel(i + 1);
                // System.out.println(rsmd.getColumnLabel(i));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return columns;
    }

}
