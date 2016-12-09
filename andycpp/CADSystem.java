package andycpp;

import java.util.*;

class Shape {
	Shape(int i) {
		System.out.println("Shape constructor");
	}
	void cleanup() {
		System.out.println("Shape cleanup");
	}
}

class Circle extends Shape {
	Circle(int i) {
		super(i);
		System.out.println("Circle constructor");
	}
	void cleanup() {
		super.cleanup();
		System.out.println("Drawing a Circle");
	}
}

class Triangle extends Shape {
	Triangle(int i) {
		super(i);
		System.out.println("Triangle constructor");
	}
	void cleanup() {
		super.cleanup();
		System.out.println("Drawing a Triangle");
	}
}

class Line extends Shape {
	private int start, end;
	Line(int start, int end) {
		super(start);
		this.start = start;
		this.end = end;
		System.out.println("Drawing a line: " + start + "," + end);
	}
	void cleanup() {
		System.out.println("Erasing a line: " + start + "," + end);
		super.cleanup();
	}
}

public class CADSystem extends Shape {
	private Circle c;
	private Triangle t;
	private Line[] lines = new Line[10];
	CADSystem(int i) {
		super(i + 1);
		for (int j = 0; j < 10; j++) {
			lines[j] = new Line(j, j*j);
		}
		c = new Circle(1);
		t = new Triangle(1);
		System.out.println("Combined constructor");
	}
	void cleanup() {
//		super.cleanup();
		t.cleanup();
		c.cleanup();
		for(int i = 0; i < lines.length; i++){
			lines[i].cleanup();
		}
		System.out.println("CADSystem.cleanup()");
	}
	
	public static void main(String[] args) {
		CADSystem x = new CADSystem(47);
		try {
			
		} finally {
			x.cleanup();
		}
	}
}
