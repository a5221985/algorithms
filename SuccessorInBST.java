public class SuccessorInBST {
    public TreeNode successor(TreeNode root, int val) {
        if (root == null)
            return null;
        TreeNode current = root;
        TreeNode parent = root;
        while (current != null && (current.left != null || current.right != null)) {
            if (current.val == val) {
                if (current.right == null)
                    return current.parent;
                else {
                    current = current.right;
                    while (current.left != null) {
                        current = current.left;
                    }
                    return current;
                }
            } else if (val < current.val) {
                if (current.left == null)
                    return current;
                else {
                    parent = current;
                    current = current.left;
                    while (current.right != null) {
                        current = current.right;
                    }                    
                    if (val < current.val)
                        return current;
                    else
                        return parent;
                }
            } else {
                if (current.right == null)
                    return null;
                else {
                    current = current.right;
                }
            }
        }
        if (current != null && current.val > val)
            return current;
        return null;
    }

    public static void main(String[] args) {
        SuccessorInBST sib = new SuccessorInBST();
        TreeNode root = new TreeNode(10);
        TreeNode left = new TreeNode(5);
        TreeNode right = new TreeNode(30);
        root.left = left;
        root.right = right;
        left.parent = root;
        right.parent = root;
        TreeNode rightLeft = new TreeNode(22);
        TreeNode rightRight = new TreeNode(35);
        right.left = rightLeft;
        right.right = rightRight;
        rightLeft.parent = right;
        rightRight.parent = right;

        int val = 22; 
        TreeNode successor = sib.successor(root, 22);
        System.out.println("Successor of " + val + " is " + successor.val);
        val = 2; 
        successor = sib.successor(root, 2);
        System.out.println("Successor of " + val + " is " + successor.val);
        val = 10; 
        successor = sib.successor(root, 10);
        System.out.println("Successor of " + val + " is " + successor.val);
        val = 11; 
        successor = sib.successor(root, 11);
        System.out.println("Successor of " + val + " is " + successor.val);
        val = 30; 
        successor = sib.successor(root, 11);
        System.out.println("Successor of " + val + " is " + successor.val);
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode parent;
    TreeNode(int val) { this.val = val; }
}
