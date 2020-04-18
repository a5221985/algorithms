public class RomanNumbersEfficient {
    public String toRoman(Integer number) {
        if (number == null)
            return "";
        return _toRoman(number);
    }

    String _toRoman(Integer number) {
        if (map.containsKey(number))
            return map.get(number);
        Integer nearestNum = getNearestRomanNum(number);
        String romanNum = map.get(nearestNum) + _toRoman(numer - nearestNum);
        map.put(number, romanNum);
        return romanNum;
    }

    Integer getNearestRomanNum(Integer number) {
        return binarySearch(number);
    }

    Integer binarySearch(Integer number) {
        Integer nearestNum = number / 2;
        if (map.containsKey(nearestNum))
    }

    public static void main(String[] args) {
        RomanNumbersEfficient rne = new RomanNumbersEfficient();
        System.out.println(rne.toRoman(args[0]));
    }
}
