package collection;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetTest1 {

	public static void main(String[] args) {
		TreeSet<String> strings = new TreeSet<>(new Comparator<String>() {

			@Override
			public int compare(String s1, String s2) {
				if (s1.compareTo(s2) > 0) {
					return -1;
				} else if (s1.compareTo(s2) == 0) {
					return 0;
				} else {
					return 1;
				}

			}
		});

		strings.add("HashSet");
		strings.add("ArrayList");
		strings.add("TreeMap");
		strings.add("HashMap");
		strings.add("TreeSet");
		strings.add("LinkedList");

		for (String string : strings) {
			System.out.print(string + "  ");
		}

	}

}
