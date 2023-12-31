package multithreadingPackage;

public class ThreadPriority extends Thread {
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() + " is in name");
		System.out.println(Thread.currentThread().getPriority() + " is priority");

	}

	public static void main(String[] args) {
		ThreadPriority t1 = new ThreadPriority();
		t1.setPriority(MIN_PRIORITY);
		ThreadPriority t2 = new ThreadPriority();
		t2.setPriority(NORM_PRIORITY);
		ThreadPriority t3 = new ThreadPriority();
		t3.setPriority(4);
		ThreadPriority t4 = new ThreadPriority();
		t4.setPriority(MAX_PRIORITY);
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}

}
