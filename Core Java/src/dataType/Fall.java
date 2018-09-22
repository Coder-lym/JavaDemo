package dataType;
//小数点后保留位数的几种方法
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class Fall {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("请输入物体自由下落时间（单位：秒）：");
		double t=scan.nextDouble();
		double g=9.80;
		double s=0.5*g*t*t;
		
//		一、printf格式化输出，参照C语言
//		System.out.print("经过"+t+"秒，物体自由下落了");
//		System.out.printf("%.2f",s);
//		System.out.print("米。");
		
//		二、math.BigDecimal,设置标度，转换格式
      BigDecimal x=new BigDecimal(s);
      double s1=x.setScale(2,BigDecimal.ROUND_HALF_UP).doubleValue();
      System.out.println(s1);
		
//		三、DecimalFormat方法
//      DecimalFormat df=new DecimalFormat("#.00");
//      String s1 = df.format(s);
//      System.out.println(s1);
       
//	          四、利用NumberFormat的setMaximumFractionDigits()方法设置数的小数部分所允许的最大位数。
//		NumberFormat nf =NumberFormat.getNumberInstance();
//		nf.setMaximumFractionDigits(2);
//		String s1=nf.format(s);
//		System.out.println(s1);
		
//		五.1、使用java.lang.Math.round方法，返回最接近参数的 long。
//		double s1=Math.round(s*100)/100.0;
//		System.out.println(s1);
		
//		五.2、强制转换
//		double s1 = ((int)(s*100))/100.0;
//		System.out.println(s1);
		
        scan.close();
	}

}



