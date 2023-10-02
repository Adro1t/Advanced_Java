package packageTwo;

import packageOne.ProtectionLevel;

public class DifferentPackageSubClass extends ProtectionLevel {
	public DifferentPackageSubClass() {
		//default and private not accessible
//		System.out.println("Default modifier =" + num);
//		System.out.println("Private modifier =" + numpri);
		System.out.println("Protected modifier =" + numpro);
		System.out.println("Public modifier =" + numpub);
	}
}
