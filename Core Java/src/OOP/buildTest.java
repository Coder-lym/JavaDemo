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
		System.out.println("父类无参构造器");
	}

	public AA(int a, int b) {

	}

	public void eat() {
		System.out.println("父类的eat");
	}
}

class BB extends AA {

	int num = 10;

	public BB() {
		System.out.println("子类无参构造器");
	}

	public BB(String s) {
		System.out.println("子类有参构造器");
	}

	public void eat() {
		System.out.println("子类的eat方法");
	}
	
	public void function() {
	    
		System.out.println(super.num);
		
	}

	public void method() {
	}

}