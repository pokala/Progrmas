package com.interview;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;



public class RandomDateV {

	
	public static void main(String[] args) throws ParseException{
//		 GregorianCalendar gc = new GregorianCalendar();
//
//	        int year = randBetween(2016, 2016);
//
//	        gc.set(gc.YEAR, year);
//
//	        int dayOfYear = randBetween(1, gc.getActualMaximum(gc.DAY_OF_YEAR));
//
//	        gc.set(gc.DAY_OF_YEAR, dayOfYear);
//
//	        System.out.println(gc.get(gc.YEAR) + "-" + (gc.get(gc.MONTH) + 1) + "-" + gc.get(gc.DAY_OF_MONTH));
		
		DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
//		Calendar cal = Calendar.getInstance();
//		System.out.println(dateFormat.format(cal.getTime())); //2014/08/06 16:00:22
//		for(int i=0;i<50;i++){
//		Date d= cal.getTime();
//		System.out.println(d);
//		long offset =d.getTime();
//		Timestamp rand = new Timestamp(offset + 50000000L);
//		Calendar start = Calendar.getInstance();
//		start.setTimeInMillis( rand.getTime() );
//		System.out.println(start.getTime());
//		}
		Calendar calendar = Calendar.getInstance();
		Date myDate = calendar.getTime();
		calendar.setTime(myDate);
//		calendar.add(Calendar.DAY_OF_YEAR, -7);
		Date newDate = calendar.getTime();
		System.out.println(dateFormat.format(newDate));
		//////////////////
//		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Date date = new Date();
		System.out.println(dateFormat.format(date)); //2014/08/06 15:59:48
		
		 String sDate1="12/31/1998";  
		    Date date1=new SimpleDateFormat("dd/MM/yyyy").parse(sDate1);  
		    System.out.println(sDate1+"\t"+date1);  

	}
	public static int randBetween(int start, int end) {
        return start + (int)Math.round(Math.random() * (end - start));
    }
}
