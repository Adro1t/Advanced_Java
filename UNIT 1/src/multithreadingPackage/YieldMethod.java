package multithreadingPackage;

public class YieldMethod extends Thread {
	@Override
	public void run() {
		Thread.yield();
		for (int i = 1; i <= 3; i++) {
			System.out.println(Thread.currentThread().getName() + " is in control");
		}
	}

	public static void main(String[] args) {
		YieldMethod ym = new YieldMethod();
		ym.start();
		for (int i = 1; i <= 3; i++) {
			System.out.println(Thread.currentThread().getName() + " is in control");
		}
	}

}
