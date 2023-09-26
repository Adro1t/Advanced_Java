final class ABC {
	static int a;

	void method() {
		System.out.println("Hello");
		System.out.println("data= " + a);
	}

	static {
		a = 5;
	}
}

public class FinalProperty {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ABC ab = new ABC();
		ab.method();
	}

}

//Final classes cannot be sub-classed or inherited.
//Final classes can be instantiated.
//Final variables cannot be modified,i.e. constant.
//Final variables can be initialized inside constructor.
//Final and static variables can be initialized within static