package packageTwo;

import packageOne.ProtectionLevel;

public class DifferentPackageNonSubClass {
	ProtectionLevel pl = new ProtectionLevel();

//same as
//	packageOne.ProtectionLevel pl = new packageOne.ProtectionLevel();

	public DifferentPackageNonSubClass() {
//		only public accessible
//		System.out.println("Default modifier =" + pl.num);
//		System.out.println("Private modifier =" + pl.numpri);
//		System.out.println("Protected modifier =" + pl.numpro);
		System.out.println("Public modifier =" + pl.numpub);
	}
}
