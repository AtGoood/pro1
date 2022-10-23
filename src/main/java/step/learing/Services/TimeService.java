package step.learing.Services;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
public class TimeService implements TimeProvder{
   Date date= new Date();



    public   String getDate()
    {
        String  timeStamp = new SimpleDateFormat("yyyy MM dd").format(Calendar.getInstance().getTime());
        return (timeStamp);

    }//d
   public String getTime()
    {
      String a;
           a=  Long.toString (date.getHours());
           a+=":";
           a+=Long.toString (date.getMinutes());
           return a;
    }
}
