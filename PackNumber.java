public class PackNumber {
    public Integer[] pack(String a) {
        int nibbles = Integer.SIZE / 4;
        int size = a.length() / nibbles;
        size += a.length() % nibbles == 0? 0: 1;  
        Integer[] n = new Integer[size];
        for (int i = 0; i < n.length; i++) {
            n[i] = 0;
            int index = 0;
            for (int j = 0; j < nibbles && (index = i * nibbles + j) < a.length(); j++) {
                n[i] += atoi(a.charAt(index));
                if (j < nibbles - 1)
                    n[i] <<= 4;
            }
        }
        return n;
    }

    public String unpack(Integer[] n) {
        StringBuilder sb = new StringBuilder();
        for (int i = n.length - 1; i >= 0; i--) {
            Integer p = n[i];
            while (p > 0) {
                sb.append(itoa(p >> 28));
                if (p > 0)
                    p <<= 4;
            }
        }
        return sb.toString();
    }

    public Integer atoi(char c) {
        return (int) (c - '0');
    }

    public char itoa(int i) {
        return (char) (i + (int) '0');
    }

    public static void main(String[] args) {
        String a = args[0];

        PackNumber pn = new PackNumber();
        Integer[] pa = pn.pack(a);
        
        for (int i = 0; i < pa.length; i++)
            System.out.println("pa[" + i + "]: " + pa[i]);

        System.out.println(pn.unpack(pa));
    }
}
