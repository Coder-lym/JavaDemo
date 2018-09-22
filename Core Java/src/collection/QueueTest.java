package collection;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class QueueTest {

	public static void main(String[] args) {
		Queue<Object> queue=new LinkedList<Object>();
		//将元素添加至队尾
		queue.offer("娃哈哈");
		queue.offer("农夫山泉");
		queue.offer("康师傅");
		queue.offer("统一");
		
		System.out.println(queue);
		//查询并返回队首的元素
		System.out.println(queue.peek());
		//删除队首元素，并返回此元素
		System.out.println(queue.poll());
		System.out.println(queue);
		
		//双端队列  Deque(接口)
		Deque<Object> deque=new LinkedList<Object>();
		deque.push("java");
		deque.push("javascript");
		deque.push("html");
		deque.push("css");
		System.out.println("Deque元素："+deque);
		
		deque.pop(); //等价于 removeFirst() popFirst()
		deque.pollLast();
		System.out.println(deque);
		
		
		//栈 stack
		Stack<Object> stack=new Stack<Object>();
		stack.push("java");
		stack.push("javascript");
		stack.push("html");
		stack.push("css");
		System.out.println(stack);
		
        //查看堆栈顶部的对象，但不从堆栈中移除它。
		System.out.println("栈顶元素："+stack.peek());
		stack.pop();
		System.out.println(stack);
	}

}
