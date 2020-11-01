public class FlipBitPairs {
    public int swapPairs(int num) {
        if (num < 2)
            return num;
        int swapped = 0;
        int shift = 0;
        while (num > 0) {
            int pair = num & 3;
            int temp = pair & 1;
            pair >>= 1;
            pair = (temp << 1) | pair;
            pair <<= shift;
            swapped |= pair; 
            shift += 2;
            num >>= 2;
        }
        return swapped;
    }

    public int convertToInt(String numInBinString) {
        if (numInBinString == null || numInBinString.length() == 0)
            return 0;
        int num = 0;
        for (int i = 0; i < numInBinString.length(); i++)
            num = (num << 1) + (numInBinString.charAt(i) - '0');
        return num;
    }

    public String getBinaryString(int num) {
        StringBuilder sb = new StringBuilder();
        while (num > 0) {
            sb.append("" + (num & 1));
            num >>= 1;
        }
        sb.reverse();
        return sb.toString();
    }

    public static void main(String[] args) {
        FlipBitPairs fbp = new FlipBitPairs();
        String numInBinString = "1110011101";
        System.out.println("NUM IN STRING: " + numInBinString);
        int num = fbp.convertToInt(numInBinString);
        System.out.println("NUM IN BINARY: " + fbp.getBinaryString(num));
        int swapped = fbp.swapPairs(num);
        System.out.println("NUM AFTER SWAP: " + fbp.getBinaryString(swapped));
    }
}
