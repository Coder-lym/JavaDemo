package work;

public class Cat extends Animal implements Pet{
	
	String name;

	public Cat(String name) {
		this.name = name;
	}

	public Cat() {
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	void eat() {
		
	}
	
	public void play() {
		
	}

}
