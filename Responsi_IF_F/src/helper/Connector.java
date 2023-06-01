/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helper;

import com.mysql.cj.jdbc.MysqlDataSource;
import java.sql.*;

/**
 *
 * @author Lab Informatika
 */
public class Connector {

    static Connection con;
    static String dbName = "db_lomba";
    static String dbUser = "root";
    static String dbPasswd = "";

    public static Connection getConnection() {
        if (con == null) {
            MysqlDataSource data = new MysqlDataSource();
            data.setDatabaseName(dbName);
            data.setUser(dbUser);
            data.setPassword(dbPasswd);
            
            try {
                con = data.getConnection();
                System.out.println("Connected");
            } catch (SQLException e) {
                System.out.println("Error CONNECTING: " + e.getMessage());
            }
        }
        return con;
    }

}
