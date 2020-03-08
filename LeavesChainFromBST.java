public class LeavesChainFromBST {
    class Node {
        Integer data;
        Node left;
        Node right;
    }

    private Node root;

    public List<Node> getLeavesChain() {
        return getLeavesChain(root);
    }

    List<Node> getLeavesChain(Node node) {
        if (isLeaf(node))
            return new ArrayList<>(Arrays.asList(node));
        Node leftList = getLeavesChain(node.left);
        Node rightList = getLeavesChain(node.right);
        return connect(leftList, rightList);
    }

    public static void main(String[] args) {
        LeavesChainFromBST lcfb = new LeavesChainFromBST();
        Node root = new Node(7);
        lcfb.setRoot(root);

        Node left1 = new Node(5);
        lcfb.setLeft(root, left1);
        
        Node right2 = new Node(9);
        lcfb.setRight(root, right2);

        Node left11 = new Node(3);
        lcfb.setLeft(left1, left11);

        Node righ12 = new Node(6);
        lcfb.setRight(left1, right12);

        Node left111 = new Node(2);
        lcfb.setLeft(left11, left111);

        Node right112 = new Node(4);
        lcfb.setRight(left11, right112);

        Node left1111 = new Node(1);
        lcfb.setLeft(left111, left1111);

        Node left21 = new Node(8);
        lcfb.setLeft(right2, left21);
        
        Node right22 = new Node(10);
        lcfb.setRight(right2, right22);

        lcfb.getLeavesChain();
    }
}
