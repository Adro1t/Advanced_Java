package multithreadingPackage;

class Thread1 extends Thread {
	CSITBook cb;
	int seats;

	public Thread1(CSITBook cb, int seats) {
		this.seats = seats;
		this.cb = cb;
	}

	@Override
	public void run() {
		cb.book(seats);
	}
}

public class StaticSynchronization {

	public static void main(String[] args) {
		CSITBook b1 = new CSITBook();
		Thread1 t1 = new Thread1(b1, 20);
		t1.start();
		CSITBook b2 = new CSITBook();
		Thread1 t2 = new Thread1(b2, 25);
		t2.start();
		CSITBook b3 = new CSITBook();
		Thread1 t3 = new Thread1(b3, 5);
		t3.start();
	}

}
