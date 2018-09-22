package collection;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class QueueTest {

	public static void main(String[] args) {
		Queue<Object> queue=new LinkedList<Object>();
		//��Ԫ���������β
		queue.offer("�޹���");
		queue.offer("ũ��ɽȪ");
		queue.offer("��ʦ��");
		queue.offer("ͳһ");
		
		System.out.println(queue);
		//��ѯ�����ض��׵�Ԫ��
		System.out.println(queue.peek());
		//ɾ������Ԫ�أ������ش�Ԫ��
		System.out.println(queue.poll());
		System.out.println(queue);
		
		//˫�˶���  Deque(�ӿ�)
		Deque<Object> deque=new LinkedList<Object>();
		deque.push("java");
		deque.push("javascript");
		deque.push("html");
		deque.push("css");
		System.out.println("DequeԪ�أ�"+deque);
		
		deque.pop(); //�ȼ��� removeFirst() popFirst()
		deque.pollLast();
		System.out.println(deque);
		
		
		//ջ stack
		Stack<Object> stack=new Stack<Object>();
		stack.push("java");
		stack.push("javascript");
		stack.push("html");
		stack.push("css");
		System.out.println(stack);
		
        //�鿴��ջ�����Ķ��󣬵����Ӷ�ջ���Ƴ�����
		System.out.println("ջ��Ԫ�أ�"+stack.peek());
		stack.pop();
		System.out.println(stack);
	}

}
