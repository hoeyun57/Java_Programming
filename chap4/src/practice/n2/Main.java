package practice.n2;

class Cube{
	private int width;
	private int length;
	private int height;
	
	public Cube(int width, int length, int height) {
		this.width = width;
		this.length = length;
		this.height = height;
	}
	
	public int getVolume() {
		return width * length * height;
	}
	
	public void increase(int a, int b, int c) {
		width += a;
		length += b;
		height += c;
	}
	
	public boolean isZero() {
		if(getVolume() == 0) {
			return true;
		}
		return false;
	}
}

public class Main {
	public static void main(String[] args) {
		Cube cube = new Cube(1, 2, 3);
		System.out.println("큐브의 부피는 " + cube.getVolume());
		cube.increase(1, 2, 3);
		System.out.println("큐브의 부피는 " + cube.getVolume());
		if(cube.isZero()) {
			System.out.println("큐브의 부피는 0");
		}
		else {
			System.out.println("큐브의 부피는 0이 아님");
		}
	}
}