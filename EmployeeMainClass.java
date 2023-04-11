package april;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class EmployeeMainClass {
	 public static void main(String[] args) {

	        ArrayList list = new ArrayList();

	        list.add(new Employee(103, "Parwez"));
	        list.add(new Employee(105, "Sunny"));
	        list.add(new Employee(101, "Aarti"));
	        list.add(new Employee(104, "Mohit"));
	        list.add(new Employee(102, "Rajesh"));

	        System.out.println("Before Sorting");
	        
	        //by using lambda expression
	        list.forEach((c)->System.out.println(c));
	        
	        System.out.println("After Sorting on name");

	        Collections.sort(list, (Employee e1,Employee e2)->((Employee) e1).getName().compareTo(((Employee) e2).getName()));
	        Iterator<Employee> itr = list.iterator();
	        while (itr.hasNext()) {
	            System.out.println(itr.next());

	            
	        }
	    }
	    }


