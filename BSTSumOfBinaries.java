public class BSTSumOfBinaries {
    class Node {
        int data;
        Node left;
        Node right;
    }

    Node root = new Node();

    public Node setRoot(int data) {
        root.data = data;
        return root;
    }

    public Node setLeftChildOfNode(Node node, int data) {
        if (node.left == null)
            node.left = new Node();
        node.left.data = data;
        return node.left;
    }

    public Node setRightChildOfNode(Node node, int data) {
        if (node.right == null)
            node.right = new Node();
        node.right.data = data;
        return node.right;
    }

    public Integer sumOfBinaryTree() {
        int sum = 0;
        int current = 0;
        dfs(sum, current);
    }

    public Integer dfs(int sum, int current) {
        
    }

    public static void main(String[] args) {
        BSTSumOfBinaries bst = new BSTSumOfBinaries();

        Node root = bst.setRoot(1);
        Node left1 = bst.setLeftChildOfNode(root, 0);
        Node right1 = bst.setRightChildOfNode(root, 1);
        Node right2 = bst.setRightChildOfNode(root, 1);
        Node left11 = bst.setLeftChildOfNode(left1, 0);
        Node left111 = bst.setLeftChildOfNode(left11, 0);
        Node right11 = bst.setRightChildOfNode(left1, 1);
        Node right111 = bst.setRightChildOfNode(right11, 1);
        Node left1111 = bst.setLeftChildOfNode(right111, 0);
        Node left21 = bst.setLeftChildOfNode(right1, 0);
        Node right211 = bst.setRightChildOfNode(left21, 0);
        Node left2111 = bst.setLeftChildOfNode(right211, 1);
        Node right21111 = bst.setRightChildOfNode(left2111, 1);
        Node right2112 = bst.setRightChildOfNode(right211, 0);
        Node right21 = bst.setRightChildOfNode(right1, 0);
        Node right212 = bst.setRightChildOfNode(right21, 0);
    }
}
