import java.util.Queue;
import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.List;
import java.util.LinkedList;

public class LevelOrderAlternating {
    public int[] solve(Tree root) {
        if (root == null)
            return new int [0];
        return solve(root, true);
    }
    
    int[] solve(Tree root, boolean leftToRight) {
        Queue<Map<Tree, Integer>> queue = new LinkedList<>();
        Map<Tree, Integer> rootMap = new HashMap<>();
        rootMap.put(root, 0);
        queue.add(rootMap);
        while (!queue.isEmpty()) {
            Map<Tree, Integer> nodeMap = queue.remove();
            Tree node = null;
            for (Tree key : nodeMap.keySet())
                node = key;
            int level = nodeMap.get(node);
            System.out.println(level);
            if (level % 2 == 0) {
                Tree temp = node.left;
                node.left = node.right;
                node.right = temp;
            }
            if (node.left != null) {
                Map<Tree, Integer> leftMap = new HashMap<>();
                leftMap.put(node.left, level + 1);
                queue.add(leftMap);
            }
            if (node.right != null) {
                Map<Tree, Integer> rightMap = new HashMap<>();
                rightMap.put(node.right, level + 1);
                queue.add(rightMap);
            }
        }
        Queue<Tree> bfsQueue = new LinkedList<>();
        bfsQueue.add(root);
        List<Integer> list = new ArrayList<>();
        while (!bfsQueue.isEmpty()) {
            Tree node = bfsQueue.remove();
            list.add(node.val);
            if (node.left != null)
                bfsQueue.add(node.left);
            if (node.right != null)
                bfsQueue.add(node.right);
        }
        return list.stream().mapToInt(i -> i).toArray();
    }

    public static void main(String[] args) {
//      [3, [0, null, [2, [1, null, null], null]], [4, null, null]]
        Tree root = new Tree();
        root.val = 3;
        Tree left = new Tree();
        left.val = 0;
        Tree right = new Tree();
        right.val = 4;
        Tree leftLeft = new Tree();
        leftLeft.val = 2;
        Tree leftLeftLeft = new Tree();
        leftLeftLeft.val = 1;

        root.left = left;
        root.right = right;
        left.left = leftLeft;
        leftLeft.left = leftLeftLeft;

        LevelOrderAlternating loa = new LevelOrderAlternating();

        int[] result = loa.solve(root);

        for (int i = 0; i < result.length; i++)
            System.out.print(result[i] + " ");
        System.out.println(); 
    }
}

class Tree {
  int val;
  Tree left;
  Tree right;
}
