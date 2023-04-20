package april;

import java.util.ArrayList;
import java.util.Collections;

public class Customer1Client {
	 public static void main(String[] args) {
	        
	        
	        //create the object of array list
	        ArrayList<Customer1> list = new ArrayList<>();
	        
	        // add customer object in to array list object
	        list.add(new Customer1("Abhi", "Purnia", 35));
	        list.add(new Customer1("Rahul", "Katihar", 20));
	        list.add(new Customer1("Deepak", "Madhepura", 24));
	        list.add(new Customer1("Anmol", "Kishanganj", 28));
	        list.add(new Customer1("Soni", "Araria", 32));
	        
	        System.out.println("Before Sorting: Customer list :- \n");

	        list.forEach((c)->System.out.println(c));
	        
	        
	        Collections.sort(list, (c1,c2)->c1.getName().compareTo(c2.getName()));
	    
	    }

	}


