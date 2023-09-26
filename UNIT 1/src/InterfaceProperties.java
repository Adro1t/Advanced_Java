interface Student {
	void method();// signature or prototype

	public abstract void method1();// same as above

	int a = 25; // final static and public (final=constant)
}

interface Book extends Student {
	void method3();
}

interface Hello {
	int a = 45;
}

class Copy {
	int pen;
}
//abstract class Student{
//	abstract void method();
//}
// in class overide not mandatory but in imterface it is

//class inheritance = extends
//interface inheritance = implements
//interface to interface= extends

//HYBRID INHERITANCE
public class InterfaceProperties extends Copy implements Hello, Book, Student {

	public static void main(String[] args) {
//		Student st = new Student();
		System.out.println(Student.a);
		System.out.println(Hello.a);
	}

	// added unimplemented method
	@Override
	public void method() {
//		System.out.println(a);
	}

	@Override
	public void method1() {
		// TODO Auto-generated method stub

	}

	@Override
	public void method3() {
		// TODO Auto-generated method stub

	}

}
