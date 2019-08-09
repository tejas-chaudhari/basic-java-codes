package com.nonstatic;

public class P11 {
int a;
void test(int a) {
	System.out.println(a);
	this.a=a;
	System.out.println(this.a);
}
public static void main(String[] args) {
	P11 ob=new P11();
	System.out.println(ob.a);
	ob.test(1);
}
}
