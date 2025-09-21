package com.tns.conoverload;
class practise{
	water(int a , int b){
		System.out.println("This is constructor with 2 parameters");
		int product = a*b;
		System.out.println(product);
	}
	water(int a, int b, int c) {
		System.out.println("This is constructor with 3 parameters");
		int product = a*b*c;
		System.out.println(product);
	}
	water(String a, String b) {
		System.out.println("This is constructor with 2 String parameters");
		String res = a+" "+b;
		System.out.println(res);
	}
	water(String a, int b) {
		System.out.println("This is constructor with a String and int parameters");
		String res = a+" "+b;
		System.out.println(res);
	}
	water(int a, String b) {
		System.out.println("This is constructor with a int and String parameters");
		String res = a+" "+b;
		System.out.println(res);
	}
}
public class ConstructOverload {

	public static void main(String[] args) {
		water obj1 = new water(1,2);
		water obj2 = new water(1,2,3);
		
	

	}

}

