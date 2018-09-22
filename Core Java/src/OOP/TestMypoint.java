package OOP;

public class TestMypoint {
	public MyPoint start;
	public MyPoint end;
	public MyPoint stray;

	public static void main(String[] args) {
		MyPoint myPoint1 = new MyPoint();
		MyPoint myPoint2 = new MyPoint();
		myPoint1.x = 10;
		myPoint1.y = 10;
		myPoint2.x = 20;
		myPoint2.y = 30;
		TestMypoint testMyPoint = new TestMypoint();
		testMyPoint.start = myPoint1;
		testMyPoint.end = myPoint2;
		String startStr = testMyPoint.start.toString();
		String endStr = testMyPoint.end.toString();
		System.out.println("Start point is" + startStr);
		System.out.println("End point is" + endStr);

		testMyPoint.stray = testMyPoint.end;
		String strayStr = testMyPoint.stray.toString();
		System.out.println("Stray point is" + strayStr);
		System.out.println("End point is" + endStr);

		myPoint2.x = 47;
		myPoint2.y = 50;
		String strayStr2 = testMyPoint.stray.toString();
		String endStr2 = testMyPoint.end.toString();
		System.out.println("Stray point is" + strayStr2);
		System.out.println("End point is" + endStr2);
		System.out.println("Start point is" + startStr);
	}

}