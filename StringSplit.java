public class StringSplit {
    public static void main(String[] args) {
        String str = "11.1.2";
        String[] tokens = str.split("\\.");
        for (int i = 0; i < tokens.length; i++)
            System.out.println(tokens[i]);
    }
}
