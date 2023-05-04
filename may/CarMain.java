package may;

public class CarMain {
	public static void main(String[] args)
    {
        Maruti m = new Maruti();
        m.run();
        
        Tata t = new Tata();
        t.run();
        t.speed();
        
        Hyundai h = new Hyundai();
        h.brake();
        h.brake();
    }
}


