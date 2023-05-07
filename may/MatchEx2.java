package may;

import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatchEx2 {
	 public static void main(String[] args) {
	        List<String> emails = Arrays.asList("pk.061294@gmail.com", "santosh@gmail.com", "sonu@gmail.com",
	                "ajaypatapsingh22345@gmail.com", "amitjee@yahoo.com","A214453@*@gmail.com");
	        
	        String regx = "^[a-zA-Z0-9._-]+@[a-zA-Z0-9-]+\\.[a-zA-Z.]{2,18}$";
	        
	        Pattern p = Pattern.compile(regx);
	        for (String email : emails) {
	            Matcher m = p.matcher(email);
	            if (m.matches()) {
	                System.out.println(email + " -> matches ");
	            } else {
	                System.out.println(email + " -> not matches ");
	            }

	        }

	    }
	}


