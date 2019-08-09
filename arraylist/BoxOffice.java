package com.arraylist;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class BoxOffice {

	public static void main(String[] args) {
		
		ArrayList<Movie> ls=new ArrayList<>();
		ls.add(new Movie("Bahubali",2016,5.0));
		ls.add(new Movie("Sholay",1971,4.7));
		ls.add(new Movie("Avengers",2019,4.7));
		ls.add(new Movie("Sairat",2017,1.0));
		ls.add(new Movie("Kirik Party",2016,3.5));
		
		System.out.println("_____________________________");
		System.out.println("BEFORE SORTING");
		System.out.println("_____________________________");
		for(Movie m:ls)
		System.out.println(m);
		
		System.out.println("_____________________________");
		System.out.println("AFTER SORTING BY YEAR");
		System.out.println("_____________________________");
		Collections.sort(ls);
		for(Movie m:ls)
			System.out.println(m);
		
		System.out.println("_____________________________");
		System.out.println("SORT BY RATING");
		System.out.println("_____________________________");
		Collections.sort(ls, new SortByRating());
		for(Movie m:ls)
			System.out.println(m);
		
        System.out.println("_____________________________");
        System.out.println("SORT BY NAME");
        System.out.println("_____________________________");
		Collections.sort(ls, new SortByName());
		for(Movie m:ls)
			System.out.println(m);
		
	}
}
