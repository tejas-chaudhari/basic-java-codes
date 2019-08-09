package com.treeset;

import java.util.TreeSet;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public class BoxOffice  {

	public static void main(String[] args) {
		
		TreeSet<Movie> ts=new TreeSet<>();
		ts.add(new Movie("Bahubali",2015,5.0));
		ts.add(new Movie("Sholay",1971,3.7));
		ts.add(new Movie("Avengers",2019,4.0));
		ts.add(new Movie("Sairat",2016,1.0));
		ts.add(new Movie("Kirik Party",2017,2.5));
		
		System.out.println(ts);
		
		System.out.println("\nUSING FOR EACH");
		for(Movie n:ts)
			System.out.println(n);
		
		System.out.println("\nUSING ITERATOR");
		
		Iterator<Movie> n=ts.iterator();
		while(n.hasNext())
			System.out.println(n.next());
		
		System.out.println("\nSORT BY RATING");
		TreeSet<Movie>ts1=new TreeSet<>(new SortByRating());
		ts1.addAll(ts);
	    for(Movie m:ts1)
	    	System.out.println(m);
		
		System.out.println("\nSORT BY NAME");
		TreeSet<Movie>ts2=new TreeSet<>(new SortByName());
		ts2.addAll(ts);
	    for(Movie m:ts2)
	    	System.out.println(m);
		
	}
}
