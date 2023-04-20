package april;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;



public class HashMapDemo {
	 public static void main(String[] args) {
	        
	        HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
	        
	        
	        hashMap.put(101, "Sanjana");
	        hashMap.put(102, "Pradeep");
	        hashMap.put(103, "Harsh");
	        hashMap.put(104, "Sanjana");
	        hashMap.put(102, "Chand");
	        hashMap.put(105, "Pradeep");
	        hashMap.put(106, "Kareena");
	        hashMap.put(null, null);
	        hashMap.put(107, null);
	        
	        Set set = hashMap.entrySet();
	        
	       Iterator itr = (Iterator) set.iterator();
	        
	        /*
	         * while(itr.hasNext()) {
	         * 
	         * System.out.println(itr.next()); }
	         */
	        
	        
	        
	        hashMap.forEach((key, value)->{
	            System.out.println(key+" "+value);
	        });

	    }

	}

