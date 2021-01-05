package MainClasses;

import AbstractClasses.Checker;

import java.util.ArrayList;

public class CheckPasswordUser implements Checker {


    private String pass;
    private float persentage;

    public CheckPasswordUser(String pass){
        this.pass = pass;
    }

    public String checkThePasswordForEverything(){
        checkPassworLenght();
        checkNumberPassword();
        checkForSpecialChars();
        checkUperCaseAndDownCase();
        return "password strength : " + getPercentage() + "%";

    }



    public float getPercentage() {
        return persentage;
    }

    public CheckPasswordUser checkForSpecialChars(String pass) {
        String var = "";
        char[]specialChars = new char[]{'$' , '#' , '&' , '?' , '!' , '_'};
        char[]chars = pass.toCharArray();
        for(int x = 0; x < specialChars.length; x++) {
            for (int i = 0; i < chars.length; i++) {
                if(specialChars[x] == chars[i]){
                    persentage+=5;
                }

            }
        }
        return this;
    }
    public CheckPasswordUser checkForSpecialChars(){
        char[]specialChars = new char[]{'$' , '#' , '&' , '?' , '!' , '_'};
        char[]chars = pass.toCharArray();
        for(int x = 0; x < specialChars.length; x++) {
            for (int i = 0; i < chars.length; i++) {
                if(specialChars[x] == chars[i]){
                    persentage+=5;
                }

            }
        }
        return this;
    }

    public CheckPasswordUser checkNumberPassword() {
        char[]chars = pass.toCharArray();
        char[]numbers = new char[]{'1','2','3','4','5','6','7','8','9'};
            for(int i = 0; i < chars.length; i++){
               for(int x = 0; x < numbers.length; x++){
                   if(chars[i] == numbers[x]){
                       persentage+=5;
                   }

               }

            }


        return this;

    }


    public CheckPasswordUser checkUperCaseAndDownCase(String pass) {
        for(int i = 0; i < pass.length(); i++){
            for(char x = 'a' , z = 'A';  x < 'z' && z < 'Z'; x++ , z++ ){
                if(pass.charAt(i) == x || pass.charAt(i) == z){
                    persentage+=5;
                }

            }

        }
        return this;

    }
    public CheckPasswordUser checkUperCaseAndDownCase() {


        for (int i = 0; i < pass.length(); i++) {
            for (char x = 'a', z = 'A'; x < 'z' && z < 'Z'; x++, z++) {
                if (pass.charAt(i) == x || pass.charAt(i) == z) {
                    persentage+=5;
                }

            }
        }
        return this;
    }

        public CheckPasswordUser checkPassworLenght (String pass){
            if (pass.length() >= 8) {
                persentage += 2;
            }
            return this;
        }
        public CheckPasswordUser checkPassworLenght(){
            if(pass.length() >= 8){
                persentage+=2;
            }
            return this;
        }

        public int languageInterface(String x) {
            return 0;
        }

        public String getPass() {
            return pass;
        }

        public void setPass(String pass) {
            this.pass = pass;
        }

}
