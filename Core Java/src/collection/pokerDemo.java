package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class pokerDemo {

	public static HashMap<Integer, String> poker;

	public static void main(String[] args) {
		String[] colors = { "♥", "♠", "♦", "♣" };
		String[] values = { "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2" };

		// 拿到一盒新的扑克
		poker = new HashMap<>();
		int index = 1;
		for (int j = 0; j < values.length; j++) {
			for (int i = 0; i < colors.length; i++) {
				poker.put(index, colors[i] + values[j]);
				index++;
			}
		}
		poker.put(index, "小王");
		index++;
		poker.put(index, "大王");

		// System.out.println(poker);

		// 获取扑克索引（set），传进list集合，利用集合工具类collections进行随机洗牌
		Set<Integer> pokerIndex = poker.keySet();
		
		List<Integer> lIntegers = new ArrayList<>();
		// 遍历添加进list集合
		for (Integer integer : pokerIndex) {
			lIntegers.add(integer);
		}

		Collections.shuffle(lIntegers);

		// 发牌
		TreeSet<Integer> player1 = new TreeSet<Integer>();
		TreeSet<Integer> player2 = new TreeSet<Integer>();
		TreeSet<Integer> player3 = new TreeSet<Integer>();
		TreeSet<Integer> dipai = new TreeSet<Integer>();

		for (int i = 0; i < lIntegers.size(); i++) {
			if (i < lIntegers.size() - 3) {
				if (i % 3 == 0) {
					player1.add(lIntegers.get(i));
				} else if (i % 3 == 1) {
					player2.add(lIntegers.get(i));
				} else if (i % 3 == 2) {
					player3.add(lIntegers.get(i));
				}
			} else {
				dipai.add(lIntegers.get(i));
			}
		}

		lookPoker("赌王", player1);
		lookPoker("赌侠", player2);
		lookPoker("赌圣", player3);
		lookPoker("底牌", dipai);

	}

	public static void lookPoker(String playerName, TreeSet<Integer> sIntegers) {
		System.out.print(playerName + "的牌是：");
		for (Integer integer : sIntegers) {
			System.out.print(poker.get(integer) + "  ");
		}
		System.out.println();
	}

}
