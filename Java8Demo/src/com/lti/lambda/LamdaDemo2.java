package com.lti.lambda;
//@FunctionalInterface
//interface ISum{
//	int sum(int num1,int num2);
//}
@FunctionalInterface
interface ISum<T>{
	T sum(T num1,T num2);
}
interface ISquare{
	void area(double side);
}
public class LamdaDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		ISum iSum=(int num1,int num2)->{ return num1+num2; };
//		System.out.println("Sum "+iSum.sum(10,20));
//		ISquare iSquare=(double side)->System.out.println("Area "+(side*side));
//		iSquare.area(4);
		
		ISum<Integer> sumInteger=(num1,num2)->(num1+num2);
		System.out.println("Sum "+sumInteger.sum(10, 20));
		ISum<Double> sumDouble=(num1,num2)->{ return num1+num2;};
		System.out.println("Sum= "+sumDouble.sum(10.2, 20.2));
		
	}

}
