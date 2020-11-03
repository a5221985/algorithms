public class CheckIfStringsArePermutations {
    // O(n)
    public boolean checkIfPermutations(String str1, String str2) {
        if (str1 == null && str2 == null)
            return true;
        if (str1 == null || str2 == null)
            return false;
        if (str1.equals(str2))
            return true;
        if (str1.length() != str2.length())
            return false;
        int[] charFrequencyOfStr1 = new int [26];
        int[] charFrequencyOfStr2 = new int [26];
        int index = 0;
        // O(n)
        for (int i = 0; i < str1.length(); i++) {
            index = str1.charAt(i) - 'a';
            charFrequencyOfStr1[index] = charFrequencyOfStr1[index] + 1;
        } 
        // O(n)
        for (int i = 0; i < str2.length(); i++) {
            index = str2.charAt(i) - 'a';
            charFrequencyOfStr2[index] = charFrequencyOfStr2[index] + 1;
        }
        // O(1)
        for (int i = 0; i < 26; i++) {
            if (charFrequencyOfStr1[i] != charFrequencyOfStr2[i])
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        CheckIfStringsArePermutations cisap = new CheckIfStringsArePermutations();
        String str1 = "ahbuibklp";
        String str2 = "buiaklbhp";
        System.out.println(cisap.checkIfPermutations(str1, str2));
    }
}
