package com.app.geometry;
import java.lang.Math;

public class Point2D {
	private int x;
	private int y;
	
	public Point2D() {}
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
	
	public String getDetails() {
		return new String("X: "+ x+" Y :"+y);
	}
	
	public Boolean isEqual(Point2D b){
		if(this.x == b.x && this.y == b.y)
			return true;
		return false;
	}
	
	public int calculateDistance (Point2D b){
		
		int x = this.x - b.x;
		int y = this.y - b.y;
		
		int xsquare = (int) Math.pow(x, 2);
		int ysquare = (int) Math.pow(y, 2);
		
		int distance = (int) Math.sqrt(ysquare + xsquare);
			return distance;
		
	}
	
	

}
