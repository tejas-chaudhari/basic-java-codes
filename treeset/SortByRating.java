package com.treeset;

import java.util.Comparator;

public class SortByRating implements Comparator<Movie> {

	@Override
	public int compare(Movie m1, Movie m2) {
		return (int)(m1.rating-m2.rating);
	}
	
	

}
