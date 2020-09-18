public class FloatingPointPackage {
    public static FloatingPointNumber construct(long mantissa, long exponent) {
        return new FloatingPointNumber(mantissa, exponent);
    }

    public static FloatingPointNumber add(FloatingPointNumber a, FloatingPointNumber b) {
        long[] exponentWithCarry = addExponent(a.getExponent(), b.getExponent());
        long mantissa = addMantissaAndCarry(a.getMatissa(), b.getMatissa(), exponentWithCarry[1]);
        FloatingPointNumber c = new FloatingPointNumber(mantissa, exponentWithCarry[0]);
        return c;
    }

    static long addMantissaAndCarry(long aMantissa, long bMantissa, long carry) {
        long mantissa = aMantissa + bMantissa; 
        if (carry > 0)
            mantissa += carry;
        return mantissa;
    }

    static long[] addExponent(long aExponent, long bExponent) {
        if (aExponent == 0L)
            return new long[] {bExponent, 0};
        if (bExponent == 0L)
            return new long[] {aExponent, 0};
        long aDigits = findDigits(aExponent);
        long bDigits = findDigits(bExponent);
        long maxDigits = 0;
        if (aDigits < bDigits) {
            aExponent *= (long) Math.pow(10, (bDigits - aDigits));
            maxDigits = bDigits;
        } else if (bDigits < aDigits) {
            bExponent *= (long) Math.pow(10, (aDigits - bDigits));
            maxDigits = aDigits;
        } else {
            maxDigits = aDigits;
        }
        long cExponent = aExponent + bExponent;
        long cDigits = findDigits(cExponent);
        long carry = 0;
        if (cDigits > maxDigits) {
            long decimalDigits = (long) Math.pow(10, maxDigits);
            carry = cExponent / decimalDigits;
            cExponent = cExponent % decimalDigits;
        }
        long[] exponentWithCarry = { cExponent, carry };
        return exponentWithCarry;
    }

    static long findDigits(long exponent) {
        long digits = 0L;
        while (exponent > 0) {
            digits += 1L;
            exponent /= 10;
        }
        return digits;
    }
    
    public static void main(String[] args) {
        FloatingPointNumber a = FloatingPointPackage.construct(25L, 45346345L);
        FloatingPointNumber b = FloatingPointPackage.construct(35L, 8937483434L);

        FloatingPointNumber c = FloatingPointPackage.add(a, b);

        System.out.println(a);       
        System.out.println(b);       
        System.out.println(c);       
    }
}

public class FloatingPointNumber {
    private long mantissa;
    private long exponent;

    public FloatingPointNumber() {}
    
    public FloatingPointNumber(long mantissa, long exponent) {
        this.mantissa = mantissa;
        this.exponent = exponent;
    }

    public long getMatissa() {
        return mantissa;
    }

    public void setMantissa(long mantissa) {
        this.mantissa = mantissa;
    }

    public long getExponent() {
        return exponent;
    }

    public void setExponent(long exponent) {
        this.exponent = exponent;
    }

    public String toString() {
        return "" + mantissa + "." + exponent;
    }
}
