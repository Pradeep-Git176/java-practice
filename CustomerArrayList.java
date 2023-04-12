package april;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CustomerArrayList {
	 public static void main(String[] args) {

         Customer c1=new  Customer(1001,"Rajesh","Purnia",200000,"rajesh1.@gmail.com",9832367460L);
         Customer c2=new  Customer(1002,"Aaryan singh","Bgp",400000,"aaryan123.@gmail.com",9862367460L);
         Customer c3=new  Customer(1003,"Manohar","Delhi",300000,"manoahar@gmail.com",7852367460L);
         Customer c4=new  Customer(1004,"jagesh","Ranchi",505000,"jagesh@gmail.com",7002367460L);
         Customer c5=new  Customer(1005,"Priya","Mumbai",6500000,"priya1@gmail.com",8322367460L);
         Customer c6=new  Customer(1006,"kartik","Chennaii",700000,"kartik@gmail.com",7562367460L);
         Customer c7=new  Customer(1007,"Om","Allahabad",700000,"om@gmail.com",7562367460L);
         Customer c8=new  Customer(1008,"Harsh","Delhi",600000,"harsh@gmail.com",7562367460L);
         Customer c9=new  Customer(1009,"Santosh","kolakatta",2300000,"santosh@gmail.com",7562367460L);
         Customer c10=new  Customer(1010,"Bijendra","bhuvneshwar",400000,"bijendra@gmail.com",7562367460L);
         List<Customer> list=new ArrayList<>();
         list.add(c1);
         list.add(c2);
         list.add(c3);
         list.add(c4);
         list.add(c5);
         list.add(c6);
         list.add(c7);
         list.add(c8);
         list.add(c9);
         list.add(c10);
         
         Iterator<Customer> itr=list.iterator();
         while(itr.hasNext())
         {
             System.out.println(itr.next());
         }
    }


}
