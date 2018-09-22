package OOP;

public class EmpManager {
public static void main(String[] args) {
	Emp emp1=new Emp();   //创建对象
	emp1.name="梁玉民";
	emp1.age=22;
	emp1.sex='男';
	emp1.salary=5000;
	
	emp1.printInfo();  //调用方法
	
	emp1.salary*=125.0/100.0;  //修改对象信息
	emp1.age=23;
	emp1.printInfo();  //调用方法
}
}
