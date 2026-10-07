package problem.dynamic_binding;

class Shape {
	protected String name;
	public void paint() {
		draw();
	}
	public void draw() {
		System.out.println("Shape");
	}
}

public class Circle extends Shape {
	@Override
	public void draw() {
		System.out.println("Circle");
	}
	public static void main(String[] args) {
		Shape b = new Circle();
		b.paint();
	}
}