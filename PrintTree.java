public class PrintTree {
    
    public void print(int[] tree) {
        if (tree == null || tree.length == 0)
            return;
        int pow = (int) (Math.log(tree.length + 1) / Math.log(2)) - 1;
        int offset = 0;
        int gap = 6;
        int numLeaves = (int) Math.pow(2, pow);
        int firstLeafIndex = tree.length - numLeaves;
        int leafIndexLength = firstLeafIndex + numLeaves;
        while (numLeaves > 0) {
            for (int k = 0; k < offset; k++)
                System.out.print(" ");
            for (int i = firstLeafIndex; i < leafIndexLength; i++) {
                System.out.print(tree[i]);
                for (int j = 0; j <= gap; j++)
                    System.out.print(" ");
            }
            System.out.println();
            numLeaves /= 2;
            firstLeafIndex -= numLeaves;
            leafIndexLength = firstLeafIndex + numLeaves;
            offset += (int)(gap / 2) + 1;
            gap = 2 * gap + 2;
        }
    }

    public static void main(String[] args) {
        int[] tree = {1, 1, 2, 1, 2, 3, 4, 1, 2, 3, 4, 5, 6, 7, 8, 1, 2, 3, 4, 5, 6, 7, 8, 1, 2, 3, 4, 5, 6, 7, 8};

        PrintTree pt = new PrintTree();
 
        pt.print(tree);
    }
}
