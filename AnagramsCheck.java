public class AnagramsCheck {
    public boolean check(String str1, String str2) {
        if (str1 == null && str2 == null)
            return false;
        if (str1 == null || str2 == null)
            return false;
        if (str1.length() != str2.length())
            return false;
        if (str1.equals(str2))
            return true;
        System.out.println("hi");
        int[] frequency1 = new int [26];
        int[] frequency2 = new int [26];
        for (int i = 0; i < str1.length(); i++)
            frequency1[str1.charAt(i) - 'a']++;
        for (int i = 0; i < str2.length(); i++)
            frequency2[str2.charAt(i) - 'a']++;
        for (int i = 0; i < frequency1.length; i++)
            if (frequency1[i] != frequency2[i])
                return false;
        print(frequency1);
        print(frequency2);
        return true; 
    }
  
    void print(int[] array) {
        if (array == null || array.length == 0) {
            System.out.println("[]");
            return;
        }
        if (array.length == 1) {
            System.out.println("[" + array[0] + "]");
            return;
        }
        System.out.print("[" + array[0]);
        for (int i = 1; i < array.length; i++)
            System.out.print(", " + array[i]);
        System.out.println("]");
    }

    public static void main(String[] args) {
        AnagramsCheck ac = new AnagramsCheck();
        String str1 = "abcdefghij";
        String str2 = "jadegcfibh";
        boolean areAnagrams = ac.check(str1, str2);
        System.out.println("Are " + str1 + " and " + str2 + " anagrams? " + areAnagrams);
    }
}
