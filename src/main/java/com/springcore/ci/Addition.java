package com.springcore.ci;

public class Addition {
	private int a;
	private int b;
	
	public Addition(int a, int b) {
		this.a=a;
		this.b=b;
		System.out.println("constructor int ,int");
	}

	public Addition(double a, double  b) {
		this.a=(int)a;
		this.b=(int)b;
		System.out.println("constructor double , double ");
		
	}
	
	public Addition(String a, String b) {
		this.a=Integer.parseInt(a);
		this.b=Integer.parseInt(b);
		System.out.println("constructor String  ,string ");
	}
	public void doSum() {
		System.out.println("the value of a is"+a);
		System.out.println("the value of b is"+b);
		System.out.println("the sum is ="+ (this.a+this.b));
	}

}
