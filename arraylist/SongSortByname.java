package com.arraylist;

import java.util.Comparator;

public class SongSortByname implements Comparator<Song>{

	@Override
	public int compare(Song s1, Song s2) {
		return s1.compareTo(s2);
	}

}
