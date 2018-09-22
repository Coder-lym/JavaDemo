package Thread;

public class TicketTest {

	public static void main(String[] args) {
		Ticket ticket = new Ticket(20);
		new Thread(new SaleTicThread(ticket), "窗口1").start();
		new Thread(new SaleTicThread(ticket), "窗口2").start();
		new Thread(new SaleTicThread(ticket), "窗口3").start();
		new Thread(new SaleTicThread(ticket), "窗口4").start();
	}

}
