import java.util.Queue;
import java.util.LinkedList;

public class SerializeBinaryTree {
    public String serialize(TreeNode node) {
        if (node == null)
            return "";
        return bfs(node);
    }

    String bfs(TreeNode node) {
        Queue<TreeNode> queue = new LinkedList<>();
        StringBuilder sb = new StringBuilder();
        sb.append("" + node.val);
        queue.add(node.left);
        queue.add(node.right);
        while (!queue.isEmpty()) {
            TreeNode currentNode = queue.remove();
            if (currentNode == null) {
                sb.append(",");
                continue;
            }
            sb.append("," + currentNode.val);
            if (currentNode.left != null || currentNode.right != null) {
		queue.add(currentNode.left);
		queue.add(currentNode.right);
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        TreeNode left = new TreeNode(2);
        TreeNode right = new TreeNode(3);
        root.left = left;
        root.right = right;
        TreeNode leftLeft = new TreeNode(4);
        TreeNode leftRight = new TreeNode(5);
        left.left = leftLeft;
        left.right = leftRight;
        TreeNode rightLeft = new TreeNode(6);
        TreeNode rightRight = new TreeNode(7);
        right.left = rightLeft;
//        right.right = rightRight;
        
        SerializeBinaryTree sbt = new SerializeBinaryTree();
        String serialized = sbt.serialize(root);
        System.out.println(serialized);
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int val) { this.val = val; }
}
