package april;

import java.util.ArrayList;
import java.util.Collections;

// reverse the list by reverse()
public class StudentArrayListReverse {
	 public static void main(String[] args) {
         ArrayList<Students> arrayList = new ArrayList<Students>();
         arrayList.add(new Students("Pradeep",28));
         arrayList.add(new Students("Rahul",24));
         arrayList.add(new Students("Shaheed",21));
         arrayList.add(new Students("Abhishek",28));
         arrayList.add(new Students("Amit",23));
         arrayList.add(new Students("Laxman",27));
         
         System.out.println("Before reverse : " + arrayList);
         
      // Using reverse() method to reverse the element order
         Collections.reverse(arrayList);
         
         System.out.println("After reverse List: " + arrayList);
             
        }
     }




