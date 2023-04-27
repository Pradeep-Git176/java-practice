package april;

import java.util.HashMap;
import java.util.Map;

public class MainImmutable {
	 public static void main(String[] args)
	    {
	 
	        // Creating Map object with reference to HashMap
	        Map<String, String> map = new HashMap<>();
	 
	        // Adding elements to Map object using put()
	        map.put("1", "first");
	        map.put("2", "second");
	 
	        StudentImmutable s = new StudentImmutable("ABC", 101, map);
	 
	        System.out.println(s.getName());
	        System.out.println(s.getRegNo());
	        System.out.println(s.getMetadata());
	        
	        map.put("3", "third");
	        // Remains unchanged due to deep copy in constructor
	        System.out.println(s.getMetadata());
	        s.getMetadata().put("4", "fourth");
	        // Remains unchanged due to deep copy in getter
	        System.out.println(s.getMetadata());
	    }
	 

}
