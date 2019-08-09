package com.arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ALsong {

	public static void main(String[] args) {
		
		ArrayList<Song> al=new ArrayList<>();
		al.add(new Song("inkem",3.50,2019));
		al.add(new Song("yenti",4.0,2018));
		al.add(new Song("nights",6.25,2017));
		al.add(new Song("down",5.25,2016));
		System.out.println(al);
		for(Song n:al)
			System.out.println(n);
		
		Iterator<Song> n=al.iterator();
		while(n.hasNext()) {
			System.out.println(n.next());}

		System.out.println("\nSORT BY RELEASE YEAR");
		Collections.sort(al,new SongSortByYear());
		for(Song m :al)
			System.out.println(m);
		System.out.println("\nSORT BY NAME");
		Collections.sort(al,new SongSortByname());
		for(Song l:al)
			System.out.println(l);
		
		System.out.println("\nSORT BY DURATION");
		Collections.sort(al,new SongSortByDuration());
		for(Song l:al)
			System.out.println(l);
	}
}
