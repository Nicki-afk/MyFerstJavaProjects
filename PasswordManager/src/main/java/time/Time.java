package time;

import java.util.Date;

public class Time extends Date {


    public static final Integer TIME_CONNECTION = 3000; // mls


    public static String getFormatTime(){
        return new Time().format();
    }



    private String format(){
        String time =  "[" + getHours() + ":" + getMinutes() + ":" + getSeconds() + "]";
        return time;

    }
}
