package collection;

import java.util.TreeSet;

/*
 * ֻ�����ͬһ���͵Ķ���
 * TreeSet���ϲ��ú���������ݽṹ���洢����Ԫ�أ���SortedSet��ʵ���࣬����Ԫ�ش�������״̬
 * ���򷽷�����Ȼ����Ĭ�ϣ�     ��������
 */
public class TreeSetTest {

	public static void main(String[] args) {
		TreeSet<Object> tSet = new TreeSet<Object>();
        tSet.add(4);
        tSet.add(7);
        tSet.add(2);
        tSet.add(-4);
        tSet.add(9);
        System.out.println(tSet);  //�Զ�����
        
        System.out.println("��һ��Ԫ�أ�"+tSet.first());
        System.out.println("���һ��Ԫ�أ�"+tSet.last());
    
            
        //����С�ڴ˽ڵ���Ӽ�Ԫ��
        System.out.println(tSet.headSet(4));
        //���ش��ڵ��ڴ˽ڵ���Ӽ�Ԫ��
        System.out.println(tSet.tailSet(4));
        
	}

}
