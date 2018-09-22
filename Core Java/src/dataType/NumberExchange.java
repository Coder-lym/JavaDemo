package dataType;

public class NumberExchange {

	public static void main(String[] args) {
		int a=100;
		int b=200;
		System.out.println("a="+a+",b="+b);
        int temp=a;
        a=b;
        b=temp;
        System.out.println("a="+a+",b="+b);
	}

}
