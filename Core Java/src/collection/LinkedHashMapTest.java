package collection;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class LinkedHashMapTest {

	public static void main(String[] args) {
		Map<String, Integer> map = new LinkedHashMap<>();
		// LinkedHashMap内部使用一个LinkedList维护顺序，可以做到遍历的时候与put的顺序一致。
		map.put("语文", 100);
		map.put("数学", 90);
		map.put("英语", 95);
		map.put("物理", 98);
		map.put("化学", 90);
		System.out.println(map);

		// 遍历所有key
		Set<String> ketSet = map.keySet();
		for (String key : ketSet) {
			System.out.println("key:" + key);
		}

		// 遍历所有value
		Collection<Integer> cIntegers = map.values();
		for (Integer integer : cIntegers) {
			System.out.println("value"+integer);
		}
		
		/*
		 * 遍历每一组键值对 
		 * Set<Entry> entrySet() 
		 * Entry是Map的内部类，每一个实例表示一组键值对，其中包含两个属性，key,value.
		 * 将每一组键值对(Entry实例)存入一个Set集合后将其返回。
		 */
		Set<Entry<String, Integer>> sEntries = map.entrySet();
		for (Entry<String, Integer> entry : sEntries) {
			String key = entry.getKey();
			Integer value = entry.getValue();
			System.out.println(key + ":" + value);
		}

	}

}
