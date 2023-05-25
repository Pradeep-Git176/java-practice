package may;

public class StringReplaceAll {
	public static void main(String[] args) {
	    String str1 = "Pradeep123is456Boy";

	    // regex for sequence of digits
	    String regex = "\\d+";

	    // replace all occurrences of numeric
	    // digits by a space
	    System.out.println(str1.replaceAll(regex, " "));


	  }
	}
//The syntax of the replaceAll() method is:
//string.replaceAll(String regex, String replacement)
