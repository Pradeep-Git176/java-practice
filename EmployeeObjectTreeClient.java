package april;

import java.util.Iterator;
import java.util.TreeSet;

public class EmployeeObjectTreeClient {
	 public static void main(String[] args){
	        TreeSet<EmployeeObject> treeSet = new TreeSet<>();
	        treeSet.add(new EmployeeObject(101,"pihu",450000.0));
	        treeSet.add(new EmployeeObject(102,"Dinesh",34000.0));
	        treeSet.add(new EmployeeObject(103,"SP",780000));
	        treeSet.add(new EmployeeObject(104,"titu",670000.0));
	        treeSet.add(new EmployeeObject(105,"Ram",5600000.00));
	        Iterator<EmployeeObject> iterator = treeSet.iterator();
	        while (iterator.hasNext()){
	            System.out.println(iterator.next());
	        }
	    }
	}

