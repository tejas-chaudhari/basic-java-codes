package com.treeset;

import java.util.Comparator;

public class SortByName implements Comparator<Movie>{

	@Override
	public int compare(Movie m1, Movie m2) {
		return m1.name.compareTo(m2.name);
	}
	

}
