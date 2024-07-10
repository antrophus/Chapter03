package com.javaex.ex02;

public class Point {

	// 필드
	private int x;
	private int y;

	// 생성자
	public Point() {
	}

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	// 메소드 g s
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}

	@Override
	public boolean equals(Object obj) {
		boolean result;
		//this.x==0x777 .x == && this.y == 0x77.y
		Point p = (Point)obj;
		if(this.x == p.x && this.y == p.y) {
			result = true;
//			return true;
		}else {
			result = false;
//			return false;
		}
		
		return result;

	}

}
