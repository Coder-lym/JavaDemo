package flowControl;

public class Max {
public static void main(String[] args) {
	int[] arr=new int[8];
	for(int i=0;i<arr.length;i++) {
		arr[i]=(int)(Math.random()*100+1);  //赋值为0-100之间的随机数
	}
	System.out.println("数组元素如下：");
	for(int i=0;i<arr.length;i++) {       //循环输出
		System.out.print(arr[i]+" ");
	}
	System.out.println();
	
	int max=arr[0];
	for(int i=1;i<arr.length;i++) {       //遍历剩余元素，并与max比较
		if (arr[i]>max) {
			max=arr[i];
		}
	}
	System.out.println("最大值是："+max);
}
}
