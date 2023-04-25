package april;

// Abstractin using
abstract class Shape {
	private double length;
    private double width;
    
    public Shape(double length, double width) {
       this.length = length; 
       this.width = width;    
     }
    // Declaring abstract method
    public abstract void draw();
    // Defining  method
    public double getArea() { 
      return length*width; 
    } 

}
