package flowControl;

import java.util.Arrays;

public class singGrade {

	public static void main(String[] args) {
		int[] arr = new int[10];
		for (int i = 0; i < arr.length; i++) {
			arr[i]=(int)(70+Math.random()*(100-70+1));
		}
		//十位评委的评分：
        System.out.println("十位评委的评分："+Arrays.toString(arr));
        
        //找最大值
        int max=arr[0];
        for (int i = 1; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
			}
		}
        System.out.println("最高分是："+max);
        
        //找最小值
        int min=arr[0];
        for (int i = 1; i < arr.length; i++) {
			if (min > arr[i]) {
				min = arr[i];
			}
		}
        System.out.println("最低分是："+min);
        
        //最终得分：
        int sum=0;
        for(int i=0;i<arr.length;i++) {
        	sum += arr[i];
        }
        double finalGrade = (sum-max-min)/(arr.length-2);
        System.out.println("最终得分："+finalGrade);
	}
}
