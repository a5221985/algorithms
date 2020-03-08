public class AVLTree {
    private class Node {
        Integer data;
        Node left;
        Node right;
        Integer balanceFactor;
        Integer height;
    }

    private Node tree;

    public void insert(Integer data) {
        Node newNode = new Node();
        newNode.data = data;
        if (tree == null)
            tree = newNode;
        else {
            insert(tree, newNode);
            newNode.
        }
    }

    void insert(Node tree, Node newNode) {
        if (tree.data < newNode.data) {
            if (tree.left == null)
                tree.left = newNode;
            else
                insert(tree.left, newNode);
        } else {
            if (tree.right == null)
                tree.right = newNode;
            else
                insert(tree.right, newNode);
        }
        rebalanceIfRequired();
    }

    void rebalanceIfRequired() {
                
    }

    public static void main(String[] args) {
        AVLTree avlTree = new AVLTree();

        avlTree.insert(1);
        avlTree.insert(2);
        avlTree.insert(3);
        avlTree.insert(4);
        avlTree.insert(5);
        avlTree.insert(6);
        avlTree.insert(7);
        avlTree.insert(8);
        avlTree.insert(9);
        avlTree.insert(10);

        avlTree.printInOrder();
    }
}
