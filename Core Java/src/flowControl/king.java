package flowControl;

public class king {

	public static void main(String[] args) {
		for(int i=1;i<=10;i++) {
			for(int j=10;j>i;j--) {
				System.out.print(" ");
			}
			for(int x=0;x<i*2-1;x++) {
				System.out.print("¡ø");
			}
			    System.out.println();
		}
	}
}
