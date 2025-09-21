package com.tns.finalkey;
class test{
	final int a = 14;
	final void demo1(int a) {
		System.out.println("This is final method"+a);
	}
	void demo1() {
		System.out.println("This is a duplicate method");
	}
}
public class FinalKeyword {

	public static void main(String[] args) {
		test obj = new test();
		obj.demo1();

	}

}

