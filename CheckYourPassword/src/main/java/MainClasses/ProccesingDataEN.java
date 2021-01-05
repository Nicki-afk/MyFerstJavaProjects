package MainClasses;

import AbstractClasses.ProcessingData;

public class ProccesingDataEN implements ProcessingData {

    private String recomendation;

    private CheckPasswordUser checkPasswordUser;

    public ProccesingDataEN(CheckPasswordUser checkPasswordUser){
        this.checkPasswordUser = checkPasswordUser;
    }

    public ProccesingDataEN(){}





    public String resultCheck(CheckPasswordUser cpu) {
        cpu
                .checkPassworLenght()
                .checkNumberPassword()
                .checkForSpecialChars()
                .checkUperCaseAndDownCase()
        ;
        if(cpu.getPercentage() <= 20){
            recomendation = "ATTENTION! YOUR PASSWORD IS NOT SECURE !!!";

        }else if(cpu.getPercentage() > 50){
            recomendation = "Your password is relatively secure and not as vulnerable to hacking.";
        }else if(cpu.getPercentage() > 20 && cpu.getPercentage() < 50 ){
            recomendation = "Your password is weak enough to be vulnerable to hacking.";

        }

        return recomendation;
    }
    public String resultCheck(){
        checkPasswordUser
                .checkPassworLenght()
                .checkNumberPassword()
                .checkForSpecialChars()
                .checkUperCaseAndDownCase()
        ;
        if(checkPasswordUser.getPercentage() <= 20){
            recomendation = "ATTENTION! YOUR PASSWORD IS NOT SECURE !!!";

        }else if(checkPasswordUser.getPercentage() > 50){
            recomendation = "Your password is relatively secure and not as vulnerable to hacking.";
        }else if(checkPasswordUser.getPercentage() > 20 && checkPasswordUser.getPercentage() < 50 ){
            recomendation = "Your password is weak enough to be vulnerable to hacking.";

        }

        return recomendation;
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
