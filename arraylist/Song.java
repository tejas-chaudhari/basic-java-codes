package com.arraylist;

public class Song implements Comparable<Song>{

	String name;
	double duration;
	int year;
	
	Song(){
		
	}
	Song(String name,double duration,int year)
	{
		this.name=name;
		this.duration=duration;
		this.year=year;
	}
	@Override
	public String toString() {
		return "Song name="+name+",duration="+duration+",year="+year ;
	}
	@Override
	public int compareTo(Song s1) {
		return this.year-s1.year;
	}
	
}
