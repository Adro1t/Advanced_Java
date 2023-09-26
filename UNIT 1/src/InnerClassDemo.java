class Outer {
	int data = 30;

	// member class of outer class
	class Inner {
		void display() {
			System.out.println("Data = " + data);
		}
	}
}

public class InnerClassDemo {	

	public static void main(String[] args) {
		Outer out = new Outer();
		Outer.Inner in = out.new Inner();
		in.display();
	}

}
