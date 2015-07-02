package ba.bitcamp.homeworkLectures3;

import java.awt.Color;

public class Point {

	private int x;
	private int y;
	private int size;
	private boolean isFill;
	private Color color;
	private int x1;
	private int y1;
	
	
	public Point(int x, int y, int size, Color color) {
		this.x = x;
		this.y = y;
		this.size = size;
		this.color = color;
	}

	public Point(int x, int y , int x1, int y1, int size, Color color){
		this(x,y,size,color);
		this.x1 = x1;
		this.y1 = y1;
	}
	
	
	public int getX1() {
		return x1;
	}

	public void setX1(int x1) {
		this.x1 = x1;
	}

	public int getY1() {
		return y1;
	}

	public void setY1(int y1) {
		this.y1 = y1;
	}

	public boolean isFill() {
		return isFill;
	}



	public void setFill(boolean isFill) {
		this.isFill = isFill;
	}



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

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

}
