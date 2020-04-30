import java.util.BitSet;

public class BitVectorExample {
    public static void main(String[] args) {
        BitSet bitSet = new BitSet();
        bitSet.set(1);
        bitSet.set(5);
        bitSet.set(10);
        bitSet.set(50);
        bitSet.set(100);
        bitSet.set(500);
        bitSet.set(1000);

        System.out.println(bitSet);
    }
}
