package packageOne;

public class ProtectionLevel {
	int num = 10;
	private int numpri = 20;
	protected int numpro = 30;
	public int numpub = 40;

	public ProtectionLevel() {
		System.out.println("Default modifier ="+num);
		System.out.println("Private modifier ="+numpri);
		System.out.println("Protected modifier ="+numpro);
		System.out.println("Public modifier ="+numpub);	
	}
	

}
