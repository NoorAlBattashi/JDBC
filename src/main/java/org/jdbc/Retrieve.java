package org.jdbc;

import org.jdbc.model.Student;

import java.sql.*;
import java.util.ArrayList;

public class Retrieve {
    public static void main(String[] args) {
        Statement statement = null;
        Connection connection = null;
        try {
            //open a connection
            connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost/noor",
                    System.getenv("DB_USER_NAME"),
                    System.getenv("DB_USER_PASS")
            );
            //execute a query
            statement = connection.createStatement();
            statement.execute("select * from student;");

            ResultSet rs = statement.getResultSet();
            ArrayList<Student> storeStudents = new ArrayList<>();
            //process the result set
            while (rs.next()) {
                //read a record
                Student newStudent = new Student();
                newStudent.id = rs.getInt("id");
                newStudent.name = rs.getString("name");
                newStudent.email = rs.getString("email");

                storeStudents.add(newStudent);
            }
            for (Student s : storeStudents) {
                System.out.print("Student Name: " + s.name);
                System.out.println(", Student Email: " + s.email);
            }

        } catch (SQLException e) {
            //handle SQL exception
            e.printStackTrace();
        } catch (Exception e) {
            // handle any other exceptions
            e.printStackTrace();
        } finally {
            //close resources
            try {
                if (statement != null) {
                    statement.close();
                }
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }
}
