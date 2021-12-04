/*
 * Copyright 2021 by AnhNBT
 */
package vn.aptech.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Nguyen Ba Tuan Anh <anhnbt.it@gmail.com>
 */
public class DBConnection {
    public static Connection getConnection() {
        Connection conn = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            if (conn == null || conn.isClosed()) {
                System.out.println("Connecting...");
                conn = DriverManager.getConnection("jdbc:mysql://localhost:3308/struts2_demo?autoReconnect=true&useSSL=false", "anhnbt", "KhoaiTay@2019");
                System.out.println("Connected.");
            }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        return conn;
    }
}
