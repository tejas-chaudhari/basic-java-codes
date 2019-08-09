package com.staticnonstatic;

public class Object {
int x;//non-static variable

public static void main(String[] args) {
	Object ob=new Object();
	System.out.println(ob);
	System.out.println(ob.x);
}
}
