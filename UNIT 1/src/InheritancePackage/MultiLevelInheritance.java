package InheritancePackage;

class Car {
	final int no_of_wheels = 4;

	public Car() {
		System.out.println("Car Constructor");
	}

	void vehicleType() {
		System.out.println("Car Type");
	}
}

class Maruti extends Car {
	public Maruti() {
		System.out.println("Maruti Constructor");
	}

	@Override
	public void vehicleType() {
		System.out.println("Type Maruti");
	}

	public void speed() {
		System.out.println("100km/hr");
	}
}

class Maruti800 extends Maruti {
	public Maruti800() {
		System.out.println("Maruti800 Constructor");
	}
	
//	@Override
//	public void vehicleType() {
//		System.out.println("Type Maruti80908");
//	}

	// annotation
	@Override
	public void speed() {
		super.speed();
		System.out.println("180km/hr");
	}
}

public class MultiLevelInheritance {

	public static void main(String[] args) {
		Maruti800 car = new Maruti800();
		System.out.println("Wheels = " + car.no_of_wheels);
		car.vehicleType();
		car.speed();
	}
}
