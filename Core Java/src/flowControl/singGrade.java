package flowControl;

import java.util.Arrays;

public class singGrade {

	public static void main(String[] args) {
		int[] arr = new int[10];
		for (int i = 0; i < arr.length; i++) {
			arr[i]=(int)(70+Math.random()*(100-70+1));
		}
		//ʮλ��ί�����֣�
        System.out.println("ʮλ��ί�����֣�"+Arrays.toString(arr));
        
        //�����ֵ
        int max=arr[0];
        for (int i = 1; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
			}
		}
        System.out.println("��߷��ǣ�"+max);
        
        //����Сֵ
        int min=arr[0];
        for (int i = 1; i < arr.length; i++) {
			if (min > arr[i]) {
				min = arr[i];
			}
		}
        System.out.println("��ͷ��ǣ�"+min);
        
        //���յ÷֣�
        int sum=0;
        for(int i=0;i<arr.length;i++) {
        	sum += arr[i];
        }
        double finalGrade = (sum-max-min)/(arr.length-2);
        System.out.println("���յ÷֣�"+finalGrade);
	}
}
