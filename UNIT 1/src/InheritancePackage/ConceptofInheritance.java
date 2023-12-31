package InheritancePackage;

//BASE / PARENT /SUPER
class Fruit {
	public Fruit() {
		System.out.println("Very Good for health");
	}

	void Taste() {
		System.out.println("Tastes good");
	}
}

//DERIVED / CHILD / SUB
class Apple extends Fruit {
	public Apple() {
		System.out.println("I am apple");
	}

	void Color() {
		System.out.println("RED | YELLOW | GREEN");
	}
}

public class ConceptofInheritance {

	public static void main(String[] args) {
		Apple a = new Apple();
		a.Taste();// method of base class
		a.Color();// method of derived class
	}

}
