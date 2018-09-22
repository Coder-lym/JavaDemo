package flowControl;
import java.util.Random;
import java.util.Arrays;
public class BubbleSort {
	public static void main(String[] args) {
		int[] arr = new int[6];
		Random rand = new Random();
		for (int i = 0; i < arr.length; i++) {
			arr[i] = rand.nextInt(100);
		}
		System.out.println("原数组："+Arrays.toString(arr));
		
		System.out.println("---------冒泡排序  开始--------");
		
		for (int i = 1; i < arr.length; i++) { // 外层循环控制轮次
			System.out.println("第"+i+"轮排序：");
			for (int j = 0; j < arr.length - i; j++) { // 内层循环控制每轮排序中的两两交换
				if (arr[j] > arr[j + 1]) {
					int t = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = t;
				}
				System.out.print("第"+(j+1)+"次排序结果："+Arrays.toString(arr)+"  ");
			}
			System.out.println();
		}
		
		System.out.println("-----------冒泡排序  结束----------");
		System.out.println("排序后的数组："+Arrays.toString(arr));
	}
}
