package dataType;

import java.util.*;

public class DateCalendar {

	public static void main(String[] args) {
		//��ȡ��ǰʱ��
		Date date=new Date();
		System.out.println(date);
		
		//��ȡ��Date��ά����longֵ
		//��ʾ��1970-01-01 00:00:00 ����һ�̵ĺ���ֵ
		long time=date.getTime();
		System.out.println(time);
		
		//���ú���
		date.setTime(0);
		System.out.println(date);
		
		//���ú���
		date.setTime(time+24*60*60*1000);
		System.out.println(date);
				
				
		String str=String.format("%tY��%tm��%td��",new Date(),new Date(),new Date());
		System.out.print(str);
	}

}
