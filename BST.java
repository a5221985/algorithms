public class BST {
	Node root;

        public void setTree(Node root) {
            this.root = root;
        }

	public void inorderTraversal(Node node) {
		if (node == null)
			return;

		if (node.getLeft() != null)
			inorderTraversal(node.getLeft());

		System.out.print(node.getData() + " ");

		if (node.getRight() != null)
			inorderTraversal(node.getRight());
	}

	public void postorderTraversal(Node node) {
		if (node == null)
			return;

		if (node.getRight() != null)
			postorderTraversal(node.getRight());

		System.out.print(node.getData() + " ");

		if (node.getLeft() != null)
			postorderTraversal(node.getLeft());
	}

	public Boolean find(Integer item) {
		while (root != null) {
                        Node node = root;
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

	public void successor(Node node) {
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

        public void remove(Integer item) {
            Node current = findNode(item);
            while (current != null) {
                System.out.println("TRAVERSING: " + current.getData());
                if (current.getRight() != null) {
                    Node right = current.getRight();
                    if (right.getLeft() != null) {
                        Node rightLeft = right.getLeft();
                        current.setData(rightLeft.getData());
                        current = rightLeft;
                    } else {
                        current.setData(right.getData());
                        current = right;
                    }
                } else if (current.getLeft() != null) {
                    Node left = current.getLeft();
                    current.setData(left.getData());
                    current = left;
                } else {
                    current = null;
                }
            }
        }

        public Node findNode(Integer item) {
            Node node = root;
            while (node != null) {
                System.out.println("VALUE: " + node.getData());
                if (node.getData() == item) {
                    return node;
                } else if (item < node.getData()) {
                    node = node.getLeft();
                } else {
                    node = node.getRight();
                }
            }
            return null;
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

                bst.setTree(root);

		bst.inorderTraversal(root);
		System.out.println();
		bst.postorderTraversal(root);
		System.out.println();
		bst.successor(left);

		//Integer val = 25;
		//System.out.println("Does " + val + " exist? " + bst.find(val));

                
                bst.remove(25);
		bst.inorderTraversal(root);
		System.out.println();
		bst.postorderTraversal(root);
		System.out.println();
	}
}
