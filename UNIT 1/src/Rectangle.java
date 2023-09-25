
public class Rectangle {
	int length, breadth, height;// instance variable

	// default constructor
	public Rectangle() {
	}

	// parameterized constructor
	public Rectangle(int length) {
		this.length = this.breadth = this.height = length;
	}

	public Rectangle(int length, int breadth) {
//		this.length = length;
		this(length);
		this.breadth = breadth;
	}

	// constructor overloading concept
	public Rectangle(int length, int breadth, int height) {
		this.length = length;
		this.breadth = breadth;
		this.height = height;
	}

	void getData(int length, int b) {
		this.length = length;// using this we removes ambiguity
		breadth = b;
	}

	int area() {
		return length * breadth;
	}

	int volume() {
		return length * breadth * height;
	}

	public static void main(String[] args) {
		Rectangle cube = new Rectangle(5);
		System.out.println("Length=" + cube.length);
		System.out.println("Area=" + cube.area());
		System.out.println("Volume=" + cube.volume());

		Rectangle rect1 = new Rectangle(24, 20);
//		rect1.getData(24, 20);
		System.out.println("Length=" + rect1.length);
		System.out.println("Breadth=" + rect1.breadth);
		System.out.println("Area= " + rect1.area());
		System.out.println("Volume= " + rect1.volume());

		Rectangle rect2 = new Rectangle(30, 20, 50);
		System.out.println("Length=" + rect2.length);
		System.out.println("Breadth=" + rect2.breadth);
		System.out.println("Height=" + rect2.height);
		System.out.println("Volume= " + rect2.volume());
	}

}
