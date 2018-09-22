package OOP;

import java.util.Date;
import java.text.SimpleDateFormat;

public class Simple {

	public static void main(String[] args) {
		Date date=new Date();
		System.out.println(date);

		//制定日期格式
		String dateformat="yyyy年MM-dd HH:mm:ss";
		
		//创建simpleFormat对象，传入格式
		SimpleDateFormat sdf=new SimpleDateFormat(dateformat);
		
		//转化格式，接收并输出
		String str=sdf.format(date);
		System.out.println(str);
		
		//另一种方法
		String st=String.format("%tY年%tm月%td日",new Date(),new Date(),new Date());
		System.out.print(st);
	}

}
