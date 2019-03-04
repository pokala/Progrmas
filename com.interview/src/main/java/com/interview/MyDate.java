package com.interview;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


public class MyDate {

	public static void main(String args[])
	{
        try {
            Date myDate = new Date();
            for (int i=1;i<=100;i++){
                   
      
          
         // System.out.println(myDate);
          SimpleDateFormat ft = new SimpleDateFormat ("ddMMMyy");           
                Calendar c = Calendar.getInstance();        
                c.add(Calendar.DATE, i);  // number of days to add      
                String tomorrow = (String)(ft.format(c.getTime()));
                System.out.println("Tomorrows date is " + tomorrow);

            }
      } catch (Exception exp) {
          exp.printStackTrace();
      }
  }


}
