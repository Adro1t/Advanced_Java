package InheritancePackage;

class Room {
	int length, breadth;

	public Room(int length, int breadth) {
		this.length = length;
		this.breadth = breadth;
	}

	int area() {
		return length * breadth;
	}
}

class Bedroom extends Room {
	int height;

	public Bedroom(int length, int breadth, int height) {
		super(length, breadth);//calls room()
//		super.area();
		this.height = height;
	}

	int volume() {
		return length * breadth * height;
	}
}

public class SingleInheritance {

	public static void main(String[] args) {
//		Room R = new Room(56,34);
		Bedroom r = new Bedroom(12, 34, 10);
		System.out.println("Area =" + r.area());
		System.out.println("Volume =" + r.volume());
	}

}
