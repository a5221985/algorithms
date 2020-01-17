public class DistributeCoins {
    private class Node {
        Integer coins;
        Node left;
        Node right;
    }
    
    private Node tree;

    public DistributeCoins(Integer coins) {
        tree = new Node();
        tree.coins = coins;
    }

    public static DistributeCoins constructSingleNodeTree(Integer coins) {
        return new DistributeCoins(coins);
    }

    public static void main(String[] args) {
        DistributeCoins dc = DistributeCoins.constructSingleNodeTree(2);
        Node left = dc.addLeft(1);
        
    }
}
