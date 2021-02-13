package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DATABASE {

    private static String linkConnection = "jdbc:postgresql://localhost/#####?user=########&password=##########&ssl=#####";
     static Connection conn;
     static  Statement stm;
     static ResultSet set;

    private static DATABASE database;


    public static DATABASE getInstance(){
        return database == null ? database = new DATABASE() : database;
    }


    public static boolean connect(){
        try {
            conn = DriverManager.getConnection(linkConnection);
            return true;
        }catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

}
