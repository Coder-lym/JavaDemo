package flowControl;

public class Max {
public static void main(String[] args) {
	int[] arr=new int[8];
	for(int i=0;i<arr.length;i++) {
		arr[i]=(int)(Math.random()*100+1);  //��ֵΪ0-100֮��������
	}
	System.out.println("����Ԫ�����£�");
	for(int i=0;i<arr.length;i++) {       //ѭ�����
		System.out.print(arr[i]+" ");
	}
	System.out.println();
	
	int max=arr[0];
	for(int i=1;i<arr.length;i++) {       //����ʣ��Ԫ�أ�����max�Ƚ�
		if (arr[i]>max) {
			max=arr[i];
		}
	}
	System.out.println("���ֵ�ǣ�"+max);
}
}
