package com.utility.crud;

import java.sql.Connection;
import java.sql.SQLException;

public class Runnable {
    public Runnable() {
        insert();
    }

    void insert() {
        Connection conn = DbConnect.getConnection();
        String insertQuery = "INSERT INTO studentinfo VALUES (1, 'ram', 'butwal')";
        java.sql.Statement stmt;
        
        try {
            stmt = conn.createStatement();
            stmt.executeUpdate(insertQuery);
            System.out.println("Insert successful");
        } catch (SQLException e) {
            System.out.println("Insert failed: " + e.getMessage());
            e.printStackTrace();
        } finally {
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException e) {
                System.out.println("Failed to close connection: " + e.getMessage());
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        new Runnable();
    }
}
