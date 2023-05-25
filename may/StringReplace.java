package may;

/*
public class StringReplace {
	public static void main(String[] args) {
	    String str1 = "bat ball";

	    // replace b with c
	    System.out.println(str1.replace('b', 'c'));

	  }
	}
*/

public class StringReplace {
	 public static void main(String[] args) {
		    String str1 = "abc cba";

		    // all occurrences of 'a' is replaced with 'z'
		    System.out.println(str1.replace('a', 'z'));  // zbc cbz

		    // all occurences of 'P' is replaced with 'R'
		    System.out.println("PuNJAB".replace('P', 'R'));  // Java

		    // character not in the string
		    System.out.println("Pradeep".replace('3', 'f'));  // Hello

		  }
		}

