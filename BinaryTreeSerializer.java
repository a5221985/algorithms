public class BinaryTreeSerializer {
    class Node {
        Integer data;
        Node left;
        Node right;
    }

    private Node tree;

    public BinaryTreeSerializer(Integer rootData) {
        tree = new Node();
        tree.data = rootData;
    }

    public Node getRoot() {
        return tree;
    }

    public Node addLeft(Node root, Integer data) {
        Node left = constructNode(data);
        root.left = left;
        return left;
    }

    public Node addRight(Node root, Integer data) {
        Node right = constructNode(data);
        root.right = right;
        return right;
    }

    Node constructNode(Integer data) {
        Node node = new Node();
        node.data = data;
        return node; 
    }

    public String serialize(Node root) {
        if (root == null)
            return "#";
        
        return "" + root.data + "," + serialize(root.left) + "," + serialize(root.right);
    }

    public static void main(String[] args) {
        System.out.println("Alhamdulillah");
        BinaryTreeSerializer bts = new BinaryTreeSerializer(7);
        Node root = bts.getRoot();
        Node left = bts.addLeft(root, 5);
        Node right = bts.addRight(root, 9);
        Node left1 = bts.addLeft(left, 4);
        Node right1 = bts.addRight(left, 6);
        Node left11 = bts.addLeft(left1, 1);
        Node right11 = bts.addRight(left1, 3);
        Node left21 = bts.addLeft(right, 8);
        Node right21 = bts.addRight(right, 10);

        System.out.println(bts.serialize(root));
    }
}
