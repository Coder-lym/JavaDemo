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
		System.out.println("ԭ���飺"+Arrays.toString(arr));
		
		System.out.println("---------ð������  ��ʼ--------");
		
		for (int i = 1; i < arr.length; i++) { // ���ѭ�������ִ�
			System.out.println("��"+i+"������");
			for (int j = 0; j < arr.length - i; j++) { // �ڲ�ѭ������ÿ�������е���������
				if (arr[j] > arr[j + 1]) {
					int t = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = t;
				}
				System.out.print("��"+(j+1)+"����������"+Arrays.toString(arr)+"  ");
			}
			System.out.println();
		}
		
		System.out.println("-----------ð������  ����----------");
		System.out.println("���������飺"+Arrays.toString(arr));
	}
}
