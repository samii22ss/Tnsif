package com.tns.azlansami;

public class MainthreadLC {

	public static void main(String[] args) {
		
		
		Thread th=new ThreadLifeCycleDemo();
		System.out.println("Before runnable state thread is alive or not  "+th.isAlive());
		th.start();
		try {
			Thread.sleep(450);
			
		}
		catch(Exception e) {
			System.err.println(e.getMessage());
		}
		System.out.println("After completion of execution,it is alive or not  "+th.isAlive());

	}

}
