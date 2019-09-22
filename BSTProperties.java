public class BSTProperties {
    public class Node {
        Integer data;
        Node left;
        Node right;
        Node parent;
    }

    private Node tree;

    public BSTProperties() {
    } 

    public static void main(String[] args) {
        BSTProperties bst = new BSTProperties();
        Node root = new Node();
        root.data = 7;
        
        Node left1 = new Node();
        left1.data = 4;
        root.left = left1;

        Node right1 = new Node();
        right1.data = 9;
        root.right = right1;

        Node left11 = new Node();
        left11.data = 2;
        left1.left = left11;

        Node right11 = new Node();
        right11.data = 6;
        left1.right = right11;

        Node left111 = new Node();
        left111.data = 1;
        left11.left = left111;

        Node right111 = new Node();
        right111.data = 3;
        left11.right = right111;

        Node left112 = new Node();
        left112.data = 5;
        right11.left = left112;

        Node left121 = new Node();
        left121.data = 8;
        right1.left = left121;

        Node right121 = new Node();
        right121.data = 10;
        right1.right = right121;
    }
}
