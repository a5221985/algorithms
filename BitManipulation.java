public class BitManipulation {

    public int compliment(int num) {
        int mask = 1;
        while (mask <= num)
            mask <<= 1;
        System.out.println(getBitString(mask));
        mask--;
        System.out.println(getBitString(mask));
        return num ^ mask;
    }

    public String getBitString(int num) {
        if (num == 0)
            return "";
        return getBitString(num >> 1) + (num & 1);
    }

    public static void main(String[] args) {
        BitManipulation bm = new BitManipulation();
        int num = 10;
        System.out.println(bm.getBitString(num));
        System.out.println(bm.getBitString(bm.compliment(num)));
    }
}
