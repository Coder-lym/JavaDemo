package flowControl;
import java.util.Scanner;  //导入java的util包下的Scanner类
public class Age {
public static void main(String[] args) {
	System.out.println("请输入年龄：");
	Scanner scan=new Scanner(System.in);  //声明
	int age=scan.nextInt();               //接收输入的数据，并存储在age里
	if (age>=18) {
		System.out.println("您已成年。");
	} else {
		System.out.println("您是未成年人。");
	} 
	scan.close();
  }
}
