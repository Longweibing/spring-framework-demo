package org.weebing.springframework;

public class Triangle implements Shape {
	private Point pointA;
	private Point pointB;
	private Point pointC;
	

	public Point getPointA() {
		return pointA;
	}

	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}

	public Point getPointB() {
		return pointB;
	}

	public void setPointB(Point pointB) {
		this.pointB = pointB;
	}

	public Point getPointC() {
		return pointC;
	}

	public void setPointC(Point pointC) {
		this.pointC = pointC;
	}

	public void draw() {
		System.out.println(pointA + "\n" + pointB + "\n" + pointC);
	}
	
	public void myInit() {
		System.out.println("myinit bean init methon");
	}
	
	public void clearUp() {
		System.out.println("clearUp bean destroy methon");
	}

}
