/**
 * <h2>Prints permutations of given input string</h2>
 * <b>Specification</b>
 * <ol>
 *     <li>if input is empty string "", then print "".</li>
 *     <li>if input has single character ("a" say), then print "a".</li>
 *     <li>if input has n (&gt; 1) characters ("abc" say), then print all n! permutations of the string.</li>
 * </ol><br>
 * <b>Usage</b><br>
 * <code>java Permutations.java "abcd"</code>
 * @author Abdullah
 */
public class Permutations {
    /**
     * computes and returns all permutations of input string
     * @param s Input string to permute
     * @return array of permuations
     */ 
    public String[] permute(String s) {
        if (s == null || s.length() == 0)
            return new String[] {};
        if (s.length() == 1)
            return new String[] {s};
        String suffix = s.substring(1, s.length());
        String[] subPermutations = permute(suffix);
        StringBuilder sb = new StringBuilder();
        int k = 0;
        String[] permutations = new String[subPermutations.length * s.length()];
        for (int i = 0; i < subPermutations.length; i++) {
            char c = s.charAt(0);
            String subString = subPermutations[i];
            for (int j = 0; j <= subString.length(); j++) {
                if (j > 0)
                    sb.append(subString.substring(0, j));
                sb.append(c);
                if (j < subString.length())
                    sb.append(subString.substring(j, subString.length()));
                permutations[k++] = sb.toString();
                sb.delete(0, sb.length());
            }
        }       
        return permutations;
    }

    /**
     * main function to print all permutations of input string
     * @param args array of input strings (only one string is expected)
     */
    public static void main(String[] args) {
        if (args == null || args.length == 0) {
            System.out.println("Format: java Permutations <string>");
            return;
        }
        String s = args[0];

        Permutations p = new Permutations();

        String[] ps = p.permute(s);

        for (int i = 0; i < ps.length; i++)
            System.out.println(ps[i]);
    }
}
