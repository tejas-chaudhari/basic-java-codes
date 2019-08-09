package com.treemap;

public class ID implements Comparable<ID> {

	int id;
	ID()
	{
		
	}
	ID(int id)
	{
		this.id=id;
	}
	@Override
	public int compareTo(ID i1) {
		return this.id-i1.id ;
	}

	public String toString()
	{
		return ""+id;
	}
}

