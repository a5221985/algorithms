class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0)
            return "";
        String lcp = strs[0];
        for (int i = 1; i < strs.length; i++) {
            lcp = findLCP(strs[i], lcp);
            System.out.println(lcp);
        }
        return lcp;
    }
    
    String findLCP(String str, String lcp) {
        if (lcp == null || lcp.length() == 0)
            return "";
        String maxLcp = "";
        for (int i = 0; i < lcp.length(); i++) {
            int index = str.indexOf(lcp.charAt(i));
            if (index >= 0) {
                int j = index;
                int k = i;
                while (j < str.length() && k < lcp.length() && str.charAt(j) == lcp.charAt(k)) {
                    j++;
                    k++;
                }
                String subStr = lcp.substring(i, k);
                System.out.println("SUB STR: " + subStr);
                System.out.println("j: " + j);
                System.out.println("k: " + k);
                if (maxLcp.length() < subStr.length()) {
                    maxLcp = subStr;
                }
            }
        }
        return maxLcp;
    }

    public static void main(String[] args) {
        LongestCommonPrefix lcp = new LongestCommonPrefix();
        String[] strs = {"flower", "flow", "flight"};
        System.out.println(lcp.longestCommonPrefix(strs));
    }
}
