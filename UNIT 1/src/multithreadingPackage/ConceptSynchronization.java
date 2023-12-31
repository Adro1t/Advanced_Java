package multithreadingPackage;

class CSITBook {
	static int total_seats = 48;

	static synchronized public void book(int request_seats) {
//		System.out.println("no inconsistent data");
//		synchronized (this) {
			if (total_seats >= request_seats) {
				System.out.println(request_seats + " are booked successfully.");
				total_seats = total_seats - request_seats;
				System.out.println(total_seats + " are available");
			} else {
				System.out.println(request_seats + " are not available");
				System.out.println("only " + total_seats + " are available");
			}
//		}
	}
}

public class ConceptSynchronization extends Thread {
	static CSITBook cb;
	int seat;

	@Override
	public void run() {
		cb.book(seat);
	}

	public static void main(String[] args) {
		cb = new CSITBook();
		ConceptSynchronization req1 = new ConceptSynchronization();
		req1.seat = 15;
		req1.start();
		ConceptSynchronization req2 = new ConceptSynchronization();
		req2.seat = 20;
		req2.start();
		ConceptSynchronization req3 = new ConceptSynchronization();
		req3.seat = 14;
		req3.start();
	}

}
