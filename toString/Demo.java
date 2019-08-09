package com.toString;


public class Demo {

	int i,j,k,l;
	
	Demo(int i,int j,int k,int l)
	{
		this.i=i;
		this.j=j;
		this.k=k;
		this.l=l;
	}
	
	public String toString()
	{
		return "i:"+i+" j:"+j+" k:"+k+" l:"+l;
	}
	
	public static void main(String[] args) {
		
		Demo ob=new Demo(10,20,30,40);
		System.out.println(ob);
	}
}
