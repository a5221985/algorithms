import java.util.Map;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.LinkedList;

public class MinSumPathInBinTree {
    Map<TreeNode, TreeNode> pi = new LinkedHashMap<>();

    public int minSum(TreeNode node) {
        if (node == null)
            return 0;
        if (node.left == null && node.right == null) { 
            pi.put(node, null);
            return node.val;
        }
        int leftSum = minSum(node.left);
        int rightSum = minSum(node.right);
        if (leftSum < rightSum)
            pi.put(node.left, node);
        else
            pi.put(node.right, node);
        return node.val + Math.min(leftSum, rightSum);
    }

    public List<Integer> getPathValues() {
        if (pi == null || pi.isEmpty())
            return new LinkedList<>();
        List<Integer> list = new LinkedList<>();
        System.out.println(pi);
        TreeNode current = pi.keySet().iterator().next();
        while (current != null) {
            list.add(current.val);
            current = pi.get(current);
        }
        return list;
    }

    public static void main(String[] args) {
         MinSumPathInBinTree mspibt = new MinSumPathInBinTree();
         TreeNode root = new TreeNode(10);
         TreeNode left = new TreeNode(5);
         TreeNode right = new TreeNode(5);
         root.left = left;
         root.right = right;
         TreeNode leftRight = new TreeNode(2);
         TreeNode rightRight = new TreeNode(1);
         left.right = leftRight;
         right.right = rightRight;
         TreeNode rightRightLeft = new TreeNode(-1);
         rightRight.left = rightRightLeft;

         System.out.println(mspibt.minSum(root));
         System.out.println(mspibt.getPathValues());
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int val) { this.val = val; }
}
