public class RecursivelyRemoveDuplicates {
    public String removeDuplicates(String str) {
        if (str == null || str.length() < 2)
            return str;
        StringBuilder sb = new StringBuilder();
        sb.append(removeDuplicates(str.substring(0, str.length() - 1)));
        if (str.charAt(str.length() - 1) != str.charAt(str.length() - 2))
            sb.append(str.charAt(str.length() - 1));
        return sb.toString();
    }    

    public static void main(String[] args) {
        RecursivelyRemoveDuplicates rrd = new RecursivelyRemoveDuplicates();
        String str = "aaaabbcccdddddddefgghijjjkllmnoooopqrrssssssttuvwxxyyyyz";
        System.out.println(rrd.removeDuplicates(str));
    }
}
