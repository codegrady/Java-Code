package Practice;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DateTest {
	
	
	public static void main(String args[]){
		Date date = new Date();
		Calendar calendar = new GregorianCalendar();
		for(int i =0 ;i <7 ;i++){
			calendar.setTime(date);
			calendar.add(calendar.DATE, 1);
			date = calendar.getTime();
			SimpleDateFormat formatter = new SimpleDateFormat("MM-dd");
			String datetime = formatter.format(date);
			System.out.println(date);
			System.out.println(datetime);
		}
		
	}
}
