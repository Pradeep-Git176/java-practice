package april;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class UserrQue {
	 public static void main(String[] args) {
	        Queue<Userr> users = new PriorityQueue<>();
	        Userr user = new Userr(101, "dinesh", "allahabad", "prayagraj", "dinehs123@74950@gmail.com", 78451200l, 78000.0f);
	        Userr user1 = new Userr(102, "Amit", "abhinav", "allahabad", "mit123@gmail.com", 7845123690l, 78000.0f);
	        Userr user2 = new Userr(103, "anupam", "noida", "pune ", "np123@", 7845632190l, 780000f);
	        Userr user3 = new Userr(104, "Ambuj", "mumbai", "maharastra", "mbj123@gmail.com", 8774523604l, 7800000f);
	        users.add(new Userr(101, "Dinesh", "godgav", "115c/3b", "dineshyadav74950@gmail.com", 78451200l, 7800.0f));
	        List<Userr> list = new LinkedList<>();
	        list.add(user);
	        list.add(user1);
	        list.add(user2);
	        list.add(user3);
	        System.out.println("---This logging only for users---");
	        Iterator<Userr> iterator =users.iterator();
	        while (iterator.hasNext()){
	            System.out.println(iterator.next());                    
	        }
	        System.out.println("---This logging only with for loop ---");
	        for(Userr usr : list) {
	            System.out.println(usr);
	        }
	    }

	}


