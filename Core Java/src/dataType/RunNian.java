package dataType;
import java.util.Scanner;
public class RunNian {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("��������ݣ�");
		int year=scanner.nextInt();
		
//		boolean flag = (year%4==0 && year%100!=0) || year%400==0;
//		String str= flag ? year+"������" : year+"��������";
//		System.out.println(str);
		
		if ((year%4==0 && year%100 != 0) || year==0) {
			System.out.println(year+"������");
		} else {
			System.out.println(year+"��������");
		}
		
        scanner.close();
	}
}
