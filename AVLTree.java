import java.util.List;
import java.util.LinkedList;
import java.util.Arrays;

public class AVLTree {
    private TreeNode tree;

    public boolean insert(int val) {
        if (tree == null) {
            tree = new TreeNode(val);
            return true;
        }
        TreeNode parent = binarySearchForParent(val);
        System.out.println("parent: " + parent.val);
        if (val <= parent.val)
            parent.left = new TreeNode(val);
        else
            parent.right = new TreeNode(val);
        return true;
    }

    TreeNode binarySearchForParent(int val) {
        if (tree == null)
            return null;
        if (tree.val == val)
            return tree;
        TreeNode current = tree;
        while (current.left != null || current.right != null) {
            if (current.val == val)
                return current;
            else if (current.val < val) {
                if (current.right == null)
                    return current;
                current = current.right;
            } else {
                if (current.left == null)
                    return current;
                current = current.left;
            } 
        }
        return current;
    }

    public List<Integer> inorder() {
        return inorder(tree);
    }
    
    List<Integer> inorder(TreeNode tree) {
        if (tree == null)
            return new LinkedList<>();
        if (tree.left == null && tree.right == null)
            return new LinkedList<>(Arrays.asList(tree.val));
        List<Integer> left = inorder(tree.left);
        List<Integer> right = inorder(tree.right);
        List<Integer> list = new LinkedList<>(left);
        list.add(tree.val);
        list.addAll(right);
        return list;
    }

    public void print(List<Integer> list) {
        if (list == null || list.isEmpty()) {
            System.out.println("Empty List");
            return;
        }
        System.out.println(list);
    }

    public static void main(String[] args) {
        AVLTree aVLTree = new AVLTree();
        int size = 10;
        for (int i = 0; i < size; i++)
            aVLTree.insert(i);
        aVLTree.print(aVLTree.inorder());
    }
}

class TreeNode {
    int val;
    int height;
    TreeNode left;
    TreeNode right;
    TreeNode(int val) { this.val = val; height = 1; }
}
