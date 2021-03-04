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
        if (number.equals(other.getNumber()))
            return new BigInteger("0");

        if (number.charAt(0) != '-' && other.getNumber().charAt(0) == '-')
            return add(other);
   
        if (number.charAt(0) == '-' && other.getNumber().charAt(0) != '-') {
            return "-" + (new BigInteger(number.substring(1)).add(new BigInteger(other.getNumber().substring(1)))).getNumber();
        }

        if (number.charAt(0) == '-' && other.getNumber().charAt(0) == '-') {
            
        }

        String first = null;
        String second = null;
        boolean isResultNegative = false;
        if (number.length() > other.size()) {
            first = number;
            second = other.getNumber();
        } else if (number.length() < other.size()) {
            first = other.getNumber();
            second = number;
            isResultNegative = true;
        } else if (number.charAt(0) > other.charAt(0)) {
            first = number;
            second = other.getNumber();     
        } else {
            first = other.getNumber();
            second = number;
            isResultNegative = true;
        }

        int digit1 = 0;
        int digit2 = 0;
        int diff = 0;
        int borrow = 0;
        int digit = 0;
        StringBuilder sb = new StringBuilder();
        int i = first.length() - 1;
        int j = second.length() - 1;
        while (i >= 0 || j >= 0) {
            digit1 = (i >= 0)? ((int) (first.charAt(i) - '0')) : 0;
            digit2 = (j >= 0)? ((int) (second.charAt(j) - '0')) : 0;
            diff = digit1 - digit2 - borrow;
            if (diff < 0) {
                digit = 10 + diff;
                borrow = 1;
            } else {
                digit = diff;
                borrow = 0;
            }
            sb.append(digit);
            i--;
            j--;
        }
        if (isResultNegative)
            sb.append("-");
        return new BigInteger(sb.reverse().toString());
    }

    public char charAt(int i) {
        return number.charAt(i);
    }

    public int size() {
        return number.length();
    }

    public String getNumber() {
        return number;
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

        BigInteger diff = a1.sub(b1);

        System.out.println(a1 + " - " + b1 + " = " + diff);

        BigInteger a2 = new BigInteger("892759832010718320293");
        BigInteger b2 = new BigInteger("9823758923742373234934");

        BigInteger diff2 = a2.sub(b2);

        System.out.println(a2 + " - " + b2 + " = " + diff2);
    }
}
