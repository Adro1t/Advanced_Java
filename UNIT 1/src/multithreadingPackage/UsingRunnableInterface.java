package multithreadingPackage;

class Hello implements Runnable {

	@Override
	public void run() {

		for (int i = 1; i <= 5; i++) {
			System.out.println("Hello");
			try {
				Thread.sleep(1000); // 1 second
			} catch (InterruptedException e) {

			}
		}
	}

}

class Hi implements Runnable {

	@Override
	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println("Hi");
			try {
				Thread.sleep(1000); // 1 second-- wait some threads for certain time
			} catch (InterruptedException e) {

			}
		}

	}

}

public class UsingRunnableInterface {

	public static void main(String[] args) {
		Hi hi = new Hi();
		Thread t2 = new Thread(hi);// it invokes hi's run method
		t2.start();

		Hello hello = new Hello();
		Thread t1 = new Thread(hello);
		t1.start();// it invokes hello's run method
	}

}
