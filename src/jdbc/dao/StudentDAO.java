package jdbc.dao;

import jdbc.model.Student;
import jdbc.utils.DBConnection;

import java.sql.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentDAO {

    public void save(Student student){
        Connection connection = DBConnection.getDBConnection();
        // student save implementation
        String query="insert into student(id, name, address, faculty)  values (?, ?, ?, ?)";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1,student.getId());
            preparedStatement.setString(2,student.getName());
            preparedStatement.setString(3,student.getAddress());
            preparedStatement.setString(4,student.getFaculty());
            preparedStatement.execute();
            System.out.println("Data Inserted");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }finally {
            try {
                connection.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public List<Student> findAll(){
        // student find all implementation
        Connection connection = DBConnection.getDBConnection();
        String query="select * from student";
        List<Student> studentList=new ArrayList<>();
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()){
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String address = resultSet.getString("address");
                String faculty = resultSet.getString("faculty");
                Student student = new Student(id, name, address, faculty);
                studentList.add(student);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }finally {
            try {
                connection.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
        return studentList;
    }

    public Student findById(int id){
        Connection connection = DBConnection.getDBConnection();
        String query="select * from student where id = ?";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1,id);
            ResultSet resultSet = preparedStatement.executeQuery();
            Student student = null;
            while (resultSet.next()){
                String name = resultSet.getString("name");
                String address = resultSet.getString("address");
                String faculty = resultSet.getString("faculty");
                student = new Student(id, name, address, faculty);
            }
            return student;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }finally {
            try {
                connection.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
    }

}
