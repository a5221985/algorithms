public class Bonuses {
    public int[] computeBonuses(int[] code) {
        boolean isCovered = true;
        int[] bonuses = new int [code.length];
        int minIndex = Integer.MAX_VALUE:
        for (int i = 0; i < code.length; i++) {
            if (code[i] < code[min])
                minIndex = i;
        }
        for (int i = minIndex; i < code.length; i++) {
            
        }
    }

    public static void main(String[] args) {
        int[] code = {10, 40, 200, 1000, 60, 30};

        Bonuses b = new Bonuses();

        int[] bonuses = b.computeBonuses();
    }
}
