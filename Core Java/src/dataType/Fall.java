package dataType;
//С�������λ���ļ��ַ���
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class Fall {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("������������������ʱ�䣨��λ���룩��");
		double t=scan.nextDouble();
		double g=9.80;
		double s=0.5*g*t*t;
		
//		һ��printf��ʽ�����������C����
//		System.out.print("����"+t+"�룬��������������");
//		System.out.printf("%.2f",s);
//		System.out.print("�ס�");
		
//		����math.BigDecimal,���ñ�ȣ�ת����ʽ
      BigDecimal x=new BigDecimal(s);
      double s1=x.setScale(2,BigDecimal.ROUND_HALF_UP).doubleValue();
      System.out.println(s1);
		
//		����DecimalFormat����
//      DecimalFormat df=new DecimalFormat("#.00");
//      String s1 = df.format(s);
//      System.out.println(s1);
       
//	          �ġ�����NumberFormat��setMaximumFractionDigits()������������С����������������λ����
//		NumberFormat nf =NumberFormat.getNumberInstance();
//		nf.setMaximumFractionDigits(2);
//		String s1=nf.format(s);
//		System.out.println(s1);
		
//		��.1��ʹ��java.lang.Math.round������������ӽ������� long��
//		double s1=Math.round(s*100)/100.0;
//		System.out.println(s1);
		
//		��.2��ǿ��ת��
//		double s1 = ((int)(s*100))/100.0;
//		System.out.println(s1);
		
        scan.close();
	}

}



