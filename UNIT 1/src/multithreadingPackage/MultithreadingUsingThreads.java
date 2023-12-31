package multithreadingPackage;

class Good extends Thread {
	@Override
	public void run() {//run when start function is called
		for (int i = 1; i <= 5; i++) {
			System.out.println("Good");

			try {
				Thread.sleep(1000); // 1 second
			} catch (InterruptedException e) {

			}
		}
	}
}

class Morning extends Thread {
	@Override
	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println("Morning");
			try {
				Thread.sleep(1000); // 1 second
			} catch (InterruptedException e) {

			}
		}
	}
}

public class MultithreadingUsingThreads {

	public static void main(String[] args) {
		Good g = new Good();
		g.start();// 5seconds - invokes run() method of thread
		Morning m = new Morning();
		m.start();// 5seconds
	}

}
