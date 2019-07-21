
public class BST {
	Node root;

	public static void inorderTraversal(Node node) {
		if (node == null)
			return;

		if (node.getLeft() != null)
			inorderTraversal(node.getLeft());

		System.out.print(node.getData() + " ");

		if (node.getRight() != null)
			inorderTraversal(node.getRight());
	}

	public static void postorderTraversal(Node node) {
		if (node == null)
			return;

		if (node.getRight() != null)
			postorderTraversal(node.getRight());

		System.out.print(node.getData() + " ");

		if (node.getLeft() != null)
			postorderTraversal(node.getLeft());
	}

	public static Boolean find(Node node, Integer item) {
		while (node != null) {
			if (node.getData() == item) {
				return true;
			} else if (item < node.getData()) {
				node = node.getLeft();
			} else {
				node = node.getRight();
			}
		}

		return false;
	}

	public static void successor(Node node) {
		if (node == null)
			return;

		Node current = node;

		while(current.getRight() == null) {
			current = current.getParent();
		}

		current = current.getRight();

		while(current.getLeft() != null) {
			current = current.getLeft();
		}

		System.out.println(current.getData());
	}

	public static void main(String[] args) {
		BST bst = new BST();

		Node root = new Node();
		root.setData(20);
		root.setParent(null);
		
		Node left = new Node();
		left.setData(10);
		left.setParent(root);
		root.setLeft(left);

		Node right = new Node();
		right.setData(30);
		right.setParent(root);
		root.setRight(right);

		Node leftLeft = new Node();
		leftLeft.setData(5);
		leftLeft.setParent(left);
		left.setLeft(leftLeft);

		Node leftRight = new Node();
		leftRight.setData(15);
		leftRight.setParent(left);
		left.setRight(leftRight);

		Node rightLeft = new Node();
		rightLeft.setData(25);
		rightLeft.setParent(right);
		right.setLeft(rightLeft);

		Node rightRight = new Node();
		rightRight.setData(45);
		rightRight.setParent(right);
		right.setRight(rightRight);

		inorderTraversal(root);
		System.out.println();
		postorderTraversal(root);
		System.out.println();
		successor(left);

		Integer val = 25;
		System.out.println("Does " + val + " exist? " + find(root, val));
	}
}
