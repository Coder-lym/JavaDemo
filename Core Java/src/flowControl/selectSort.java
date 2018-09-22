package flowControl;

import java.util.Arrays;

public class selectSort {

	public static void main(String[] args) {
		int[] arr = new int[6];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (1 + Math.random() * (100 - 1 + 1));
		}
		System.out.println("原数组：" + Arrays.toString(arr));
		System.out.println("----------选择排序  开始----------");
		for (int i = 0; i < arr.length - 1; i++) {
			int minIndex = i;
			int temp;
			for (int j = i+1; j < arr.length; j++) {
				if (arr[j] < arr[minIndex]) { // 寻找最小的数
					minIndex = j; // 将最小数的索引保存
				}
			}
			temp = arr[i];
			arr[i] = arr[minIndex];
			arr[minIndex] = temp;
			System.out.println(Arrays.toString(arr));
		}
		System.out.println("----------选择排序  结束----------");
		System.out.println("排序后的数组" + Arrays.toString(arr));
		
	}

}
