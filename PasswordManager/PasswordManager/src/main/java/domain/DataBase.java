package domain;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public abstract class DataBase {

     protected String url = "#####################################################";
     protected Connection conn;
     protected Statement stm;

    public void printException(SQLException e){
        System.out.println("SQL_EXCEPTION [ " + e + "]");
    }

    public boolean isConnect(){
        try {
            conn = DriverManager.getConnection(url);
            return true;
        }catch (SQLException e){
            printException(e);
        }
        return false;
    }

    // CREATE
    abstract boolean createD(String nameDatabase);
    abstract boolean createT(String nameTable , String[]values , String[]othersParam);
    // DROP/DELETE
    abstract boolean dropD(String nameDatabase);
    abstract boolean deleteT(String nameTable);
    //INSERT
    abstract boolean insertT(String nameTable , String[]blocks , String[]values);




}
