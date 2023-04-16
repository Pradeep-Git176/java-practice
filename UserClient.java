package april;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class UserClient {

    public static void main(String[] args) {
        
        Set<User> hashSet = new HashSet<User>();
        
        hashSet.add(new User(101,"Pradeep"));
        hashSet.add(new User(102,"Hari"));
        hashSet.add(new User(103,"Chand"));
        hashSet.add(new User(104,"Vikram"));
        hashSet.add(new User(105,"Raj"));
        hashSet.add(new User(106,"Raj"));
        hashSet.add(new User(107,"Kajol"));
        
        Iterator<User> itr = hashSet.iterator();
        
        while(itr.hasNext()) {
            System.out.println(itr.next());
        }
        
    }

}


