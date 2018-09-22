package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public  class collectionTest{

	public static void main(String[] args) {
		// 声明ArrayList，元素类型为泛型Object
		List<Object> c1 = new ArrayList<Object>();
		// 添加元素
		c1.add("java");
		c1.add("C++");
		c1.add("http");
		c1.add("jsp");
		c1.add(1); // 虽然不能放基本数据类型，但可以 自动装箱！！！
		System.out.println("con1集合元素的个数为：" + c1.size()); // 元素个数
		System.out.println(c1);

		List<Object> c2 = new ArrayList<Object>();
		c2.add("asp");
		c2.add(".net");
		c2.add("http");
		c2.add("ip");

		// 将指定 c2 中的所有元素都 追加 到此 c1中
		c1.addAll(c2);
		System.out.println(c1);

		// 清空集合
		// c2.clear();
		System.out.println("集合c2是否为空：" + c2.isEmpty());
		System.out.println("c2" + c2);

		// 如果此 collection 包含指定的元素，则返回 true。
		System.out.println("c1中是否包含http：" + c1.contains("http"));
		System.out.println("c1是否包含 c2中的所有元素：" + c1.containsAll(c2));

		// 移除指定元素，若为多例，则只移除第一个，并返回true
		// c1.remove("http");
		// System.out.println("c1删除一个http后："+c1);

		// 移除此 c1 中 c2 中的所有元素。
		// c1.removeAll(c2);
		// System.out.println(c1);

		// 迭代器
		Iterator<Object> it = c1.iterator();
		while (it.hasNext()) {
			Object obj = it.next();
            System.out.print(obj+"  ");
		}
		
		System.out.println();
		Object[] arr=c1.toArray();
        System.out.println(Arrays.toString(arr));
	}

}
