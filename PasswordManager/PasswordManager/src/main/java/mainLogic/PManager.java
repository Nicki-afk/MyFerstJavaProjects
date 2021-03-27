package mainLogic;

import com.sun.org.apache.bcel.internal.generic.GETFIELD;

import java.util.Random;

public class PManager{

    private final Integer MAX_VALUE = 20;
    private final Integer MIN_VALUE = 5;

    private static PManager pManager;

    private static String PASSWORD;



    public static PManager getInstance(){
        return pManager == null ? pManager = new PManager() : pManager;
    }

    private Character[]alphabet = {
            'A' , 'a' , 'B' , 'b' , 'C' , 'c' ,
            'D' , 'd' , 'E' , 'e' , 'F' , 'f' ,
            'G' , 'g' , 'H' , 'h' , 'I' , 'i' ,
            'J' , 'j' , 'K' , 'k' , 'L' , 'l' ,
            'M' , 'm' , 'N' , 'n' , 'O' , 'o' ,
            'P' , 'p' , 'Q' , 'q' , 'R' , 'r' ,
            'S' , 's' , 'T' , 't' , 'U' , 'u' ,
            'V' , 'v' , 'W' , 'w' , 'X' , 'x' ,
            'Y' , 'y' , 'Z' , 'z'
    };

    private Character[]specialsCharacter = {
      'ℂ' , '℄' , 'ℒ' , '◻' , '◼' , '◆' , '◇' , '♢' ,
       '▶' , '▷' , '◀' , '◁' , '⌘' ,  '◯' , '@' , '!' ,
            '$' , '%' , '^' , '&' , '*' , '~' , '`' , '_' , '|'
    };


    public void  generatePass(Integer var , String mainWord , Boolean checkBox){
        String pass = mainWord.substring(0 , new Random().nextInt(mainWord.length()));
        int x = 0;
        if(var > MAX_VALUE || mainWord.length() < 3){
            PASSWORD = null;
        }else if(checkBox == null){

            while (pass.length() < var){
                pass += alphabet[new Random().nextInt(alphabet.length)]; x++;
            }
            PASSWORD = pass;

        }else{
            if(!checkBox) {
                while (pass.length() < var){
                    pass += specialsCharacter[new Random().nextInt(specialsCharacter.length)];x++;
                }
                PASSWORD = pass;


            }else if(checkBox == null){
                while (pass.length() < var){
                    pass += mainWord.charAt(new Random().nextInt(mainWord.length()));
                }
                PASSWORD = pass;

            } else{
                while (pass.length() < var){
                    pass += new Random().nextInt(9); x++;
                }
                PASSWORD = pass;

            }

        }

    }  public void  generatePass(Integer var , Boolean checkBox){
        String pass = ""; int x = 0;
        if(var > MAX_VALUE){
            PASSWORD = null;
        }else if(checkBox == null){
            while (pass.length() < var){
                pass += alphabet[new Random().nextInt(alphabet.length)]; x++;
            }
            PASSWORD = pass;

        }else{
           if(!checkBox){
               while (pass.length() < var){
                   pass += alphabet[new Random().nextInt(alphabet.length)]; x++;
                   pass += specialsCharacter[new Random().nextInt(specialsCharacter.length)]; x++;
               }
               PASSWORD = pass;

           }else{
               while (pass.length() < var){
                   pass += alphabet[new Random().nextInt(alphabet.length)]; x++;
                   pass += new Random().nextInt(9);
               }
               PASSWORD = pass;

           }


        }


    }


    public String  generatePass(){
        String pass = ""; int x = 0;
        while (x < 8){ pass += alphabet[new Random().nextInt(alphabet.length)]; x++; }
        PASSWORD = null;
        return  pass;

    }

    public static String getPASSWORD() {
        return PASSWORD;
    }

    public static void setPASSWORD(String PASSWORD) {
        PManager.PASSWORD = PASSWORD;
    }
}