package OOP;

public class Emp {     //������Emp��
    String name;     //4���Ա����
    int age;
    char sex;
    double salary;

	public Emp() {
		super();
	}

	public void printInfo() {     //���� ��Emp �ķ���printInfo
		System.out.println("--------------");
		System.out.println("������"+name);
		System.out.println("���䣺"+age);
		System.out.println("�Ա�"+sex);
		System.out.println("нˮ��"+salary);
	}
}
