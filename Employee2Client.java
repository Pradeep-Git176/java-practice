package april;

import java.util.ArrayList;
import java.util.List;

public class Employee2Client {
	public static void main(String[] args){
        Employee2 emp1 = new Employee2(101,"Pradeep",450000,9643097512L);
        Employee2 emp2 = new Employee2(102,"Dinesh",560000,6789456733L);
        Employee2 emp3 = new Employee2(103,"Mahesh",560000,4567799022L);
        Employee2 emp4 = new Employee2(104,"Ram",456700,5678900934L);
        Employee2 emp5 = new Employee2(105,"Amit",56780000,5678902756L);
        Employee2 emp6 = new Employee2(106,"Rajkumar",678945678,5667889045L);
        Employee2 emp7 = new Employee2(107,"Anurag",450000,7890568934L);
        Employee2 emp8 = new Employee2(108,"Rajesh",450000,5678903272L);
   
        List<Employee2> list = new ArrayList<>();
        list.add(emp1);
        list.add(emp2);
        list.add(emp3);
        list.add(emp4);
        list.add(emp5);
        list.add(emp6);
        list.add(emp7);
        list.add(emp8);
        
        for(Employee2 empl : list){
            System.out.println(list);
        }
    }
}

