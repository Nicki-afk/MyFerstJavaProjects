package fileSettings;

import java.awt.*;
import java.io.*;

public class FileManager {

    private File file;
    private FileWriter writer;
    private BufferedReader reader;
    private String lang; // default


    private String nameFile;
    private String nameUser;
    private String country;
    private String city;
    private String currency;


    public FileManager(String nameFile){
        try {
            this.nameFile = nameFile;
            file = new File(nameFile);
            if (!file.exists()) {
                System.out.println("Constructor (FileManager) ,  Answer : created new file(" + nameFile + ") ....");
                file.createNewFile();
                System.out.println("Constructor (FileManager) ,  Answer : File created succes (" + nameFile + ")");
            }
        }catch (Exception e){
            System.out.println("Critical Error[Constructor] (FileManager), Exception 31 ");
        }

    }
    public FileManager(){}

    public FileManager(String nameFile , String nameUser , String country , String lang , String city , String currency ){
        try {
            this.nameFile = nameFile;
            this.nameUser = nameUser;
            this.country = country;
            this.lang = lang;
            this.city = city;
            this.currency = currency;
            System.out.println("Constructor (FileManager) ,  Answer : parameters could be assigned values");
            file = new File(nameFile);
            if (!file.exists()) {
                System.out.println("Constructor (FileManager) ,  Answer : created new file (" + nameFile + ")....");
                file.createNewFile();
                System.out.println("Constructor (FileManager) ,  Answer : File created succes (" + nameFile + ")");
                writeToFile(nameFile);
            }else{
                System.out.println("Constructor (FileManager) ,  Answer : writing to a file...");
                writeToFile("settings.txt");
            }
        }catch (Exception e){
            System.out.println("Critical Error[Constructor] (FileManager), Exception  55");
        }

    }



    public boolean checkFiled(TextField field){
           if(field.getText().equals("") || field.getText() == null){
               return false;
           }else {return true;}

    }





    public boolean checkFile(String name_file){
        try {
            reader = new BufferedReader(new FileReader(name_file));
            if((nameUser = reader.readLine()) != null && (country = reader.readLine()) != null
                        && (lang = reader.readLine()) != null && (city = reader.readLine()) != null
                                                              && (currency = reader.readLine()) != null){
                reader.close();
                return true;
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return false;
    }

    public boolean checkFile(File file){
        try {
            reader = new BufferedReader(new FileReader(file));
            if((nameUser = reader.readLine()) != null && (country = reader.readLine()) != null
                    && (city = reader.readLine()) != null && (lang = reader.readLine()) != null
                    && (currency = reader.readLine()) != null){
                reader.close();
                return true;
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return false;

    }

    public void writeToFile(String file_name){
        try {
            writer = new FileWriter(file_name);
            if(nameUser != null && country != null && city != null && lang != null && currency != null){
                writer.write(nameUser + "\n");
                writer.write(country + "\n");
                writer.write(city + "\n");
                writer.write(lang + "\n");
                writer.write(currency + "\n");
                writer.close();
                System.out.println("Method: writeToFile() , answer : Operation succes ended");
            }else{
                System.out.println("Method: writeToFile() , answer : Every Parametrs null");
            }

        }catch (Exception e){
            e.printStackTrace();
        }
    }


    public String getNameUser() {
        return nameUser;
    }

    public void setNameUser(String nameUser) {
        this.nameUser = nameUser;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getLang() {
        return lang;
    }

    public void setLang(String lang) {
        this.lang = lang;
    }
}
