package com.arraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class Company {

	public static void main(String[] args) {
		
		ArrayList<Employee1> ls=new ArrayList<>();
		ls.add(new Employee1(1,"tejas",31000));
		ls.add(new Developer(2,"raj",32000,"Java"));
		System.out.println(ls);
		
		//using get method
		System.out.println("USING GET METHOD");
		for(int i=0;i<ls.size();i++)
		System.out.println(ls.get(i));
		
		//using foreach
		System.out.println("USING FOR EACH");
		for(Object i:ls)
		{
			System.out.println(i);
		}
		
		//using Iterator
		System.out.println("USING ITERATOR");
		Iterator<Employee1> n=ls.iterator();
		while(n.hasNext())
		{
			System.out.println(n.next());
		}
		
		Iterator <Employee1> m=ls.iterator();
		while(n.hasNext());
		{
			Employee1 e=m.next();
			System.out.println("id "+e.id);
			System.out.println("name "+e.name);
			System.out.println("salary "+e.salary);
			if(e instanceof Developer)
				System.out.println("language "+((Developer)e).lang);
			
		}
		
	}
}
