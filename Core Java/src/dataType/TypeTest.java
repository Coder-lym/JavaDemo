package dataType;

import java.math.BigDecimal;
import java.math.BigInteger;

public class TypeTest {

	public static void main(String[] args) {
		
		char data[]= {'a','b','c'};
		String str=new String(data);
		System.out.println(str);
        
		byte a=(byte) 129;
		System.out.println(a);
		
		double m1=2.0;
		double m2=1.1;
		System.out.println(m1-m2);
		
		BigDecimal big1=new BigDecimal("2.0");
		BigDecimal big2=new BigDecimal("1.1");
		System.out.println(big1.subtract(big2));
		
		System.out.println(12345+5432l);
		
		int micros_per_day = 24 * 60 * 60 * 1000 * 1000;
		long millis_per_day = 24 * 60 * 60 * 1000;
		System.out.println(micros_per_day/millis_per_day);
		
		BigInteger big11=new BigInteger("2466100010000000000");
		BigInteger big12=new BigInteger("24661000100000");
        
		System.out.println(big11.divide(big12));
		
		
		   byte a1= (byte) 129;
		   int b=a1;
		   System.out.println(a1);
		   
		   System.out.println((byte)-1);
		   System.out.println((char)(byte)-1);
		   System.out.println((int)(char)(byte)-1);
		   
//		   
//		    short s1 = 5;
////			s1 = (s1 + 10); //编译错误，需强制类型转换
//			s1 += 10; //扩展赋值系统自动帮你做强制类型转换
//			System.out.println(s1);
//			
//			int q=322,r=323;
//			int w = q>r?q:r;
//			System.out.println(w);//三目运算符，求较大值
//			
//			System.out.println(2+2);     //4
//			System.out.println('2'+2); //52
//			System.out.println("2"+"2"); //22
//			
//			System.out.println(100+200+""+300); //"300300"
//			System.out.println(100+""+200+300); //"100200300"
//			System.out.println(100+200+300+""); //"600"
//			System.out.println(""+100+200+300); //"100200300"
//			
//			int  qq = '2';
//            
//			System.out.println(qq);
//			System.out.println('2'+'2');
//			
//			short i=1;
//			i=(short) (i+1);
//			
//			double x,y;
//			x=2.0;
//			y=x+3/2;
//			System.out.println(y);
//			
//			long l=4990;
//			System.out.println(l);
//			
//			
			int g = 4;
			     //g= 5     6
			int h = (g++)+(++g)+(g*10);
			       // 4  +  6  +  60   
			System.out.println("g="+g);
			System.out.println("h="+h);
//
//			int x1 = 3;int y1 =4;
//            System.out.println((x1++ > 4) & (y1++ > 5)); //false
//            System.out.println(x1);//4
//            System.out.println(y1);//5
//            
//            System.out.println((x1++ > 4) && (y1++ > 5));
//            System.out.println(x1);
//            System.out.println(y1);

          char c1 = '\u0000';
          char c2 = 0;
          char c3 = 00;
          char c4 = ' ';
          char c5 = '0';
          System.out.println(c5);
          
          float ss = (float) ((23908 * 0.00268127)-46.85);
          System.out.println(ss);
		   
		
			
	}

}
