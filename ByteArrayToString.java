public class ByteArrayToString {
    public String convertToString(byte[] array) {
        if (array == null || array.length == 0)
            return "";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < array.length; i++)
            sb.append((char) array[i]);
        return sb.toString();
    }

    public static void main(String[] args) {
        ByteArrayToString bats = new ByteArrayToString();
        byte[] array = new byte [26];
        for (int i = 0; i < 26; i++)
            array[i] = (byte) (i + 65);
        String str = bats.convertToString(array);
        System.out.println(str);
    }
}
