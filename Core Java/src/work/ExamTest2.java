package work;

import java.util.ArrayList;
import java.util.HashMap;

public class ExamTest2 {

	public static void main(String[] args) {
//		ArrayList<Person> aPersons = new ArrayList<>();
//		aPersons.add(new Person("140322199010041234", "����", "����"));
//		aPersons.add(new Person("140322199010041235", "����", "�Ϻ�"));
//		aPersons.add(new Person("140322199010041236", "����", "����"));
//		
//		for (int i = 0; i < aPersons.size(); i++) {
//			if (aPersons.get(i).getCarId().equals("140322199010041234")) {
//				aPersons.remove(i);
//			}
//			
//			if (aPersons.get(i).getName().equals("����")) {
//				Person p = aPersons.get(i);
//				p.setAddress("���");
//			}
//		}
//		System.out.println(aPersons);
		
		HashMap<String, Teacher> hMap = new HashMap<>();
		hMap.put("0001", new Teacher("����","����"));
		hMap.put("0002", new Teacher("����","�Ϻ�"));
		hMap.put("0003", new Teacher("����","����"));
		System.out.println(hMap);
		Teacher teacher = hMap.get("0002");
		teacher.setAddress("���");
		System.out.println(hMap);
		
	}

}

class Person{
	private String carId;//���֤��
	private String name;//����
	private String address;//��ͥסַ

	public Person(String carId, String name, String address) {
		super();
		this.carId = carId;
		this.name = name;
		this.address = address;
	}

	public String getCarId() {
		return carId;
	}

	public void setCarId(String carId) {
		this.carId = carId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Person [carId=" + carId + ", name=" + name + ", address=" + address + "]";
	}
}

class Teacher{
	private String name;//����
	private String address;//��ͥסַ
	public Teacher(String name, String address) {
		super();
		this.name = name;
		this.address = address;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Teacher [name=" + name + ", address=" + address + "]";
	}
	
}

