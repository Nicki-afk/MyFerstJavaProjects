package dao;

import org.omg.CORBA.PUBLIC_MEMBER;

import java.sql.SQLException;

public class CRUD {



     // CREATE STATIC METHODS
    public static boolean CREATE_DATABASE(String nameDataBase){
        return false;
    }

    public static boolean CREATE_TABLE(String name , String[]parametersTable)  {
        try {
            String localVar = "" , query = "";
            if (!DATABASE.connect()) {
                return false;
            } else {

                for (int x = 0; x < parametersTable.length; x++){
                    localVar += parametersTable[x] + ",";
                }
                query = "CREATE TABLE " + name + " (" + localVar.substring(0, localVar.length()-1) + ");";

                DATABASE.stm = DATABASE.conn.createStatement();
                DATABASE.stm.execute(query);
                DATABASE.stm.close();
                return true;
            }
        }catch (Exception e){
           return false;

        }

    }

    public static boolean CREATE_TABLE(String name , String[]parametersTable , String allParameters)  {
        try {
            String localVar = "" , query = "CREATE TABLE " + name +"(";
            if (!DATABASE.connect()) {
                return false;
            } else {

                for (int x = 0; x < parametersTable.length; x++){
                    query += parametersTable[x] + ",";

                }
                query += allParameters + ");";
                DATABASE.stm = DATABASE.conn.createStatement();
                DATABASE.stm.execute(query);
                DATABASE.stm.close();
                return true;
            }
        }catch (Exception e){
            e.printStackTrace();
            return false;

        }

    }





    public static boolean CREATE_PARAMETER(String sqlQuery){
        return false;
    }



    // CREATE ORDINARY METHODS

    public boolean CREATE_TABLE(Table table){

        try{
            DATABASE.stm = DATABASE.conn.createStatement();
            DATABASE.stm.execute(table.getSqlQuery());
            DATABASE.stm.close();
            return true;
        }catch (Exception e){
         return false;
        }
    }

    public boolean CREATE_TABLE(Table[] tables){
        try {
            String query = "";
            for (int x = 0; x < tables.length; x++) {
                query += tables[x].getSqlQuery();
            }
            DATABASE.stm = DATABASE.conn.createStatement();
            DATABASE.stm.execute(query);
            DATABASE.stm.close();
            return true;
        }catch (Exception e){
            return false;
        }
    }


    // READ
    public static String[] READ_TABLE(String name){
        // Метод возвращает все что есть в таблице

        try {



        }catch (Exception e){
            e.printStackTrace();
        }

        return null;
    }


    public static String READ(String nameColumn , String nameRow){
        // Возвращает конкретное значение из таблицы
        return null;
    }

    // READ ORDINARY METHODS

//    public  String READ(Table table){
//
//    }

    // INSERT


    public static boolean INSERT(String nameTable , String column , String value){

        try {
            String localVar = "" , query = "";
            if (!DATABASE.connect()) {
                return false;
            } else {

                query = "INSERT INTO  " + nameTable + " (" + column + ") VALUES("+value+");";

                DATABASE.stm = DATABASE.conn.createStatement();
                DATABASE.stm.execute(query);
                DATABASE.stm.close();
                return true;
            }
        }catch (Exception e){
            return false;

        }
    }
    public static boolean INSERT(String nameTable , String[]column , String[] value){

        try {
            String[]localVars  = new String[column.length];  String query = "";
            if (!DATABASE.connect()) {
                return false;
            } else {
                for (int x = 0; x < column.length; x++){
                    localVars[0] += column[x] + ",";
                }

                query = "INSERT INTO  " + nameTable + " (" + column + ") VALUES("+value+");";

                DATABASE.stm = DATABASE.conn.createStatement();
                DATABASE.stm.execute(query);
                DATABASE.stm.close();
                return true;
            }
        }catch (Exception e){
            return false;

        }
    }






    // UPDATE
    public static boolean UPDATE_DATABASE(String[]vars){
        return false;
    }

    public static boolean UPDATE_DATABASE(String var){
        return false;
    }

    public static boolean UPDATE_TABLE(String[]vars){
        return false;
    }

    public static boolean UPDATE_TABLE(String var){
        return false;
    }

    public static boolean UPDATE_VALUE_TABLE( String nameTable, String value , String updateValue){
        return false;
    }

    public static boolean UPDATE_SPECIFIC_VALUE_TABLE(String nameTable , String column , String row , String value , String updateValue){
        return false;
    }


    public static boolean UPDATE_SPECIFIC_VALUE_TABLE(String[]data , String value , String updateValue){
        return false;
    }

    // DELETE


    public static boolean DELETE_DATABASE(String nameDatabase){
        return false;
    }

    public static boolean DELETE_TABLE(String nameTable){

        try {
            String query = "DROP TABLE " + nameTable;
            if (!DATABASE.connect()) {
                return false;
            } else {
                DATABASE.stm = DATABASE.conn.createStatement();
                DATABASE.stm.execute(query);
                DATABASE.stm.close();
                return true;
            }
        }catch (Exception e){
            return false;

        }
    }

    public static boolean DELETE_TABLE(String[]nameTables){
        try {
            String query = "DROP TABLE "; String localVar = "";
            if (!DATABASE.connect()) {
                return false;
            } else {
                for(int x = 0; x < nameTables.length; x++){
                    localVar += nameTables[x] + ",";
                }
                query += localVar.substring(0 , localVar.length()-1) + ";";
                DATABASE.stm = DATABASE.conn.createStatement();
                DATABASE.stm.execute(query);
                DATABASE.stm.close();
                return true;
            }
        }catch (Exception e){
            return false;

        }
    }

    public static boolean DELETE_VALUE_TABLE(String nameTable , String value){
        return false;
    }


    public static boolean DELETE_VALUE_TABLE(String nameTable , String[]values){
        return false;
    }


    public static boolean DELETE_ALL_TABLE(){
        return false;
    }


    public static boolean DELETE_ALL_TABLE(String[]tablesToDelete){
        return false;
    }


    public static boolean DELETE_ALL_IN_TABLE(){
        return false;
    }


    public static boolean DELETE_ALL_IN_TABLE(String except){
        return false;
    }


    public static boolean DELETE_ALL_IN_TABLE(String[]except){
        return false;
    }


    // OLD METHODS


    public static boolean SEND_SQL_QUERY(String query){
        return false;
    }



    public static boolean EXIST(String nameTable){
        return false;

    }
}
