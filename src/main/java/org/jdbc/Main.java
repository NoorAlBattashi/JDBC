package org.jdbc;

import java.sql.*;

public class Main {
//    public static void main(String[] args) {
//        Statement statement = null;
//        Connection connection = null;
//        try {
//            //open a connection
//            connection = DriverManager.getConnection(
//                    "jdbc:mysql://localhost/noor",
//                    System.getenv("DB_USER_NAME"),
//                    System.getenv("DB_USER_PASS")
//            );
//            //execute a query
//            statement = connection.createStatement();
//            statement.execute("select * from student;");
//
//            ResultSet rs = statement.getResultSet();
//            //process the result set
//            while (rs.next()) {
//                //read a record
//                int id = rs.getInt("id");
//                String name = rs.getString("name");
//                String email = rs.getString("email");
//
//                System.out.println("ID: " + id + ", Name: " + name + ", Email: " + email);
//            }
//
//            //update a record
//            int idToUpdate = 2;
//            String newName = "New Name";
//            statement.executeUpdate("UPDATE student SET name = '" + newName + "' WHERE id = " + idToUpdate);
//            System.out.println("Updated record with ID " + idToUpdate + " to have name " + newName);
//
//            //create a record
//            String newStudentName = "Wasan";
//            String newStudentEmail = "swasan@gmail.com";
//            statement.execute("insert into student (name, email) " +
//                    "values('"
//                    + newStudentName + "','"
//                    + newStudentEmail + "');");
//
//            //delete a record
//            int idToDelete = 2;
//            statement.executeUpdate("DELETE FROM student WHERE id = " + idToDelete + ";");
//        } catch (SQLException e) {
//            //handle SQL exception
//            e.printStackTrace();
//        } finally {
//            //close resources
//            try {
//                if (statement != null) {
//                    statement.close();
//                }
//                if (connection != null) {
//                    connection.close();
//                }
//            } catch (SQLException ex) {
//                ex.printStackTrace();
//            }
//        }
//    }
}