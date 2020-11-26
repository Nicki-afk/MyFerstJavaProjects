package corePackage;

import checkError.CheckCode;
import checkError.Checker;

public class Core {
    private String byteCode;

    public Core(String byteCode){
        setByteCode(byteCode);
    }

    public String getByteCode() {
        return byteCode;
    }

    public void setByteCode(String byteCode) {
//         checker = new Checker(byteCode);
        if(new Checker(byteCode).checkErrorCode(byteCode) == 1){
            this.byteCode = byteCode;
        }else{

        }

    }

    public String output(String code){
        String var = ""; String ans = "";
        for(int x = 0; x < code.length(); x++){
              if(var.length() == 4){
                  ans += Integer.toString(treatment(var));
                  var = "";

              }else{
                  var += code.charAt(x);
              }
        }
       return ans;
    }public int treatment(String var){
        switch (var){
            case "0001" : return 1; case "0000" : return 0; case "0010" : return 2;
            case "0011" : return 3; case "0100" : return 4; case "0101" : return 5;
            case "0110" : return 6; case "0111" : return 7; case "1000" : return 8;
            case "1001" : return 9; case "1010" : return 10; case "1011" : return 11;
            case "1100" : return 12; case "1101" : return 13; case "1110" : return 14;
            case "1111" : return 15;
            default: return -245;
        }

    }
}
