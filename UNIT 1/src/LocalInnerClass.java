class OuterLocal {
	int data = 35;

	void method() {
		class InnerLocal {
			void print() {
				System.out.println("Data = " + data);
			}
		}
		InnerLocal in = new InnerLocal();
		in.print();
	}
}

public class LocalInnerClass {

	public static void main(String[] args) {
		OuterLocal out = new OuterLocal();
		out.method();

	}

}
