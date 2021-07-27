package com.lti.lambda;
interface ISample{
	void method1();
	default void method2() {
		System.out.println("This is default method in interface");
	}
}

public class DefaultMethodDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	ISample obj=()->{
		System.out.println("Implemented abstract method");
	};
	obj.method1();
	obj.method2();

}
}