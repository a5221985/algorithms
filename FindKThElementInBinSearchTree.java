import java.util.*;

public class FindKThElementInBinSearchTree {
    public int find(Tree root, int k) {
        if (root == null)
            return 0;
        int[] elements = _solve(root);
        print(elements);
        if (elements.length > k)
            return elements[k];
        else
            return -1;
    }
    
    int[] _solve(Tree root) {
        if (root == null)
            return new int [0];
        int[] left = _solve(root.left);
        int[] right = _solve(root.right);
        int[] merged = Arrays.copyOf(left, left.length + right.length + 1);
        merged[left.length] = root.val;
        System.arraycopy(right, 0, merged, left.length + 1, right.length);
        return merged;
    }

    public void print(int[] array) {
        if (array == null || array.length == 0)
            System.out.println("The array is empty");
        for (int i = 0; i < array.length; i++)
            System.out.print(array[i] + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        FindKThElementInBinSearchTree fkteibst = new FindKThElementInBinSearchTree();
        int k = 0;
        Tree tree = new Tree();
        tree.val = 3;
        Tree left = new Tree();
        left.val = 2;
        Tree right = new Tree();
        right.val = 9;
        Tree rightLeft = new Tree();
        rightLeft.val = 7;
        Tree rightLeftLeft = new Tree();
        rightLeftLeft.val = 4;
        Tree rightLeftRight = new Tree();
        rightLeftRight.val = 8;
        Tree rightRight = new Tree();
        rightRight.val = 12;

        tree.left = left;
        tree.right = right;
        right.left = rightLeft;
        rightLeft.left = rightLeftLeft;
        rightLeft.right = rightLeftRight;
        right.right = rightRight;

        int element = fkteibst.find(tree, k);
        System.out.println(element);
    }
}

class Tree {
    int val;
    Tree left;
    Tree right;
}
