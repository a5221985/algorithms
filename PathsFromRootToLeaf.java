public class PathsFromRootToLeaf {
    public List<List<Integer>> find(Node root) {
        
    }

    public static void main(String[] args) {
        PathsFromRootToLeaf pfrtl = new PathsFromRootToLeaf();
        List<List<Integer>> paths = pfrtl.find(tree);
        System.out.println(paths);
    }
}

class Node {
    int val;
    Node left;
    Node right;
}
