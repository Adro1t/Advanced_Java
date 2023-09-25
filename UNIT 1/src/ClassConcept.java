
public class ClassConcept {
	int data = 30;// instance variable
	static int a = 45;// non instance or static variable

	static void display() {
		System.out.println("data=" + a);
	}

	public static void main(String[] args) {
		ClassConcept obj = new ClassConcept();
		display();
		System.out.println("data=" + obj.data);
		System.out.println("data=" + a);
		ClassConcept obj1 = new ClassConcept();
		System.out.println("data=" + obj1.data);
		System.out.println("data=" + obj1.a);
	}

}

//instance variables: class variables that needs
//object to access these variables
//static variables: those variables which can be directly
//accessed without creating objects