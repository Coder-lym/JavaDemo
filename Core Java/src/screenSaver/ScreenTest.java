package screenSaver;

public class ScreenTest {
	public static final int CIRCLE_COUNT = 10;  // Ô²µÄ¸öÊý
	public static final int CIRCLE_R = 50;
    private static final int WIDTH = 600;
	private static final int HEIGHT = 600;
	
	public static void main(String[] args) {
		CircleController circleController = new CircleController(WIDTH, HEIGHT, CIRCLE_COUNT, CIRCLE_R);

	}

}
