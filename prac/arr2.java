package com.prac;

public class arr2{

	public static void main(String[] args) {
		
		arr ob []=new arr[3];
		ob[0]=new arr(1,"tejas",31000);
		ob[1]=new arr(2,"raj",32000);
		ob[2]=new arr(3,"akash",33000);
		for(int i=0;i<ob.length;i++)
		{
			System.out.println("id is:"+ob[i].id+" name is:"+ob[i].name+" salary is:"+ob[i].salary);
		}
		
	}
}
