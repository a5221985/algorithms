import java.util.Queue;
import java.util.LinkedList;

public class InvertBinaryTree {
    public void invert(TreeNode node) {
        if (node == null || node.left == null && node.right == null)
            return;
        invert(node.left);
        invert(node.right);
        TreeNode temp = node.left;
        node.left = node.right;
        node.right = temp;
    }

    public void print(TreeNode node) {
        if (node == null)
            return;
        print(node.left);
        System.out.print(node.val + " ");
        print(node.right);
    }

    public static void main(String[] args) {
        InvertBinaryTree ibt = new InvertBinaryTree();
        TreeNode root = new TreeNode(7);
        TreeNode left = new TreeNode(2);
        TreeNode right = new TreeNode(5);
        root.left = left;
        root.right = right;

        TreeNode leftLeft = new TreeNode(1);
        TreeNode leftRight = new TreeNode(3);
        left.left = leftLeft;
        left.right = leftRight;

        TreeNode rightLeft = new TreeNode(4);
        TreeNode rightRight = new TreeNode(6);
        right.left = rightLeft;
        right.right = rightRight;

        ibt.print(root);
        System.out.println();

        ibt.invert(root);
        ibt.print(root);
        System.out.println();
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int val) { this.val = val; }
}
