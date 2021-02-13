package dao;

public class Table {

    private String nameTable;
    private String[] parameters;
    private String allSettings;



    public Table(String nameTable){
        this.nameTable = nameTable;
    }


    public Table(String nameTable , String[]parameters){
        this.nameTable = nameTable;
        this.parameters = parameters;
    }
    public Table(String nameTable , String[]parameters , String allSettings){
        this.nameTable = nameTable;
        this.parameters = parameters;
        this.allSettings = allSettings;
    }

    public String getSqlQuery(){
        String localVar = "";
        if(parameters == null && allSettings == null){
            return "CREATE TABLE " + nameTable + ";";
        }else if(parameters != null && allSettings == null){
            for(int x = 0; x < parameters.length; x++){
                localVar += parameters[x] + ",";
            }
            return "CREATE TABLE " + nameTable + "(" + localVar.substring(0 , localVar.length()-1) + ");";
        }else if(parameters != null && allSettings != null){
            for(int x = 0; x < parameters.length; x++){
                localVar += parameters[x] + ",";
            }
            return "CREATE TABLE " + nameTable + "(" + localVar + allSettings + ");";
        }else {
            return null;
        }

    }

    public static String getSqlQuery(String nameTable , String[] parameters , String allSettings){

        String localVar = "";
      if(parameters != null && allSettings == null){
            for(int x = 0; x < parameters.length; x++){
                localVar += parameters[x] + ",";
            }
            return "CREATE TABLE " + nameTable + "(" + localVar.substring(0 , localVar.length()-1) + ");";
        }else if(parameters != null && allSettings != null){
            for(int x = 0; x < parameters.length; x++){
                localVar += parameters[x] + ",";
            }
            return "CREATE TABLE " + nameTable + "(" + localVar + allSettings + ");";
        }else {
            return nameTable != null ? "CREATE TABLE " + nameTable + ";" : null ;
        }

    }
    public static String getSqlQuery(String nameTable , String[] parameters ){
        String localVar = "";
        if(nameTable != null && parameters != null){
            for(int x = 0; x < parameters.length; x++){
                localVar += parameters[x] + ",";
            }
            return "CREATE TABLE " + nameTable + "(" + localVar.substring(0 , localVar.length()-1) + ");";
        }else{
            return null;
        }
    }
    public static String getSqlQuery(String nameTable){
        return nameTable != null ? "CREATE TABLE " + nameTable + ";" : null;

    }


    public String getNameTable() {
        return nameTable;
    }

    public void setNameTable(String nameTable) {
        this.nameTable = nameTable;
    }


    public String[] getParameters() {
        return parameters;
    }

    public void setParameters(String[] parameters) {
        this.parameters = parameters;
    }

    public String getAllSettings() {
        return allSettings;
    }

    public void setAllSettings(String allSettings) {
        this.allSettings = allSettings;
    }
}
