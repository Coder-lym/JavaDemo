package flowControl;

import java.util.Arrays;

public class Array {
public static void main(String[] args) {
	int[] arr=new int[8];
	for(int i=0;i<arr.length;i++) {
		arr[i]=(int)(1+Math.random()*(10-1+1));  //赋值为1-10之间的随机数
	}
	System.out.println("数组元素如下：");
	for(int i=0;i<arr.length;i++) {
		System.out.print(arr[i]+" ");
	}
	System.out.println();
	
	Arrays.sort(arr);
	System.out.println("从小到大：");
	for(int i=0;i<arr.length;i++) {
		System.out.print(arr[i]+" ");
	}
	
	System.out.println(Arrays.toString(arr));
	
	System.out.println();
	
	System.out.println("倒着输出：");
	for(int i=arr.length-1;i>=0;i--) {
		System.out.print(arr[i]+" ");
	}
}
}
