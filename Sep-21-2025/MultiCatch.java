package com.tns.azlansami;

public class MultiCatch {

	public static void main(String[] args) {
			int[] arr = new int[3];
			try {
				arr[3]=101;
			}catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("This is catch block for ArrayIndexOutOfBoundsException.");
			}
			catch(ArithmeticException e) {
				System.out.println("This is catch block for ArithmeticException.");
			}
			catch(Exception e) {
				System.out.println("This is Excpetion occurs");
			}
	}

}
