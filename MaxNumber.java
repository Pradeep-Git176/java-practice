package may;

import java.util.Arrays;
import java.util.List;

// find max number using java 8
public class MaxNumber {
	    public static void main(String[] args) {
	        List<Integer> list = Arrays.asList(5, 6, 2, 9, 5, 4, 63, 555, 36, 8, 522, 2966, 0, 299, -546);
	        Integer maximum = list.stream().max(Integer::compare).get();
	        System.out.println(maximum);
	    }
	}


