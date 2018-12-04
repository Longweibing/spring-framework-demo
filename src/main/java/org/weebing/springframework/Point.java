package org.weebing.springframework;

import org.springframework.beans.factory.BeanNameAware;

public class Point implements BeanNameAware {
	private int x;
	private int y;
	private String beanName;
	
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
		return this.beanName + ": Point [x=" + x + ", y=" + y + "]";
	}
	@Override
	public void setBeanName(String beanName) {
		this.beanName = beanName;
		
	}
}
