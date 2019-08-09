package com.treeset;

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
    	return "Movie name:"+name+" year of release:"+year+" rating:"+rating;
    }

	@Override
	public int compareTo(Movie m) {
		return this.year-m.year;
	}
}
