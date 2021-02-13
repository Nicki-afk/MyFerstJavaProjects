















package serverPackage;

import dao.DATABASE;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.WeakHashMap;

public class ServerClass {



    public static void main(String[] args) {


            try(ServerSocket serverSocket = new ServerSocket( 8080)){
                System.out.println("["  + Calendar.getInstance().getTime().toString().substring(11 , 19) + "] ------- SERVER STARTED -------");

                while (true){
                 try(
                     Socket socket = serverSocket.accept();
                     BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
                     BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()))
                 ){
                    System.out.println("["  + Calendar.getInstance().getTime().toString().substring(11 , 19) + "]" +
                             " CONNECTION{" + socket.getInetAddress() + ", " + socket.getPort() + "} ");
                    String x = reader.readLine();

//                         if(x.equals("hello")){
//                            writer.write("HELLO!"); writer.newLine(); writer.flush();
//                         }else{
//                             writer.write("NOOOOOO!"); writer.newLine(); writer.flush();
//                         }
                     switch (x){

                         case  "hello" : writer.write("HELLO!"); writer.newLine(); writer.flush(); break;
                         default: writer.write("NOO!"); writer.newLine(); writer.flush();
                     }


                 }catch (IOException e){

                     System.out.println("["  + Calendar.getInstance().getTime().toString().substring(11 , 19) + "] SERVER ERROR {" +
                             e + "}");

                 }

                }

            }catch (SocketException e) {
                System.out.println("["  + Calendar.getInstance().getTime().toString().substring(11 , 19) + "] CLIENT DISCONNECT");

            }catch (Exception e){
                e.printStackTrace();
                System.out.println("["  + Calendar.getInstance().getTime().toString().substring(11 , 19) + "] SERVER ERROR {" +
                        e + "}");
            }


    }
}
