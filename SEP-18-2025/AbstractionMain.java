package com.tns.septeighteen;

public class AbstractionMain {

	public static void main(String[] args) {
		Square s = new Square(10);
		Rectangle r = new Rectangle();
		s.calArea();
		s.show();
		r.calArea(3,3);
		r.show();

	}

}

