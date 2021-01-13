package mainLogic;

import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class Currency {

    private ApplicationManager manager = new ApplicationManager();

    private URL url;
    private URLConnection connection;
    private BufferedReader reader;
    private String buffer;

    private JSONObject jsonObject;
    private String usdCurrency = "https://free.currconv.com/api/v7/convert?q=USD_"+ manager.getCurrency() + "&compact=ultra&apiKey=f40d4466496c3cc24939";
    private String eurCurrency = "https://free.currconv.com/api/v7/convert?q=EUR_"+ manager.getCurrency() + "&compact=ultra&apiKey=f40d4466496c3cc24939";
    private String gbpCurrency = "https://free.currconv.com/api/v7/convert?q=GBP_"+ manager.getCurrency() + "&compact=ultra&apiKey=f40d4466496c3cc24939";




    public Currency(String currency){
        openConnection(currency);
    }


    private void openConnection(String currency){
        try {
            switch (currency){
                case "USD" :  url = new URL(usdCurrency); break;
                case "EUR" :  url = new URL(eurCurrency); break;
                case "GBP" :  url = new URL(gbpCurrency); break;
             }
            connection = url.openConnection();
            reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            buffer = reader.readLine(); reader.close();
            jsonObject = new JSONObject(buffer);

        }catch (Exception e){

        }
    }


    public float getUsd_userCurrency() {
        return  (float) jsonObject.getDouble("USD_" + manager.getCurrency());
    }

    public float getEur_userCurrency() {
        return  (float) jsonObject.getDouble("EUR_" + manager.getCurrency());
    }

    public float getGbp_userCurrency() {
        return  (float) jsonObject.getDouble("GBP_" + manager.getCurrency());
    }
}
