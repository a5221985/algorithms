public class InOrderTreeTraversalWithoutExtraSpace {
    public void inOrderRecursive(TreeNode root) {
        if (root == null)
            return;
        inOrderRecursive(root.left);
        System.out.println(root.val);
        inOrderRecursive(root.right);  
    }

    public static void main(String[] args) {
        InOrderTreeTraversalWithoutExtraSpace iottwes = new InOrderTreeTraversalWithoutExtraSpace();
        TreeNode root = new TreeNode(6);
        TreeNode left = new TreeNode(4);
        TreeNode right = new TreeNode(7);
        root.left = left;
        root.right = right;
        TreeNode leftLeft = new TreeNode(3);
        TreeNode leftRight = new TreeNode(5);
        left.left = leftLeft;
        left.right = leftRight;
        TreeNode rightLeft = new TreeNode(6);
        TreeNode rightRight = new TreeNode(8);
        right.left = rightLeft;
        right.right = rightRight;
        
        iottwes.inOrderRecursive(root);
    }
}

public class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;
    public TreeNode(int val) { this.val = val; }
}
