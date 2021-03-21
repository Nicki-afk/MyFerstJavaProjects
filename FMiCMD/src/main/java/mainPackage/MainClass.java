package mainPackage;


import java.util.Scanner;

public class MainClass {

    public static void main(String[] args) {

//       System.out.print(ExecuteClass.getInstance("cd file/filr"));
        String command;
        ExecuteClass executeClass = new ExecuteClass();
        Scanner scanner = new Scanner(System.in);
        System.out.println("$FMiCMD$#preAlpha#");
        System.out.print(">>> "); String stroke = "";
        while (true){
            command = scanner.nextLine();
            ExecuteClass.getInstance().execute(command);
            System.out.print(">>> ");


        }




    }

}
