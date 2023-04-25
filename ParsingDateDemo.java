package april;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ParsingDateDemo {
	//parse( ) a string according to the format stored in the given SimpleDateFormat object.
	
	public static void main(String args[]) {
	      SimpleDateFormat dt = new SimpleDateFormat ("yyyy-MM-dd"); 
	      String input = args.length == 0 ? "2023-04-25" : args[0]; 

	      System.out.print(input + " Parses as "); 
	      Date t;
	      try {
	         t = dt.parse(input); 
	         System.out.println(t); 
	      } catch (ParseException e) { 
	         System.out.println("Unparseable using " + dt); 
	      }
	   }

}
