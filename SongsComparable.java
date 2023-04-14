package april;

import java.util.ArrayList;
import java.util.Collections;

public class SongsComparable implements Comparable<SongsComparable>{
	 private double rating;
	 private String name;
	 private int year;
	 
	    // Used to sort songs by year ,, overide compareTo() of comparable interface
	    public int compareTo(SongsComparable sng)
	    {
	        return this.year - sng.year;
	   
	    }
	 
	    // Constructor
	    public SongsComparable(String name, double rating, int year)
	    {
	        this.name = name;
	        this.rating = rating;
	        this.year = year;
	    }
	 
	    // Getter methods for accessing data
	    public double getRating(){
	    	return rating; 
	    	}
	    public String getName(){
	    	return name; 
	    	}
	    public int getYear(){
	    	return year;  
	    	}
	}
	 
	


