package Thread;

public class TicketTest {

	public static void main(String[] args) {
		Ticket ticket = new Ticket(20);
		new Thread(new SaleTicThread(ticket), "����1").start();
		new Thread(new SaleTicThread(ticket), "����2").start();
		new Thread(new SaleTicThread(ticket), "����3").start();
		new Thread(new SaleTicThread(ticket), "����4").start();
	}

}
