package com.tns.azlansami;

public class Rectangle extends Shape {
	int height = 5, width = 3;
	public Rectangle(int h , int w) {
		this.height=h;
		this.width=w;
	}
	public void calArea(){
		super.area = height*width;
	}
}

