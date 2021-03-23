package mainPackage.mainClass.ORM.baseObject;

import org.omg.CORBA.PUBLIC_MEMBER;

public class Table {

    private String nameTable;
    private String[] settingsTable;
    private String allSettings;

   public Table(String nameTable , String[]settingsTable){
       this.nameTable = nameTable;
       this.settingsTable = settingsTable;
    }
    public Table(){}

    public String getQuery(){
       String query = "CREATE TABLE " + this.nameTable + " (";
       for (int x = 0; x < this.settingsTable.length; x++){
           query+= this.settingsTable[x] + ",";
       }
       query = query.substring(0 , query.length()-1) + ");";
       return query;
    }
    public static String getQuery(String nameTable , String[]settingsTable){
        String query = "CREATE TABLE " + nameTable + " (";
        for (int x = 0; x < settingsTable.length; x++){
            query+= settingsTable[x] + ",";
        }
        query = query.substring(0 , query.length()-1) + ");";
        return query;
    }



//    public static boolean isExist(){
//
//    }



}
