package com.arraylist;

import java.util.Comparator;

public class SongSortByDuration implements Comparator<Song> {

	@Override
	public int compare(Song s1, Song s2) {
		return (int)(s1.duration-s2.duration);
	}
	

}
