package collection;

import java.util.LinkedHashSet;

public class linkedHashSet {
/*
 * linkedHashSet����Ҳ�Ǹ���Ԫ�ص�hashCodeֵ������Ԫ�صĴ洢λ�ã���ͬʱʹ������ά��Ԫ�صĴ��򣨴洢˳��
 */
	public static void main(String[] args) {
		LinkedHashSet<Object> lSet = new LinkedHashSet<Object>();
        lSet.add("��");
        lSet.add("��");
        lSet.add("��");
        lSet.add("��");
        System.out.println(lSet);
        
        //ɾ��һ��Ԫ��
        lSet.remove("��");
        //�������
        lSet.add("��");
        
        System.out.println(lSet);
        
	}

}
