package may;

import java.util.Optional;

public class OptionalEx {
	public static void main(String[] args){
        String[] str  = new String[5];
        str[2]="PRADEEP";
        
        Optional<String> checknull = Optional.ofNullable(str[2]);
        if(checknull.isPresent()){
            System.out.println(str[2].toLowerCase());
        }
    }

}

