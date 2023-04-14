package april;

import java.util.ArrayList;
import java.util.Collections;

public class SongsMain {
	 public static void main(String[] args)
	    {
	        ArrayList<SongsComparable> list = new ArrayList<SongsComparable>();
	        list.add(new SongsComparable("Ooo Bekhabar", 8.3, 2015));
	        list.add(new SongsComparable("jile jara", 8.7, 2011));
	        list.add(new SongsComparable("kum faya", 8.8, 2009));
	        list.add(new SongsComparable("kesariya tera ishq", 8.4, 2023));
	 
	        Collections.sort(list);
	 
	        System.out.println("Songs after sorting by year : ");
	        for (SongsComparable songs: list)
	        {
	            System.out.println(songs.getName() + " " +songs.getRating() + " " +songs.getYear());
	        }

	    }
}
