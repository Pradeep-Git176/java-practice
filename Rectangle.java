package april;

public class Rectangle extends Shape{
	public Rectangle(double length, double width) {
	       super(length,width);    
	     }
	public void draw() { 
	       System.out.println("Drawing Rectangle"); 
	     }     
	    public static void main (String args[]) {
	       // Shape object referring to rectangle.
	       Shape shape = new Rectangle(15,10);
	       shape.draw(); 
	       System.out.println("Area of rectangle = "+shape.getArea());
	    }

}
