package flowControl;

import java.util.Arrays;

public class sortTest {

	public static void main(String[] args) {
		int[] arr = { 6, 3, 5, 7, 1, 9, 4 };

		for (int i=1;i<arr.length;i++){
		      int temp = arr[i];  // ȡ��������Ԫ�أ��ӵڶ���Ԫ�ؿ�ʼ��arr[1]��
		      int position;  
		      // �ƶ�Ԫ�أ��Ҳ���λ��
		      for(position = i-1;position>=0 && arr[position] > temp;position--){
		           arr[position+1] = arr[position];
		      }
		      arr[position+1] = temp; // ����Ԫ��
		      System.out.println("��" + i + "������" + Arrays.toString(arr));
		}
		
	}

}
