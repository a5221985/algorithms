import java.util.List;
import java.util.ArrayList;
import java.util.Stack;

public class DFS {
    public List<Integer> dfs(TreeNode root) {
        if (root == null)
            return new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        return dfs(stack);
    }

    public List<Integer> dfs(Stack<TreeNode> stack) {
        List<Integer> list = new ArrayList<>();
        while (!stack.isEmpty()) {
            TreeNode node = stack.pop();
            list.add(node.val);
            if (node.right != null)
                stack.push(node.right);
            if (node.left != null)
                stack.push(node.left);
        }
        return list;
    }

    public static void main(String[] args) {
        DFS dfs = new DFS();
        TreeNode root = new TreeNode(7);
        TreeNode left = new TreeNode(4);
        TreeNode right = new TreeNode(9);
        root.left = left;
        root.right = right;

        TreeNode leftLeft = new TreeNode(2);
        TreeNode leftRight = new TreeNode(3);
        left.left = leftLeft;
        left.right = leftRight; 

        TreeNode leftLeftLeft = new TreeNode(1);
        leftLeft.left =leftLeftLeft;

        TreeNode rightLeft = new TreeNode(8);
        TreeNode rightRight = new TreeNode(10);
        right.left = rightLeft;
        right.right = rightRight;

        List<Integer> traversal = dfs.dfs(root);
        System.out.println(traversal);
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int val) { this.val = val; }
}
