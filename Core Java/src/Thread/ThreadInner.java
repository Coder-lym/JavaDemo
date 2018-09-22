package Thread;

public class ThreadInner {

	public static void main(String[] args) {

		new Thread() {
			public void run() {
				for(int i=0;i<=10;i++) {
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					System.out.println("ÍæÓÎÏ·");
				}
				
			};
		}.start();
		
		
		
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				for(int i=0;i<=10;i++) {
					try {
						Thread.sleep(600);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					System.out.println("ÌýÒôÀÖ");
				}
				
			}
		}).start();
		
		
		
	}

}
