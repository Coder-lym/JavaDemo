package collection;

import java.util.HashSet;

public class HashSetTest {

	public static void main(String[] args) {
		HashSet<Object> oSet = new HashSet<Object>();
		oSet.add(new A());
		oSet.add(new A());
		oSet.add(new B());
		oSet.add(new B());
		oSet.add(new C());
		oSet.add(new C());
		System.out.println(oSet);
		
	}
}

class A{
	public boolean equals(Object obj) {
		return true;
	}
}
class B{
	public int hashCode() {
		return 1;
	}
}
class C{
	public boolean equals(Object obj) {
		return true;
	}
	public int hashCode() {
		return 2;
	}
}