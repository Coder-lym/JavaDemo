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
		//get方法遍历list
		for(int i=0;i<list.size();i++) {
            System.out.print(list.get(i)+" ");
	}
		System.out.println();
		String value= list.set(1, "C++");
		
		System.out.println("被替换的元素："+value);
		System.out.println(list);
		
		//交换位置1和3上的元素
		list.set(1, list.set(3, list.get(1)));
		System.out.println("交换后："+list);
		
		//插入和删除
		list.add(2,"htpp");
		System.out.println(list);
		
		list.remove(2);
		System.out.println(list);
		
		//返回子集list，左闭右开
		List<String> list2=list.subList(2, 3);
		System.out.println(list2);
		
		
}
}
