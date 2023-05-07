package may;

import java.util.regex.Pattern;

public class RegularSplit {
	 public static void main(String[] args) {

	        Pattern p = Pattern.compile("\\s");

	        String[] str = p.split("Durga software solution");

	        for (String s : str) {
	            System.out.println(s);
	        }

	    }

}
