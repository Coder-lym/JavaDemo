package flowControl;

import java.util.Arrays;

public class insertSort {

	public static void main(String[] args) {
		int[] arr = new int[6];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * (100 - 1 + 1));
		}
		System.out.println("ԭ���飺" + Arrays.toString(arr));

		System.out.println("-----------��������  ��ʼ----------");

		for (int i = 1; i < arr.length; i++) {
			int temp = arr[i]; // ȡ��������Ԫ�أ��ӵڶ���Ԫ�ؿ�ʼ��arr[1]��

			int position; // �ҵ�����λ��
			for (position = i - 1; position >= 0 && arr[position] > temp; position--) {
				arr[position + 1] = arr[position]; // �ƶ�Ԫ��
			}
			arr[position + 1] = temp; // ����Ԫ��
			System.out.println("��" + i + "������" + Arrays.toString(arr));
		}

		System.out.println("-----------��������  ����----------");
		System.out.println("���������飺" + Arrays.toString(arr));
	}

}
