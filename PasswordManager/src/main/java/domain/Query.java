package domain;

import java.awt.*;

public abstract class Query {

    private String createTable = "CREATE TABLE ";
    private String dropTable = "DELETE TABLE ";
    private String insertTable = "INSERT INTO ";
    private String updateTable = "UPDATE TABLE ";



    // MAIN
    protected abstract String getQueryCreateTable(String nameTable , String[]values);
    protected abstract String getQueryDeleteTable(String nameTable);
    protected abstract String getQueryInsertTable(String nameTable , String[]blocks , String[]values);
    protected abstract String getQueryUpdateTable(String nameTable , String[]blocks , String[]values);


}
