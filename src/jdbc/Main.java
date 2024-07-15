package jdbc;

import jdbc.dao.StudentDAO;
import jdbc.model.Student;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        StudentDAO studentDAO = new StudentDAO();
//        Student student = new Student(5, "Hari", "Pokhara", "BCA");
//        studentDAO.save(student);

        List<Student> studentList = studentDAO.findAll();
        System.out.println(studentList);

        System.out.println(studentDAO.findById(5));
    }
}
