package april;

import java.util.Date;

public class DateDemo {
	public static void main(String args[]) {
	      // Instantiate a Date object
	      Date date = new Date();
	  
	      // display formatted date
	      System.out.printf("%s %tB %<te, %<tY", "Due date:", date);
	      //a format string can indicate the index of the argument to be formatted.
	      // index must immediately follow the % and it must be terminated by a $.
	      
	      // display time and date  , tc- Complete date and time
	      String str = String.format("Current Date/Time : %tc", date );

	      System.out.println(str);
	   }
	}

