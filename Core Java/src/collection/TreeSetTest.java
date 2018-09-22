package collection;

import java.util.TreeSet;

/*
 * 只能添加同一类型的对象
 * TreeSet集合采用红黑树的数据结构来存储集合元素，是SortedSet的实现类，集合元素处于排序状态
 * 排序方法：自然排序（默认）     定制排序
 */
public class TreeSetTest {

	public static void main(String[] args) {
		TreeSet<Object> tSet = new TreeSet<Object>();
        tSet.add(4);
        tSet.add(7);
        tSet.add(2);
        tSet.add(-4);
        tSet.add(9);
        System.out.println(tSet);  //自动排序
        
        System.out.println("第一个元素："+tSet.first());
        System.out.println("最后一个元素："+tSet.last());
    
            
        //返回小于此节点的子集元素
        System.out.println(tSet.headSet(4));
        //返回大于等于此节点的子集元素
        System.out.println(tSet.tailSet(4));
        
	}

}
