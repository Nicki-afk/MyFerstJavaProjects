package mainLogic;

import Interfaces.Manager;
import fileSettings.FileManager;
import javafx.scene.control.TextField;

public class ApplicationManager implements Manager {

    private String nameUser;
    private String country;
    private String city;
    private String lang;
    private String currency;

   private  FileManager fileManager;


    public ApplicationManager(){
        fileManager = new FileManager("settings.txt");
    }





   public ApplicationManager(TextField nameFiled , TextField countryFiled ,
                             TextField cityFiled , String lang , TextField currencyFiled){
        nameUser = nameFiled.getText();
        country = countryFiled.getText();
        city = cityFiled.getText();
        this.lang = lang;
        currency = currencyFiled.getText();
        fileManager = new FileManager("settings.txt" , nameUser , country , city , lang , currency);

   }
   public void startApp(){
        if(fileManager.checkFile("settings.txt")){
            System.out.println("Method: startApp(), answer : application started succes");
            if(getLang().equals("RUSSIAN")){
                new LoagWindow("/styleApplicationRu.fxml");
            }else{
                new LoagWindow("/styleApplication.fxml");
            }
        }else{
            System.out.println("Method: startApp(), answer : application started succes");
            new LoagWindow("/ferstRunWindow.fxml");
        }

   }

    public String getNameUser() {
        if(fileManager.checkFile("settings.txt")){
            return fileManager.getNameUser();

        }else {
            return null;
        }
    }

    public String getCountry() {
        if(fileManager.checkFile("settings.txt")){
            return fileManager.getCountry();

        }else {
            return null;
        }
    }

    public String getCity() {
        if(fileManager.checkFile("settings.txt")){
            return fileManager.getCity();

        }else {
            return null;
        }
    }

    public String getLang() {
        if(fileManager.checkFile("settings.txt")){
            return fileManager.getLang();

        }else {
            return null;
        }
    }

    public String getCurrency() {
        if(fileManager.checkFile("settings.txt")){
            return fileManager.getCurrency();

        }else {
            return null;
        }
    }
}
