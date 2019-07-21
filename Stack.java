public class Stack {

	class Node {
		int item;
		Node next;
	}

	private Node top;

	public void push(Integer item) {
		Node node = new Node();
		node.item = item;

		node.next = top;
		top = node;
	}

	public Integer pop() {
		if (top == null)
			throw new RuntimeException("Stack is empty");

		Integer item = top.item;
		top = top.next;

		return item;
	}

	public static void main(String[] args) {
		Stack s = new Stack();

		s.push(1);
		s.push(2);
		s.push(3);
		s.push(4);

		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.pop());
	}
}
