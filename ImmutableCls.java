package april;

public class ImmutableCls {
	public static void main(String[] args) 
	{ 
	   String s = "hello"; 
	   s.concat("world"); 
	   // concat() method adds string at the end. 
	 
	   System.out.println(s); //print "hello" because string is immutable object. 
	 } 
	}
