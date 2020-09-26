public class SumOfDigitPathsInBinTree {
    public int sum(Tree root) {
        if (root == null)
            return 0;
        return dfs(root, 0);
    }
    
    int dfs(Tree root, int num) {
        if (root != null && root.left == null && root.right == null)
            return num * 10 + root.val;
        int left = dfs(root.left, num * 10 + root.val);
        int right = dfs(root.right, num * 10 + root.val);
        System.out.println(left);
        System.out.println(right);
        System.out.println();
        return left + right;
    }

    public static void main(String[] args) {
        SumOfDigitPathsInBinTree sodpibt = new SumOfDigitPathsInBinTree();

        Tree root = new Tree();
        root.val = 1;
        Tree left = new Tree();
        left.val = 2;
        Tree right = new Tree();
        right.val = 3;
        
        root.left = left;
        root.right = right;
        System.out.println(sodpibt.sum(root));
    }
}

class Tree {
    int val;
    Tree left;
    Tree right;
}
