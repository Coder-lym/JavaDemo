package json;

import com.google.gson.Gson;

public class GsonDemo {

	public static void main(String[] args) {
		Person person = new Person("уехЩ", 20, new int[]{110,112});

		Gson gson = new Gson();
		String gString = gson.toJson(person,Person.class);
		System.out.println(gString);
	}

}
class Person {

	String name;
	int age;
	int[] number;

	public Person(String name, int age, int[] number) {
		super();
		this.name = name;
		this.age = age;
		this.number = number;
	}

}