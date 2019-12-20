import java.util.Map;
import java.util.HashMap;

public class RotationallySymmetricNumber {
    private Map<Character, Character> symmetricChar = new HashMap<>();

    public RotationallySymmetricNumber() {
        symmetricChar.put('0', '0');
        symmetricChar.put('1', '1');
        symmetricChar.put('6', '9');
        symmetricChar.put('8', '8');
        symmetricChar.put('9', '6');
    }
    
    public Boolean isRotationallySymmetric(String str) {
        if (str == null || str.length() == 0)
            return false;
        int mid = str.length() / 2;
        try {
            for (int i = 0; i < mid; i++) {
                if (str.charAt(i) != symmetricChar.get(str.charAt(str.length() - i - 1)))
                    return false;
            }    
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String str = "1234567";
        RotationallySymmetricNumber rotationallySymmetricNumber = new RotationallySymmetricNumber();
        System.out.println(rotationallySymmetricNumber.isRotationallySymmetric(str));
    }
}
