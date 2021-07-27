package com.lti.lambda;

import java.util.Scanner;

interface AddCalc {
	void sum(int num1, int num2);
}
interface Shape {
	void area();
}

public class LamdaDemo {

	public static void main(String[] args) {
		//lambda expression
		AddCalc addCalc = (int num1, int num2) -> {
			// TODO Auto-generated method stub
			System.out.println("Sum " + (num1 + num2));
		};
		addCalc.sum(10, 20);
		
		Shape sp1=()->{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter Radius ");
			double radius=sc.nextDouble();
			System.out.println("Area of circle="+(3.14*radius*radius));
		};
		sp1.area();
		Shape sp2=()->{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter length and breadth ");
			int length=sc.nextInt();
			int breadth=sc.nextInt();
			System.out.println("Area of rectangle "+(length*breadth));
			
		};
		sp2.area();
	}

}
