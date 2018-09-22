package collection;

import java.util.HashMap;
import java.util.Map;

public class HashMapTest {

	public static void main(String[] args) {
		Map<String, Integer> map=new HashMap<String, Integer>();
		//key无序存放，但不可重复，类似于set集合
		map.put("语文", 100);
		map.put("数学", 90);
		map.put("英语", 95);
		map.put("物理", 98);
		map.put("化学", 90);
		System.out.println(map);
		
		map.put("化学", 99);   //key相同，则替换原来的value
		System.out.println(map);
		
		System.out.println("数学："+map.get("数学"));
		
		Integer value=map.remove("化学");
		System.out.println("删除的value："+value);
		System.out.println(map);
		
		System.out.println("是否含有语文成绩："+map.containsKey("语文"));

	}

}
