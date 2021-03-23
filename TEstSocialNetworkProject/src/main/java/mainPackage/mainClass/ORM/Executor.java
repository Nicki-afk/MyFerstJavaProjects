package mainPackage.mainClass.ORM;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public abstract class Executor implements DATA {

    private Connection conn;
    private Statement stm;


    public boolean isConnect(){
       try{
           conn = DriverManager.getConnection(url);
           return true;
       }catch (SQLException e){
           System.out.println("SQL_EXCEPTION BLOCK[S:19,CLASS={" + getClass() + "}EXCEPTION[" + e + "]]");
       }catch (NullPointerException e){
           System.out.println("NULL_POINTER_EXCEPTION BLOCK[S:21,CLASS={" + getClass() + "}EXCEPTION[" + e + "]]");
       }
       return false;
    }

    public boolean createDataBase(String name){
        try {
            String query = "CREATE DATABASE " + name;
            conn = DriverManager.getConnection(url);
            stm = conn.createStatement();
            stm.execute(query);
            return true;
        }catch (SQLException e){
            System.out.println("SQL_EXCEPTION BLOCK[S:31,CLASS={" + getClass() + "}EXCEPTION[" + e + "]]");
        }catch (NullPointerException e){
            System.out.println("NULL_POINTER_EXCEPTION BLOCK[S:33,CLASS={" + getClass() + "}EXCEPTION[" + e + "]]");
        }
        return false;
    }
    public boolean dropDataBase(String name){
        try {
            String query = "DROP DATABASE " + name;
            conn = DriverManager.getConnection(url);
            stm = conn.createStatement();
            stm.execute(query);
            return true;
        }catch (SQLException e){
            System.out.println("SQL_EXCEPTION BLOCK[S:31,CLASS={" + getClass() + "}EXCEPTION[" + e + "]]");
        }catch (NullPointerException e){
            System.out.println("NULL_POINTER_EXCEPTION BLOCK[S:33,CLASS={" + getClass() + "}EXCEPTION[" + e + "]]");
        }
        return false;
    }

    abstract boolean createTable();
    abstract boolean deleteTable();
    abstract boolean insertTable();
    abstract boolean deleteBlockTable();


}
