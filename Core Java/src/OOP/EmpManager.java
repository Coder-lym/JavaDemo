package OOP;

public class EmpManager {
public static void main(String[] args) {
	Emp emp1=new Emp();   //��������
	emp1.name="������";
	emp1.age=22;
	emp1.sex='��';
	emp1.salary=5000;
	
	emp1.printInfo();  //���÷���
	
	emp1.salary*=125.0/100.0;  //�޸Ķ�����Ϣ
	emp1.age=23;
	emp1.printInfo();  //���÷���
}
}
