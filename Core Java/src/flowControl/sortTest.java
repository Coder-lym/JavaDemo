package flowControl;

import java.util.Arrays;

public class sortTest {

	public static void main(String[] args) {
		int[] arr = { 6, 3, 5, 7, 1, 9, 4 };

		for (int i=1;i<arr.length;i++){
		      int temp = arr[i];  // 取出待插入元素，从第二个元素开始（arr[1]）
		      int position;  
		      // 移动元素，找插入位置
		      for(position = i-1;position>=0 && arr[position] > temp;position--){
		           arr[position+1] = arr[position];
		      }
		      arr[position+1] = temp; // 插入元素
		      System.out.println("第" + i + "轮排序：" + Arrays.toString(arr));
		}
		
	}

}
