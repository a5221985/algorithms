import java.util.Map;
import java.util.HashMap;

public class ConvertFromBaseToBase {
    Map<Long, Character> mapItoA = new HashMap<>();
    Map<Character, Long> mapAtoI = new HashMap<>();

    public ConvertFromBaseToBase() {
        for (int i = 0; i < 10; i++)
            mapItoA.put((long) i, (char) (i + '0'));
        for (int i = 0; i < 26; i++)
            mapItoA.put((long) (i + 10), (char) (i + 'A'));
        for (int i = 0; i < 10; i++)
            mapAtoI.put((char) (i + '0'), (long) i);
        for (int i = 0; i < 26; i++)
            mapAtoI.put((char) (i + 'A'), (long) (i + 10));
    }

    public String mapItoAAsString() {
        return mapAsString(mapItoA);
    }

    public String mapAtoIAsString() {
        return mapAsString(mapAtoI);
    }

    public String mapAsString(Map<?, ?> map) {
        return new StringBuilder()
                 .append("[\n")
                 .append(
                    map
                      .keySet()
                      .stream()
                      .map(k -> "{" + k + " -> " + map.get(k) + "}")
                      .reduce(
                         "", 
                         (str, e) -> str + "\t" + e + ",\n"
                      )
                 )
                 .append("]")
                 .toString();
    }

    public Long convertFromAtoI(String str, Integer base) {
        Long result = mapAtoI.get(str.charAt(0));
        for (int i = 1; i < str.length(); i++) {
            result = base * result + mapAtoI.get(str.charAt(i));
        }
        return result;
    }

    public String convertFromItoA(Long num, Integer base) {
        StringBuilder sb = new StringBuilder();
        while (num > 0) {
            sb.append(mapItoA.get(num % base));
            num = num / base;
        }
        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        String number = "1111010111111010";
        Integer b1 = 2;
        Integer b2 = 16;

        ConvertFromBaseToBase c = new ConvertFromBaseToBase();
//        System.out.println(c.mapItoAAsString());
//        System.out.println(c.mapAtoIAsString());

        System.out.println(number + " is in base " + b1);
        Long num = c.convertFromAtoI(number, b1);
        System.out.println(number + " as base 10 = " + num);
        String r = c.convertFromItoA(num, b2);
        System.out.println(number + " as base " + b2 + " = " + r);
    }
}
