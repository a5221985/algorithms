public class Node {
	private int data;
	private Node left;
	private Node right;
	private Node parent;

	public Node() { }

	public Node(int data, Node left, Node right, Node parent) {
		this.data = data;
		this.left = left;
		this.right = right;
		this.parent = parent;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public Node getLeft() {
		return left;
	}

	public void setLeft(Node left) {
		this.left = left;
	}

	public Node getRight() {
		return right;
	}

	public void setRight(Node right) {
		this.right = right;
	}

	public Node getParent() {
		return parent;
	}

	public void setParent(Node parent) {
		this.parent = parent;
	}
}
