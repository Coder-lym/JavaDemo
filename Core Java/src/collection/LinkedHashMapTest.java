package collection;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class LinkedHashMapTest {

	public static void main(String[] args) {
		Map<String, Integer> map = new LinkedHashMap<>();
		// LinkedHashMap�ڲ�ʹ��һ��LinkedListά��˳�򣬿�������������ʱ����put��˳��һ�¡�
		map.put("����", 100);
		map.put("��ѧ", 90);
		map.put("Ӣ��", 95);
		map.put("����", 98);
		map.put("��ѧ", 90);
		System.out.println(map);

		// ��������key
		Set<String> ketSet = map.keySet();
		for (String key : ketSet) {
			System.out.println("key:" + key);
		}

		// ��������value
		Collection<Integer> cIntegers = map.values();
		for (Integer integer : cIntegers) {
			System.out.println("value"+integer);
		}
		
		/*
		 * ����ÿһ���ֵ�� 
		 * Set<Entry> entrySet() 
		 * Entry��Map���ڲ��࣬ÿһ��ʵ����ʾһ���ֵ�ԣ����а����������ԣ�key,value.
		 * ��ÿһ���ֵ��(Entryʵ��)����һ��Set���Ϻ��䷵�ء�
		 */
		Set<Entry<String, Integer>> sEntries = map.entrySet();
		for (Entry<String, Integer> entry : sEntries) {
			String key = entry.getKey();
			Integer value = entry.getValue();
			System.out.println(key + ":" + value);
		}

	}

}
