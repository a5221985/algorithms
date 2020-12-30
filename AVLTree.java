public class AVLTree {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        int height;
        
        TreeNode(int val) { this.val = val; }
    }

    TreeNode root;

    public void insert(int item) {
        if (root == null) {
            root = new TreeNode(item);
            return;
        }
        TreeNode parent = binarySearchForPosition(item);
        TreeNode node = new TreeNode(item);
        node.height = 1;
        if (item <= parent.val)
            parent.left = node;
        else
            parent.right = node;
    }

    TreeNode binarySearchForPosition(int item) {
        TreeNode current = root;
        while (current != null) {
            current.height++;
            if (item <= current.val) {
                if (current.left == null)
                    return current;
                current = current.left;
            } else {
                if (current.right == null)
                    return current;
                current = current.right;
            }
        }
        return root;
    }

    public void printInOrder() {
        printInOrder(root);
        System.out.println();
    }

    void printInOrder(TreeNode node) {
        if (node == null)
            return;
        printInOrder(node.left);
        System.out.print(node.val + " ");
        printInOrder(node.right);
    }

    public static void main(String[] args) {
        AVLTree tree = new AVLTree();
        for (int i = 0; i < 10; i++) {
            tree.insert((int) (Math.random() * 10));
        }
        tree.printInOrder();
    }
}
