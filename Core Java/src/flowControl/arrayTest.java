package flowControl;

import java.util.Arrays;

public class arrayTest {

	public static void main(String[] args) {
		int[] arr = {2,5,3,5};
        int a = first(arr);
        System.out.println(a);
	}
	
	
	public static int first(int[] arr) {
		for (int i = 1; i < arr.length-1; i++) {
			arr[i-1] = arr[i];
		}
		return arr[0];
		
	}

}
