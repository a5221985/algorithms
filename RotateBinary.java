public class RotateBinary {
    void printBinary(int num) {
        StringBuilder sb = new StringBuilder();
        while (num != 0) {
            sb.append("" + (num & 1));
            num >>>= 1;
        }
        for (int i = sb.length() + 1; i <= 32; i++)
            sb.append("0");
        System.out.println(sb.reverse().toString());
    }

    public int rotate(int num) {
        int mask = ((1 << 31) | 1);
        int mid = 16;
        for (int i = 0; i < mid; i++) {
            mask = (1 << (31 - i)) | (1 << i);
            num = (num & ~mask) | ((num & (1 << i)) << (31 - 2 * i)) | ((num >>> (31 - 2 * i)) & (1 << i));
        }
        return num;
    }

    public static void main(String[] args) {
        RotateBinary rb = new RotateBinary();
        int num = 35235;
        rb.printBinary(num);
        int rotated = rb.rotate(num);
        rb.printBinary(rotated);
    }
}
