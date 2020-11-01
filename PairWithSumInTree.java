import java.util.Queue;
import java.util.LinkedList;
import java.util.Arrays;
import java.util.Set;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.List;

public class PairWithSumInTree {
    public List<Integer> find(TreeNode node, int k) {
        Set<Integer> cache = new HashSet<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(node);
        while (!queue.isEmpty()) {
            TreeNode aNode = queue.remove();
            if (cache.contains((k - aNode.val)))
                return Arrays.asList(aNode.val, k - aNode.val);
            if (aNode.left != null)
                queue.add(aNode.left);
            if (aNode.right != null)
                queue.add(aNode.right);
            cache.add(aNode.val);
        }
        return new ArrayList<>();
    }

    public static void main(String[] args) {
        PairWithSumInTree pwsit = new PairWithSumInTree();
        int k = 20;

        TreeNode tree = new TreeNode(10);
        TreeNode left = new TreeNode(5);
        tree.left = left;

        TreeNode right = new TreeNode(15);
        tree.right = right;

        TreeNode rightLeft = new TreeNode(11);
        right.left = rightLeft;

        TreeNode rightRight = new TreeNode(15);
        right.right = rightRight;

        List<Integer> list = pwsit.find(tree, k);

        System.out.println(list);
    }
}

public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    public TreeNode() {}
    public TreeNode(int val) { this.val = val; }
}
