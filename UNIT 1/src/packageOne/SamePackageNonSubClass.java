package packageOne;

public class SamePackageNonSubClass {
	ProtectionLevel pl = new ProtectionLevel();

	public SamePackageNonSubClass() {
		System.out.println("Default modifier =" + pl.num);
		//private not accessible
//		System.out.println("Private modifier =" + pl.numpri);
		System.out.println("Protected modifier =" + pl.numpro);
		System.out.println("Public modifier =" + pl.numpub);
	}
}
