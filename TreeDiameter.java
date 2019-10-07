public class TreeDiameter {
    public Integer[] diameter(Node node) {
        if (node == null || (node.left == null && node.right == null))
            return new Integer[2];

        if (node.left != null)
            Integer[] l = diameter(node.left);

        if (node.right != null)
            Integer[] r = diameter(node.right);

        Integer wPL = l[1] + (node.wL != null)? node.wL: 0;
        Integer wPR = r[1] + (node.wR != null)? node.wR: 0;

        Integer wN = wPL + wPR;
        Integer[] dia = new Integer[2];
        dia[0] = Math.max(Math.max(l[0], r[0]), wN);
        dia[1] = Math.max(wPL, wPR);
        return dia;
    }

    public static void main() {
        
    }
}

class Node {
    T data;
    Node left;
    Node right;
    Integer wL;
    Integer wR;
}
