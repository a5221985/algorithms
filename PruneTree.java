public class PruneTree {

    public void printInOrder(TreeNode node) {
        if (node == null)
            return;
        System.out.print("[");
        printInOrder(node.left);
        System.out.print("] ");
        System.out.print(node.val);
        System.out.print(" [");
        printInOrder(node.right);
        System.out.print("]");
    }

    public void pruneByRemovingZeros(TreeNode node) {
        if (node == null)
            return;
        if (isLeaf(node.left) && node.left.val == 0)
            node.left = null;
        if (isLeaf(node.right) && node.right.val == 0)
            node.right = null;
        pruneByRemovingZeros(node.left);
        pruneByRemovingZeros(node.right);
    }

    boolean isLeaf(TreeNode node) {
        return node != null && node.left == null && node.right == null;
    }

    public static void main(String[] args) {
        PruneTree pt = new PruneTree();
        TreeNode root = new TreeNode(1);
        TreeNode left = new TreeNode(0);
        TreeNode right = new TreeNode(0);
        root.left = left;
        root.right = right;
        TreeNode rightLeft = new TreeNode(1);
        TreeNode rightRight = new TreeNode(0);
        right.left = rightLeft;
        right.right = rightRight;
        TreeNode rightLeftLeft = new TreeNode(0);
        TreeNode rightLeftRight = new TreeNode(0);
        rightLeft.left = rightLeftLeft;
        rightLeft.right = rightLeftRight;
        pt.printInOrder(root);
        System.out.println();
        pt.pruneByRemovingZeros(root);
        pt.printInOrder(root);
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int val) { this.val = val; }
}
