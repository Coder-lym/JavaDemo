package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public  class collectionTest{

	public static void main(String[] args) {
		// ����ArrayList��Ԫ������Ϊ����Object
		List<Object> c1 = new ArrayList<Object>();
		// ���Ԫ��
		c1.add("java");
		c1.add("C++");
		c1.add("http");
		c1.add("jsp");
		c1.add(1); // ��Ȼ���ܷŻ����������ͣ������� �Զ�װ�䣡����
		System.out.println("con1����Ԫ�صĸ���Ϊ��" + c1.size()); // Ԫ�ظ���
		System.out.println(c1);

		List<Object> c2 = new ArrayList<Object>();
		c2.add("asp");
		c2.add(".net");
		c2.add("http");
		c2.add("ip");

		// ��ָ�� c2 �е�����Ԫ�ض� ׷�� ���� c1��
		c1.addAll(c2);
		System.out.println(c1);

		// ��ռ���
		// c2.clear();
		System.out.println("����c2�Ƿ�Ϊ�գ�" + c2.isEmpty());
		System.out.println("c2" + c2);

		// ����� collection ����ָ����Ԫ�أ��򷵻� true��
		System.out.println("c1���Ƿ����http��" + c1.contains("http"));
		System.out.println("c1�Ƿ���� c2�е�����Ԫ�أ�" + c1.containsAll(c2));

		// �Ƴ�ָ��Ԫ�أ���Ϊ��������ֻ�Ƴ���һ����������true
		// c1.remove("http");
		// System.out.println("c1ɾ��һ��http��"+c1);

		// �Ƴ��� c1 �� c2 �е�����Ԫ�ء�
		// c1.removeAll(c2);
		// System.out.println(c1);

		// ������
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
