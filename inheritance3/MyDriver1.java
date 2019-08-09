package com.inheritance3;

public class MyDriver1 {

	public static int count;
	
	static void Display(Vehicle v)
	{
		System.out.println("Vehicle name is: "+v.name);
		System.out.println("unique number is: "+v.uno);
		if(v instanceof TwoWheeler)
		System.out.println("Vehicle colour is: "+((TwoWheeler)v).colour);
	    if(v instanceof Bike)
		System.out.println("Vehicle mileage is: "+((Bike)v).mileage);
		System.out.println("++++++++++++++++++++++++++");
	}
	public static void main(String[] args) {
	
		TwoWheeler ob=new Bike("wego", "white",25);
		Display(ob);
		TwoWheeler ob2=new Bike("FZ", "green",35);
		Display(ob2);
		TwoWheeler t=new TwoWheeler("jupiter","purple");
		Display(t);
		Vehicle v=new Vehicle("car");
		Display(v);
		
	}
}
