package checkError;

import corePackage.Core;
import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

public class Checker {

    private String code;
    public String err;

  public  Checker(String code){
      setCode(code);

  }
  Checker(){}

    public String getCode() {
      if(err != null) {
          System.out.println("CAN'T RETURN VALUE DUE TO ERROR : [ERROR (1) -> INVALID_CODE]");
      }else {
          return code.replace(" ", "");
      }
      return err ;
    }

    public void setCode(String code) {
      switch (checkErrorCode(code)){
          case -1 : err = "ERROR EMPATY VARIBALE(" + checkErrorCode(code) + ")";
          System.out.println(err); break;
          case -2 : err = "ERROR INVALID CHARACTER(" + checkErrorCode(code) + ")";
          System.out.println(err); break;
          case 1 : err = null; this.code = code;
          default: System.out.println(checkErrorCode(code));
      }
    }

    /** Cheking for invalid characters in the code entered
    * by the user  */

    public int checkErrorCode(String code) {
        if (code == null) {
            return -1;

        } else {
           for(int x = 0; x < code.length(); x++){
               for(char i = 'a'; i < 'z'; i++ ){
                       if (code.charAt(x) == i) {
                           return -2;
                       }
               }
               for(char i = 'A'; i < 'Z'; i++){
                   if(code.charAt(x) == i){
                       return -2;
                   }

               }
           }
            return 1;
        }
    }
}
