package OOP;

import java.util.Date;
import java.text.SimpleDateFormat;

public class Simple {

	public static void main(String[] args) {
		Date date=new Date();
		System.out.println(date);

		//�ƶ����ڸ�ʽ
		String dateformat="yyyy��MM-dd HH:mm:ss";
		
		//����simpleFormat���󣬴����ʽ
		SimpleDateFormat sdf=new SimpleDateFormat(dateformat);
		
		//ת����ʽ�����ղ����
		String str=sdf.format(date);
		System.out.println(str);
		
		//��һ�ַ���
		String st=String.format("%tY��%tm��%td��",new Date(),new Date(),new Date());
		System.out.print(st);
	}

}
