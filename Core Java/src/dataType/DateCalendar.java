package dataType;

import java.util.*;

public class DateCalendar {

	public static void main(String[] args) {
		//获取当前时间
		Date date=new Date();
		System.out.println(date);
		
		//获取该Date内维护的long值
		//表示从1970-01-01 00:00:00 到这一刻的毫秒值
		long time=date.getTime();
		System.out.println(time);
		
		//设置毫秒
		date.setTime(0);
		System.out.println(date);
		
		//设置毫秒
		date.setTime(time+24*60*60*1000);
		System.out.println(date);
				
				
		String str=String.format("%tY年%tm月%td日",new Date(),new Date(),new Date());
		System.out.print(str);
	}

}
