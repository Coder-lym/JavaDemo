package flowControl;

public class Buychick {
public static void main(String[] args) {
	System.out.println("百钱买百鸡方案如下：");
	for (int cock=0;cock<=20;cock++) {
		for (int hen=0;hen<=33;hen++) {
			int chick=100-cock-hen;
			int total=cock*5+hen*3+chick/3;
			if (chick%3==0) {
				if (total==100) {
					System.out.println("公鸡："+cock+"，母鸡："+hen+"，小鸡："+chick);
				}
			}
		}
	}
	
   }
}
