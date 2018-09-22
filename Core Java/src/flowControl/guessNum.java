package flowControl;

import java.util.Scanner;

public class guessNum {

	public static void main(String[] args) {
        int num=(int)(Math.random()*100+1);
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入1-100之间的一个整数：");
        int gue=scanner.nextInt();
        
        boolean isRight = false;
        int i=0;
        while (!isRight) {
			if (gue>num) {
			System.out.println("猜大了！请重新输入：");
			gue = scanner.nextInt();
		    } else if (gue<num) {
			  System.out.println("猜小了！请重新输入：");
			gue = scanner.nextInt();
		    } else {
			System.out.println("恭喜你猜对了！");
			isRight=true;
		    }
			i++;
		}
        scanner.close();
        
        if (i==1) {
			System.out.println("你真是个天选之子！");
		} else if (i>1 && i<=5) {
			System.out.println("你真是个人才！");
		} else if (i>5 && i<=10) {
			System.out.println("不太行哟！");
		}else {
			System.out.println("你不适合玩游戏哦！");
		}
        System.out.println("游戏结束，您总共猜了"+i+"次。");
	}  
}

