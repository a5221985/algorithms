public class Queue {
	class Node {
		Integer item;
		Node next;
		Node prev;
	}

	Node front;
	Node rear;

	public void enqueue(Integer item) {
		Node node = new Node();
		if (node == null)
			throw new RuntimeException("Queue is full");

		node.item = item;
		node.next = front;
		
		if (front != null)
			front.prev = node;
		front = node;

		if (rear == null)
			rear = front;
	}

	public Integer dequeue() {
		if (rear == null)
			throw new RuntimeException("Queue is Empty");

		Node node = rear;
		rear = rear.prev;

		if (rear == null)
			front = null;

		return node.item;
	}

	public static void main(String[] args) {
		Queue q = new Queue();
		q.enqueue(1);
		q.enqueue(2);
		q.enqueue(3);

		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
	}
}
