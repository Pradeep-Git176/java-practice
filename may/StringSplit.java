package may;

public class StringSplit {
	 public static void main(String[] args) {
	        
	        String str = "www.pradeep.com";
	        
	        String[] strArr = str.split("[.]");
	        
	        for(String s:strArr) {
	            System.out.println(s);
	        }

	    }

	}


