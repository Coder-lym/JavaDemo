package collection;

import java.util.HashMap;
import java.util.Map;

public class HashMapTest {

	public static void main(String[] args) {
		Map<String, Integer> map=new HashMap<String, Integer>();
		//key�����ţ��������ظ���������set����
		map.put("����", 100);
		map.put("��ѧ", 90);
		map.put("Ӣ��", 95);
		map.put("����", 98);
		map.put("��ѧ", 90);
		System.out.println(map);
		
		map.put("��ѧ", 99);   //key��ͬ�����滻ԭ����value
		System.out.println(map);
		
		System.out.println("��ѧ��"+map.get("��ѧ"));
		
		Integer value=map.remove("��ѧ");
		System.out.println("ɾ����value��"+value);
		System.out.println(map);
		
		System.out.println("�Ƿ������ĳɼ���"+map.containsKey("����"));

	}

}
