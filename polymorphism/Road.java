package com.polymorphism;

public class Road { 

	public static void main(String[] args) {
	

	Vehicle V[]=new Vehicle [5];
	
	V[0]=new Vehicle("zen",18);
	V[1]=new Car("alto", 19, "grey");
	V[2]=new City("city", 15, "white", "sedan");
	V[3]=new Vehicle("jaguar", 10);
	V[4]=new City("audi", 14, "white", "luxury");
	
	for(int i=0;i<V.length;i++)
	{
		System.out.println("vehicle name: "+V[i].name);
		System.out.println("mileage is: "+V[i].mileage);
		V[i].move();
		V[i].move("pune");
		if(V[i] instanceof Car)
		    System.out.println("colour is: "+((Car)V[i]).colour);
		if(V[i] instanceof City)
			System.out.println("Type is: "+((City)V[i]).type);
		System.out.println("+++++++++++++++++++++++++++++++++++++");
		
	}
	
}
}