package april;

import java.util.ArrayList;
import java.util.Collections;

public class SongsComparatorMain {
	public static void main(String[] args)
    {
        ArrayList<SongsComparator> list = new ArrayList<SongsComparator>();
        list.add(new SongsComparator("Ooo Bekhabar", 8.5, 2015));
        list.add(new SongsComparator("jile jara", 8.7, 2011));
        list.add(new SongsComparator("nachh meri rani", 8.2, 2021));
        list.add(new SongsComparator("nazm nazm", 8.3, 2016));
 
        // Sort by rating : (1) Create an object of ratingCompare
        //                  (2) Call Collections.sort
        //                  (3) Print Sorted list
        System.out.println("Sorted by rating");
        
        RatingCompare ratingCompare = new RatingCompare();
        Collections.sort(list, ratingCompare);
        for (SongsComparator SongsComparator : list)
            System.out.println(SongsComparator.getRating() + " "+ SongsComparator.getName() + " "+ SongsComparator.getYear());
 
        // Uses Comparable to sort by year
        System.out.println("Sorted by year");
        Collections.sort(list);
        for (SongsComparator SongsComparator : list)
            System.out.println(SongsComparator.getYear() + " "+ SongsComparator.getRating() + " "+ SongsComparator.getName() + " ");
    }
}
