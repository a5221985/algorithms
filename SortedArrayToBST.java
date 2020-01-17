/**
 * Implementation that converts sorted array to a Binary Search Tree (BST)
 * @author Abdullah. M
 */
public class SortedArrayToBST {
    class Node {
        Integer data;
        Node left;
        Node right;
    }

    /**
     * Converts a sorted array to a BST
     * @param array Sorted array
     * @return BST
     */
    public Node convert(Integer[] array) {
        if (array == null || array.length == 0)
            return null;

        return convert(array, 0, array.length - 1);
    }

    /**
     * Converts a sorted array to a Binary Search Tree (BST)
     * @param array Sorted array
     * @param low Lower index
     * @param high Upper index
     * @return BST
     */
    Node convert(Integer[] array, int low, int high) {
        if (low > high)
            return null;

        int mid = (low + high) / 2;

        Node root = new Node();
        root.data = array[mid];
        root.left = convert(array, low, mid - 1);
        root.right = convert(array, mid + 1, high);
        return root;
    }

    /**
     * Prints the tree in order
     * @param tree BST
     */
    public void printTree(Node tree) {
        if (tree == null)
            return;
        printTree(tree.left);
        System.out.println(tree.data);
        printTree(tree.right);
    }

    /**
     * Main method to test the implementation
     * @param args command-line args
     */
    public static void main(String[] args) {
        SortedArrayToBST satb = new SortedArrayToBST();
   
        Integer[] array = new Integer[] {1, 2, 3, 4, 5, 6, 7, 8, 9};
        Node tree = satb.convert(array);

        satb.printTree(tree);        
    }
}
