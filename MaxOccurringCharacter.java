public class MaxOccurringCharacter {
    public char maxOccurringChar(String str) {
        int[] frequency = new int [26];
        for (int i = 0; i < str.length(); i++)
            frequency[str.charAt(i) - 'a']++;
        int maxFreqIndex = 0;
        for (int i = 0; i < frequency.length; i++)
            if (frequency[maxFreqIndex] < frequency[i])
                maxFreqIndex = i;
        return (char) (maxFreqIndex + 'a');
    }

    public static void main(String[] args) {
        MaxOccurringCharacter moc = new MaxOccurringCharacter();
        String str = "abcaadbcacaaaefgah";
        System.out.println(moc.maxOccurringChar(str));
    }
}
