package OOP;

public class Test {
	public static void main(String[] args) {
		Son a = new Son("张三", 18);// 姓名：张三 年龄：18
		a.setName("李四");// 李四表示姓名
		Father f = new Father();
		f.study("书法");// 该代码执行输出为： 父亲学习书法
		
		Father f2 = new Son("李四"); 
		f2.study("书法");// 该代码执行输出为 :父亲学习书法
						             // 儿子学习书法
		Action ac = new Son();
		ac.run();// 该代码执行输出为： 正在跑步
		// 请使用上述代码中的f2调用Son中的writer()
		((Son)f2).writer();

	}

}

class Father{
	
	public Father() {
		
	}

	public void study(String str) {
    	System.out.println("父亲学习"+str);
	}
}

interface Action{
	public void run();
	// Action 是接口
	}
class Son extends Father implements Action{
	private String name;
	private int age;

	
	public Son(String name,int age) {
		this.name=name;
		this.age=age;
	}
	
	public Son(String name) {
		
	}

	public Son() {
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	public void writer() {
		System.out.println("儿子会写代码");
	}
	
	@Override
	public void study(String str) {
		super.study(str);
		System.out.println("儿子学习"+str);
	}
	
	@Override
	public void run() {
		System.out.println("正在跑步");
		
	}
	
}

