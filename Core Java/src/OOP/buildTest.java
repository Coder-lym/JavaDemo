package OOP;

public class buildTest {

	public static void main(String[] args) {
		BB b = new BB("s");
		b.function();


	}
}
class AA {
	int num = 5;

	public AA() {
		System.out.println("�����޲ι�����");
	}

	public AA(int a, int b) {

	}

	public void eat() {
		System.out.println("�����eat");
	}
}

class BB extends AA {

	int num = 10;

	public BB() {
		System.out.println("�����޲ι�����");
	}

	public BB(String s) {
		System.out.println("�����вι�����");
	}

	public void eat() {
		System.out.println("�����eat����");
	}
	
	public void function() {
	    
		System.out.println(super.num);
		
	}

	public void method() {
	}

}