public class NumOfMatchingPalyndromes {
    public int find(String str) {
        if (s == null || s.length() == 0)
            return 0;
        String[] palyndromes = find(str.substring(0, str.length() - 1);
        String[] newPalyndromes = Arrays.copyOf(palyndromes, palyndromes.length + 2);
        newPalyndromes[palyndromes.length] = "" + str.charAt(str.length() - 1);
        newPalyndromes[palyndromes.length + 1] = 
    }

    public static void main(String[] args) {
        NumOfMatchingPalyndromes nomp = new NumOfMatchingPalyndromes();
        String str = "tacocat";
        System.out.println(nomp.find(str));
    }
}
