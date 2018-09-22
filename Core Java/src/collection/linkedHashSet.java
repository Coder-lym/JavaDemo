package collection;

import java.util.LinkedHashSet;

public class linkedHashSet {
/*
 * linkedHashSet集合也是根据元素的hashCode值来决定元素的存储位置，但同时使用链表维护元素的次序（存储顺序）
 */
	public static void main(String[] args) {
		LinkedHashSet<Object> lSet = new LinkedHashSet<Object>();
        lSet.add("春");
        lSet.add("夏");
        lSet.add("秋");
        lSet.add("冬");
        System.out.println(lSet);
        
        //删除一个元素
        lSet.remove("春");
        //重新添加
        lSet.add("春");
        
        System.out.println(lSet);
        
	}

}
