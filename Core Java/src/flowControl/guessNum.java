package flowControl;

import java.util.Scanner;

public class guessNum {

	public static void main(String[] args) {
        int num=(int)(Math.random()*100+1);
        Scanner scanner=new Scanner(System.in);
        System.out.println("������1-100֮���һ��������");
        int gue=scanner.nextInt();
        
        boolean isRight = false;
        int i=0;
        while (!isRight) {
			if (gue>num) {
			System.out.println("�´��ˣ����������룺");
			gue = scanner.nextInt();
		    } else if (gue<num) {
			  System.out.println("��С�ˣ����������룺");
			gue = scanner.nextInt();
		    } else {
			System.out.println("��ϲ��¶��ˣ�");
			isRight=true;
		    }
			i++;
		}
        scanner.close();
        
        if (i==1) {
			System.out.println("�����Ǹ���ѡ֮�ӣ�");
		} else if (i>1 && i<=5) {
			System.out.println("�����Ǹ��˲ţ�");
		} else if (i>5 && i<=10) {
			System.out.println("��̫��Ӵ��");
		}else {
			System.out.println("�㲻�ʺ�����ϷŶ��");
		}
        System.out.println("��Ϸ���������ܹ�����"+i+"�Ρ�");
	}  
}

