package packageOne;

public class SamePackageSubClass extends ProtectionLevel {

	public static void main(String[] args) {

	}

	public SamePackageSubClass() {
		System.out.println("Default modifier =" + num);
		// private not accessible
//		System.out.println("Private modifier =" + numpri);
		System.out.println("Protected modifier =" + numpro);
		System.out.println("Public modifier =" + numpub);
	}

}
