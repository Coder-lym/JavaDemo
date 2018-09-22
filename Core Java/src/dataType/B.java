package dataType;

class A{
	public void sayHello(){
		System.out.println("hello A");
	}
	public A(){
		this.sayHello();
	}
}

public class B extends A{
	public void sayHello(){
		System.out.println("hello B");
	}
	public static void main(String[] args){
		new B();
	}
}