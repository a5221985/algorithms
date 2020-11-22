public class VisitorPattern {

    public void inOrderTraversal(Node node, Visitor visitor) {
        if (node == null || visitor == null)
            return;
        inOrderTraversal(node.getLeft(), visitor);
        node.accept(visitor);
        inOrderTraversal(node.getRight(), visitor);
    }

    public static void main(String[] args) {
        VisitorPattern vp = new VisitorPattern();
        Node root = new Node(1);
        Node left = new Node(2);
        Node right = new Node(3);
        root.setLeft(left);
        root.setRight(right);
        Node leftLeft = new Node(4);
        Node leftRight = new Node(5);
        Node rightLeft = new Node(6);
        Node rightRight = new Node(7);
        left.setLeft(leftLeft);
        left.setRight(leftRight);
        right.setLeft(rightLeft);
        right.setRight(rightRight);

        Visitor displayVisitor = new DisplayVisitor();
        vp.inOrderTraversal(root, displayVisitor); 
    }
}

public class Node {
    private int val;
    private Node left;
    private Node right;

    Node(int val) { this.val = val; }

    int getVal() {
        return val;
    }

    void setVal(int val) {
        this.val = val;
    }

    Node getLeft() {
        return left;
    }

    void setLeft(Node left) {
        this.left = left;
    }

    Node getRight() {
        return right;
    }

    void setRight(Node right) {
        this.right = right;
    }

    void accept(Visitor visitor) {
        visitor.process(this);
    }    
}

public interface Visitor {
    int process(Node node);
}

public class DisplayVisitor implements Visitor {
    @Override
    public int process(Node node) {
        System.out.println(node.getVal());
        return 0;
    }
}

public class SumVisitor implements Visitor {
    @Override
    public int process(Node node) {
        return node.getVal();
    }
}
