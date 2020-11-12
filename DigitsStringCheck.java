public class DigitsStringCheck {
    public boolean hasDigitsOnly(String str) {
        if (str == null || str.length() == 0)
            return false;
        for (int i = 0; i < str.length(); i++)
            if (str.charAt(i) < '0' || str.charAt(i) > '9')
                return false;
        return true;
    }

    public static void main(String[] args) {
        DigitsStringCheck dsc = new DigitsStringCheck();
        String str1 = "1234567";
        String str2 = "43sf334235";
        System.out.println("Does " + str1 + " have digits only? " + dsc.hasDigitsOnly(str1));
        System.out.println("Does " + str2 + " have digits only? " + dsc.hasDigitsOnly(str2));
    }
}
