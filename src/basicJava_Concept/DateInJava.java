package basicJava_Concept;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class DateInJava {
	
	public static void main(String[] args) {
		
		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS"); 
		Calendar cal = Calendar.getInstance();  
		String DateTime = dateFormat.format(cal.getTime());
		
		System.out.println("DateTime: "+DateTime);
		System.out.println("ScreenShot_"+DateTime+"_.png");
		
		
		//takeScreenShot("ScreenShot_"+DateTime+"_+.png");
	}

}
