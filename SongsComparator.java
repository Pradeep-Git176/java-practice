package april;

import java.util.Comparator;

public class SongsComparator implements Comparable<SongsComparator> {
	private double rating;
    private String name;
    private int year;
 
    // Used to sort songs by year
    public int compareTo(SongsComparator songcomp)
    {
        return this.year - songcomp.year;
    }
 
    // Constructor
    public SongsComparator(String name, double rating, int year)
    {
        this.name = name;
        this.rating = rating;
        this.year = year;
    }
 
    // Getter methods for accessing data
    public double getRating() { 
    	return rating; 
    	}
    public String getName() { 
    	return name; 
    	}
    public int getYear() { 
    	return year; 
    	}
}
 
// Class to compare Songs by ratings
class RatingCompare implements Comparator<SongsComparator> {
    public int compare(SongsComparator songcomp1, SongsComparator songcomp2)
    {
        if (songcomp1.getRating() < songcomp2.getRating())
            return -1;
        if (songcomp1.getRating() > songcomp2.getRating())
            return 1;
        else
            return 0;
    }
}
 
    