public class BitArray {
    private int[] bitArray;
    private int size;

    public void init(int size) {
        int arraySize = size / 32;
        if (size % 32 > 0)
            arraySize++;
        bitArray = new int [arraySize];
        this.size = size;
        print();
    }

    public void set(int i, int val) {
        if (val != 1 && val != 0) {
            System.out.println("val should be 1 or 0");
            return;
        }
        if (i < 0 || i >= size) {
            System.out.println("i should be in the range [0, " + (size - 1) + "]");
        }
        int arrayIndex = i / 32;
        int bitIndex = i % 32;
        System.out.println("array index: " + arrayIndex + ", bit index: " + bitIndex); 
        setBit(arrayIndex, bitIndex, val);
    }

    public int get(int i) {
        if (i < 0 || i >= size) {
            System.out.println("i should be in the range [0, " + (size - 1) + "]");
        }
        int arrayIndex = i / 32;
        int bitIndex = i % 32;
        System.out.println("array index: " + arrayIndex + ", bit index: " + bitIndex);
        return getBit(arrayIndex, bitIndex); 
    }

    void setBit(int arrayIndex, int bitIndex, int val) {
        int mask = -1;
        int bit = 1 << bitIndex;
        mask ^= bit;
        bitArray[arrayIndex] = bitArray[arrayIndex] & mask;
        val <<= bitIndex;
        bitArray[arrayIndex] = bitArray[arrayIndex] | val;
        print();
    }

    int getBit(int arrayIndex, int bitIndex) {
        int mask = 1 << bitIndex;
        return (bitArray[arrayIndex] & mask) >> bitIndex;
    }

    public void print() {
        for (int i = 0; i < bitArray.length; i++)
            System.out.print(bitArray[i] + " ");
        System.out.println();
    }

    public void printAsBinary() {
        StringBuilder sb = new StringBuilder();
        int val = 0;
        int count = 0;
        for (int i = 0; i < bitArray.length; i++) {
            val = bitArray[i];
            count = 32;
            while (count > 0) {
                sb.append("" + (val & 1));
                val >>= 1;
                count--;
            }
            sb.append(" ");
        }
        System.out.println(sb.toString());
    }

    public static void main(String[] args) {
        BitArray ba = new BitArray();
        int size = 1200;
        int i = 37;
        int val = 1;
        ba.init(size);
        ba.set(i, val);
        i = 37;
        ba.set(i, val);
        i = 67;
        ba.set(i, val);
        i = 7;
        ba.set(i, val);
        i = 107;
        ba.set(i, val);
        System.out.println(ba.get(i));
        ba.printAsBinary();
    }
}
