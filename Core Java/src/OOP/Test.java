package OOP;

public class Test {
	public static void main(String[] args) {
		Son a = new Son("����", 18);// ���������� ���䣺18
		a.setName("����");// ���ı�ʾ����
		Father f = new Father();
		f.study("�鷨");// �ô���ִ�����Ϊ�� ����ѧϰ�鷨
		
		Father f2 = new Son("����"); 
		f2.study("�鷨");// �ô���ִ�����Ϊ :����ѧϰ�鷨
						             // ����ѧϰ�鷨
		Action ac = new Son();
		ac.run();// �ô���ִ�����Ϊ�� �����ܲ�
		// ��ʹ�����������е�f2����Son�е�writer()
		((Son)f2).writer();

	}

}

class Father{
	
	public Father() {
		
	}

	public void study(String str) {
    	System.out.println("����ѧϰ"+str);
	}
}

interface Action{
	public void run();
	// Action �ǽӿ�
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
		System.out.println("���ӻ�д����");
	}
	
	@Override
	public void study(String str) {
		super.study(str);
		System.out.println("����ѧϰ"+str);
	}
	
	@Override
	public void run() {
		System.out.println("�����ܲ�");
		
	}
	
}

