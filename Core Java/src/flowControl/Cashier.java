package flowControl;
import java.util.Scanner;
public class Cashier {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	
	System.out.println("请输入商品单价：");
	double unitprice=scan.nextDouble();
	
	System.out.println("请输入数量：");
	double amount=scan.nextDouble();
	
	System.out.println("请输入金额：");
	double money=scan.nextDouble();
	scan.close();
	
	double total=unitprice*amount;  
	
	if (total>=100) {
		total *= 0.8;    //满100，打八折
	}
    if (money>=total) {
		double little = money-total;
		System.out.println("应收金额："+total+",找零："+little);
	}else {
		System.out.println("应收金额："+total+" 抱歉，您给的钱不够！");
	}
	
  }
}
