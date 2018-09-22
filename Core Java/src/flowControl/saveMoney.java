package flowControl;

public class saveMoney {

	public static void main(String[] args) {
		int day=1;
		double money=2.5;
		while (money<=100) {
			money += 2.5;
			if (day%5==0) {
				money -= 6;
			}
			day++;
		}
		System.out.println(day);
	}

}
