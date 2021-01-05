package MainClasses;

import AbstractClasses.ProcessingData;

import java.util.ArrayList;

public class ProcessingDataRU implements ProcessingData {

     private String recomendation;

    private CheckPasswordUser checkPasswordUser;

    public ProcessingDataRU(CheckPasswordUser checkPasswordUser){
        this.checkPasswordUser = checkPasswordUser;
    }

    public ProcessingDataRU(){}


    public String resultCheck(CheckPasswordUser cpu) {
        cpu
                .checkPassworLenght()
                .checkNumberPassword()
                .checkForSpecialChars()
                .checkUperCaseAndDownCase()
                ;
        if(cpu.getPercentage() <= 20){
            recomendation = "ВНИМАНИЕ! ВАШ ПАРОЛЬ НЕ БЕЗОПАСЕН !!! ";

        }else if(cpu.getPercentage() > 50){
            recomendation = "Ваш пароль относительно надежен и не так уязвим для взлома.";
        }else if(cpu.getPercentage() > 20 && cpu.getPercentage() < 50 ){
            recomendation = "Ваш пароль достаточно слабый , и может быть уязвим к взлому ";

        }

        return recomendation;
    }
    public String resultCheck(){

        return null;
    }

    protected String modifiedPassword(){
        char[]arr = new char[]{'$' , '#' , '&' , '?' , '!' , '_'};
        String recomPass = "";
        for(int x = 0; x < this.checkPasswordUser.getPass().length() ; x++ ){
            recomPass+= this.checkPasswordUser.getPass().charAt(x);
                if(recomPass.length() > 1 && recomPass.length() < 8){
                    for(int i = 0; i < 3; i++) {
                        recomPass += arr[(int) (Math.random() * (5 - 0) + 1) + 0];
                        recomPass += (int) (Math.round(Math.random() * (10 - 0) + 1) + 0);
                    }
                }
        }
        return  recomPass;

    }
    public String recomondedPassword() {
       return  modifiedPassword();
    }
}
