import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class IPAddressCombinations {
    public List<String> findCombinations(String digits) {
        return findCombinations(digits, 0, 0);
    }

    List<String> findCombinations(String digits, int index, int dots) {
        if (dots >= 3) {
            if (index >= digits.length())
                return new ArrayList<>();
            if (digits.charAt(index) == '0')
                return new ArrayList<>();
            int prefix = Integer.parseInt(digits.substring(index));
            if (prefix < 256)
                return new ArrayList<>(Arrays.asList(digits.substring(index)));
            else
                return new ArrayList<>();
        }

        List<String> ips = new ArrayList<>();
        for (int i = index; i < index + 3 && i < digits.length(); i++) {
            int prefix = Integer.parseInt(digits.substring(index, i + 1));
            if (prefix < 256) {
                List<String> subIps = findCombinations(digits, i + 1, dots + 1);
                if (!subIps.isEmpty()) {
                    for (String subIp : subIps) {
                        ips.add("" + prefix + "." + subIp);
                    }
                }
            }
        }

        return ips;
    }

    public static void main(String[] args) {
        IPAddressCombinations iac = new IPAddressCombinations();

        String digits = "2542540123";
        List<String> ips = iac.findCombinations(digits);

        System.out.println(ips);
    }
}
