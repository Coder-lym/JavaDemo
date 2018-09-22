package flowControl;

import java.util.Arrays;

public class insertSort {

	public static void main(String[] args) {
		int[] arr = new int[6];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * (100 - 1 + 1));
		}
		System.out.println("原数组：" + Arrays.toString(arr));

		System.out.println("-----------插入排序  开始----------");

		for (int i = 1; i < arr.length; i++) {
			int temp = arr[i]; // 取出待插入元素，从第二个元素开始（arr[1]）

			int position; // 找到插入位置
			for (position = i - 1; position >= 0 && arr[position] > temp; position--) {
				arr[position + 1] = arr[position]; // 移动元素
			}
			arr[position + 1] = temp; // 插入元素
			System.out.println("第" + i + "轮排序：" + Arrays.toString(arr));
		}

		System.out.println("-----------插入排序  结束----------");
		System.out.println("排序后的数组：" + Arrays.toString(arr));
	}

}
