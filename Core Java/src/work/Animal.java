package work;

abstract class Animal{
	protected int legs;
	protected Animal(int legs){
		this.legs = legs;
	}
	
	public Animal() {
		
	}

	void walk() {
		
	}
	
	abstract void eat();
}
