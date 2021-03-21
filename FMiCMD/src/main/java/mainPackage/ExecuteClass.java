package mainPackage;

import java.io.File;
import java.util.Arrays;

public class ExecuteClass {


    private String command;
    private String value;
    private String string = "";
    private  File file;
    private static  ExecuteClass executeClass;





    public static ExecuteClass getInstance(String command){
        return executeClass == null ? executeClass = new ExecuteClass(command) : executeClass;
    }
    public static ExecuteClass getInstance(){
        return executeClass == null ? executeClass = new ExecuteClass() : executeClass;
    }

    private ExecuteClass(String command){
        this.command = getName(command);
        this.value = (string += getValue(command));

    }
    public ExecuteClass(){

    }

    public  String resultCommand(){
//         if(checkCommand()){
//             return string+= value;
//         }else{
//             return string+= value;
//         }
        return null;
    }

    public boolean execute(String command){
        try {
            if ((string += getValue(command)) != null) {
                String[] localArr;
                if (getName(command).equals("cd") && (file = new File(string)).isDirectory()) {
                    System.out.println(">>> " + string);
                } else if (getName(command).equals("gd") && (file = new File(string)).list() != null) {
                    localArr = file.list();
                    for (String x : localArr) {
                        if(new File(string + x).isDirectory()) {
                            System.out.println(">>> [D] " + x);
                        }else{
                            System.out.println(">>> <F> " + x);
                        }
                    }
                } else if(getName(command).equals("CRAM")){
                    System.out.println(">>> [] MEMORY CLEARED SUCCESSFUL []");
                    string = "";
                }else if(getName(command).equals("exit")){
                    System.out.println("<<< PROGRAM_EXECUTE >>>");
                    System.exit(0);

                }else {
                    System.out.println(">>> ERROR PATH NOT FOUND( " + string + " )");

                }

            } else {
                System.out.println("ERROR");
            }
        }catch (NullPointerException e){
            System.out.println(">>> ERROR!!! INVALID COMMAND");
        }
        return false;
    }


        public String getName(String command){
         for (int x = 0; x < command.length(); x++){
             if(command.charAt(x) == ' ' || command.charAt(x) == '\\'){
                 return command.substring(0 , x);

             }
         }
         return null;
        }
        public String getValue(String command){
            for (int x = 0; x < command.length(); x++){
                if(command.charAt(x) == ' ' || command.charAt(x) == '\\'){
                    return command.substring(x+1);

                }
            }
            return null;
        }








}
