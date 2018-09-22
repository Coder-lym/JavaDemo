package collection;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetTest2 {

	public static void main(String[] args) {
		TreeSet<Integer> tSet = new TreeSet<>(new Comparator<Integer>() {

			int n = 0;

			@Override
			public int compare(Integer o1, Integer o2) {
				// 新放进的元素为o1
				int i1 = o1;
				int i2 = o2;

				if (i1 % 2 != i2 % 2) {
					n = i2%2 - i1%2;
				} else if (i1 % 2 == 0) {
					if (i1 > i2) {
						return -1;
					} else if (i1 < i2) {
						return 1;
					}
				}else if (i1 % 2 == 1) {
					if (i1 > i2) {
						return 1;
					} else if (i1 < i2) {
						return -1;
					}
				}
				return n;
			}

		});

		for (int i = 1; i <= 10; i++) {
			tSet.add(i);
		}

		for (Integer integer : tSet) {
			System.out.print(integer + " ");
		}

	}

}
