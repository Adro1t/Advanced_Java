package multithreadingPackage;

class TotalEarnings extends Thread {
	int total = 0;

	@Override
	public void run() {
		synchronized (this) {// hold lock
			for (int i = 1; i <= 48; i++) {
				total += 125000;
			}
			this.notify();// release lock
		}
	}
}

public class WaitandNotify {

	public static void main(String[] args) throws InterruptedException {
		TotalEarnings te = new TotalEarnings();
		te.start();
		synchronized (te) {
//			try {
//				te.wait();
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
			te.wait();
		}
		System.out.println("total earnings= " + te.total);

	}

}
