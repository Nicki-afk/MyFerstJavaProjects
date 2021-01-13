package mainLogic;

import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class Wther {

    private URL url;
    private URLConnection connection;
    private BufferedReader reader;
    private StringBuffer buffer;
    private int  temp;
    private int maxTemp;
    private int minTemp;
    private int thereTemp;
    private int pressure;
    private JSONObject jsonObject;
    private String urlAdress = "https://api.openweathermap.org/data/2.5/weather?q=" + new ApplicationManager().getCity() + "&APPID=1fc794975c62ec08d2096348249bcfa9&units=metric";

   public Wther(){
       getWther();
   }

    public void getWther(){
        try {
            url = new URL(urlAdress);   String line;
            connection = url.openConnection();
            reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            buffer = new StringBuffer();

            while ((line = reader.readLine()) != null){
                buffer.append(line + "\n");
            }
            reader.close();
            jsonObject = new JSONObject(buffer.toString());
            temp = (int)jsonObject.getJSONObject("main").getDouble("temp");
            maxTemp =(int)jsonObject.getJSONObject("main").getDouble("temp_max");
            minTemp = (int)jsonObject.getJSONObject("main").getDouble("temp_min");
            thereTemp = (int)jsonObject.getJSONObject("main").getDouble("feels_like");
            pressure = (int)jsonObject.getJSONObject("main").getDouble("pressure");

        }catch (Exception e){
//            System.out.println("Error!!!");
            e.printStackTrace();
        }

    }

    public int getTemp() {
        return temp;
    }

    public void setTemp(int temp) {
        this.temp = temp;
    }

    public int getMaxTemp() {
        return maxTemp;
    }

    public void setMaxTemp(int maxTemp) {
        this.maxTemp = maxTemp;
    }

    public int getMinTemp() {
        return minTemp;
    }

    public void setMinTemp(int minTemp) {
        this.minTemp = minTemp;
    }

    public int getThereTemp() {
        return thereTemp;
    }

    public void setThereTemp(int thereTemp) {
        this.thereTemp = thereTemp;
    }

    public int getPressure() {
        return pressure;
    }

    public void setPressure(int pressure) {
        this.pressure = pressure;
    }
}
