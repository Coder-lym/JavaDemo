package OOP;

public class Emp {     //定义了Emp类
    String name;     //4项成员变量
    int age;
    char sex;
    double salary;

	public Emp() {
		super();
	}

	public void printInfo() {     //构造 类Emp 的方法printInfo
		System.out.println("--------------");
		System.out.println("姓名："+name);
		System.out.println("年龄："+age);
		System.out.println("性别："+sex);
		System.out.println("薪水："+salary);
	}
}
