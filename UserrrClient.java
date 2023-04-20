package april;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class UserrrClient {
	 public static void main(String[] args) {
	        
	        Set<Userrr> hashSet = new HashSet<Userrr>();
	        
	        hashSet.add(new Userrr(101,"Ashish"));
	        hashSet.add(new Userrr(102,"Hari"));
	        hashSet.add(new Userrr(103,"Chand"));
	        hashSet.add(new Userrr(104,"Vikram"));
	        hashSet.add(new Userrr(105,"Kajol"));
	        hashSet.add(new Userrr(105,"Kajol"));
	        hashSet.add(new Userrr(105,"Kajol"));
	        
	        Iterator<Userrr> itr = hashSet.iterator();
	        
	        while(itr.hasNext()) {
	            System.out.println(itr.next());
	        }
	        
	    }

	}

