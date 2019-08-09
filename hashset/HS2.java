package com.hashset;

import java.util.ArrayList;
import java.util.Iterator;

public class HS2 {

	public static void main(String[] args) {
		ArrayList hs=new ArrayList();
		hs.add(10);
		hs.add(20.0);
		hs.add("sheela");
		hs.add(null);
		hs.add(new Employee(55));
		
		for (Object h:hs)
			System.out.println(h);
		
		Iterator n = hs.iterator();
				while(n.hasNext())
					System.out.println(n.next());
	}
}
