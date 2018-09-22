package screenSaver;

public class CircleController {

	private ScreeFrame screeFrame;
	private static Circle[] circles;

	public CircleController(int WIDTH, int HEIGHT, int CIRCLE_COUNT, int CIRCLE_R) {
		screeFrame = new ScreeFrame("ÆøÅÝÆÁ±£", WIDTH, HEIGHT);

		circles = new Circle[CIRCLE_COUNT];
		for (int i = 0; i < circles.length; i++) {
			int x = (int) (CIRCLE_R + Math.random() * (WIDTH - 2 * CIRCLE_R + 1));
			int y = (int) (CIRCLE_R + Math.random() * (HEIGHT - 2 * CIRCLE_R + 1));
			int vx = randomSpeed();
			int vy = randomSpeed();
			circles[i] = new Circle(x, y, CIRCLE_R, vx, vy);

		}
        screeFrame.setCircles(circles);
        
		new Thread() {
			public void run() {
				while (true) {
					CircleG2d.sleep(1000);
					for (Circle circle : circles) {
						circle.move();
					}
				}

			};
		}.start();

	}

	public int randomSpeed() {
		int speed = (int) (-3 + Math.random() * (3 - (-3) + 1));
		if (speed == 0) {
			return randomSpeed();
		}
		return speed;
	}

}
