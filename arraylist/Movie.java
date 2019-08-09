package com.arraylist;

public class Movie implements Comparable<Movie>{
	
	String name;
	int year;
	double rating;
	
	Movie()
	{			
	}

    Movie(String name, int year, double rating) {
		this.name = name;
		this.year = year;
		this.rating = rating;
	}
    
    public String toString()
    {
    	return "\nMovie name:"+name+" \nyear of release:"+year+" \nrating:"+rating;
    }

	@Override
	public int compareTo(Movie m) {
		return this.year-m.year;
	}
}
