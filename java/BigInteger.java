public class BigInteger {
    String number;

    public BigInteger(String number) {
        this.number = number;
    }

    public BigInteger add(BigInteger other) {
        int digit1 = 0;
        int digit2 = 0;
        int sum = 0;
        int carry = 0;
        int digit = 0;
        StringBuilder sb = new StringBuilder();
        int i = number.length() - 1;
        int j = other.size() - 1;
        while (i >= 0 || j >= 0) {
            digit1 = (i >= 0)? ((int) (number.charAt(i) - '0')) : 0;
            digit2 = (j >= 0)? ((int) (other.charAt(j) - '0')) : 0;
            sum = digit1 + digit2 + carry;
            digit = sum % 10;
            carry = sum / 10;
            sb.append(digit);
            i--;
            j--;
        }
        if (carry > 0)
            sb.append(carry);
        return new BigInteger(sb.reverse().toString());
    }

    public BigInteger sub(BigInteger other) {
        return null;        
    }

    public char charAt(int i) {
        return number.charAt(i);
    }

    public int size() {
        return number.length();
    }

    @Override
    public String toString() {
        return number;
    }

    public static void main(String[] args) {
        BigInteger a = new BigInteger("183975");
        BigInteger b = new BigInteger("9850324");
        BigInteger sum = a.add(b);

        System.out.println(a + " + " + b + " = " + sum);
        BigInteger a1 = new BigInteger("9823758923742373234934");
        BigInteger b1 = new BigInteger("892759832010718320293");
        BigInteger sum1 = a1.add(b1);

        System.out.println(a1 + " + " + b1 + " = " + sum1);
    }
}
