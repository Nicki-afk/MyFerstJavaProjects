package domain;

import time.Time;

import java.awt.*;

public class SupplierQuery extends Query{

    private static SupplierQuery supplierQuery;
    private TextField[]textFields;

    public static SupplierQuery getInstance(TextField[]textFields){
        return supplierQuery == null ? supplierQuery = new SupplierQuery(textFields) : supplierQuery;
    }

    private SupplierQuery(TextField[]textFields){
        if(textFields != null){
            this.textFields = textFields;
        }else{
            System.out.println(Time.getFormatTime() + "ERROR_NULL_POINTER_EXCEPTION ( " + getClass() + " )");
            System.exit(-1);
        }
        
    }




    public Query getQueryCreateTable(){
        // code
    }




    @Override
    protected String getQueryCreateTable(String nameTable, String[] values) {
        return null;
    }

    @Override
    protected String getQueryDeleteTable(String nameTable) {
        return null;
    }

    @Override
    protected String getQueryInsertTable(String nameTable, String[] blocks, String[] values) {
        return null;
    }

    @Override
    protected String getQueryUpdateTable(String nameTable, String[] blocks, String[] values) {
        return null;
    }
}
