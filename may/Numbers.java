package may;

public class Numbers implements Subtraction{
	
    // Defining subtract method
    public int subtract (int a, int b)
    {
        int k = a - b;
        return k;
    }
    public static void main(String[] args)
    {
 
        // Creating an instance of Numbers class
        Numbers n = new Numbers();
        System.out.println(n.subtract(25, 10));
    }

}
