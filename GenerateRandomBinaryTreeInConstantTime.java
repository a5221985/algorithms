public class GenerateRandomBinaryTreeInConstantTime {

    public Tree generate() {
        return new Tree();
    }

    public static void main(String[] args) {
        GenerateRandomBinaryTreeInConstantTime grbtict = new GenerateRandomBinaryTreeInConstantTime();
        Tree tree = grbtict.generate();
        TreeNode root = tree.getRoot();
        
        System.out.println(root.getVal());
        System.out.println(tree.getLeftChild(root).getVal());    
        System.out.println(tree.getRightChild(root).getVal());    
    }
}

class Tree {
    TreeNode root;
    int maxSize;
    int currentSize = 0;
   
    Tree() {
        maxSize = (int) (Math.random() * Integer.MAX_VALUE);
        System.out.println("MAX SIZE: " + maxSize);
    }

    public TreeNode getRoot() {
        if (currentSize < maxSize) {
            root = new TreeNode((int) (Math.random() * Integer.MAX_VALUE));
            currentSize++;
        }
        return root;
    }

    public TreeNode getLeftChild(TreeNode node) {
        if (node.getLeftChild() == null) {
            if (currentSize < maxSize) {
                node.setLeftChild(new TreeNode((int) (Math.random() * Integer.MAX_VALUE)));
                currentSize++;
            }
        }
        return node.getLeftChild();
    }

    public TreeNode getRightChild(TreeNode node) {
        if (node.getRightChild() == null) {
            if (currentSize < maxSize) {
                node.setRightChild(new TreeNode((int) (Math.random() * Integer.MAX_VALUE)));
                currentSize++;
            }
        }
        return node.getRightChild();
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int val) { this.val = val; }

    int getVal() {
        return val;
    }

    TreeNode getLeftChild() {
        return left;
    }

    TreeNode getRightChild() {
        return right;
    }

    void setLeftChild(TreeNode left) {
        this.left = left;
    }

    void setRightChild(TreeNode right) {
        this.right = right;
    }
}
