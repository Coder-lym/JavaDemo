package flowControl;

public class YanghuiTriangle {

	public static void main(String[] args) {
		int[][] arr=new int[5][];
		//������һ��
		for (int i = 0; i < arr.length; i++) {
			arr[i]=new int[i+1];  //��ʼ���ڶ��������С
			
			for(int k=5;k>i;k--) {
				System.out.print("  ");
			}
			
			for (int j = 0; j <= i; j++) {
				if (i==0 || j==0 || i==j) {
					arr[i][j] = 1;
				} else {
                    arr[i][j] = arr[i-1][j-1] + arr[i-1][j];
				}
				System.out.print(arr[i][j]+"   ");
			}
			System.out.println();
		}
	}
}
