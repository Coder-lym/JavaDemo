package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CollectionTest2 {

	public static void main(String[] args) {
		List<String> list=new ArrayList<String>();
		list.add("java");
		list.add("cpp");
		list.add("php");
		list.add("C#");
		//get��������list
		for(int i=0;i<list.size();i++) {
            System.out.print(list.get(i)+" ");
	}
		System.out.println();
		String value= list.set(1, "C++");
		
		System.out.println("���滻��Ԫ�أ�"+value);
		System.out.println(list);
		
		//����λ��1��3�ϵ�Ԫ��
		list.set(1, list.set(3, list.get(1)));
		System.out.println("������"+list);
		
		//�����ɾ��
		list.add(2,"htpp");
		System.out.println(list);
		
		list.remove(2);
		System.out.println(list);
		
		//�����Ӽ�list������ҿ�
		List<String> list2=list.subList(2, 3);
		System.out.println(list2);
		
		
}
}
