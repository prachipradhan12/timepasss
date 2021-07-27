package com.lti.lambda;

interface AddCalc1 {
	void sum(int num1, int num2);
}

//class AddCalcImpl implements AddCalc{
//
//	@Override
//	public void sum(int num1, int num2) {
//		// TODO Auto-generated method stub
//		System.out.println("Sum "+(num1+num2));
//		
//	}
//	
//}
public class LamdaDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		AddCalc add=new AddCalcImpl();
//		add.sum(10, 20);

		// anonymous class:can only be used singleton object
//		AddCalc addCalc = new AddCalc() {
//
//			@Override
//			public void sum(int num1, int num2) {
//				// TODO Auto-generated method stub
//				System.out.println("Sum " + (num1 + num2));
//
//			}
//		};
//		addCalc.sum(10, 20);
		// anonymous function
		AddCalc1 addCalc = (int num1, int num2) -> {
			// TODO Auto-generated method stub
			System.out.println("Sum " + (num1 + num2));
		};
		addCalc.sum(10, 20);
	}

}
