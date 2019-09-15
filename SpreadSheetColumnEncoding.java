import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.Map;
import java.util.HashMap;

public class SpreadSheetColumnEncoding {
    Map<Character, Integer> map = new HashMap<>();

    public SpreadSheetColumnEncoding() {
        map = IntStream
                     .rangeClosed(1, 26)
                     .boxed()
                     .collect(
                        Collectors.toMap(i -> (char) (i + 'A' - 1), i -> i)
                     ); 
    }

    public Integer encode(String str) {
        Integer result = map.get(str.charAt(0));
        for (int i = 1; i <  str.length(); i++) {
            result = 26 * result + map.get(str.charAt(i));
        }
        return result;
    }
  
    public String decode(Integer num) {
        StringBuilder sb = new StringBuilder();
        while (num != 0) {
            Integer p = (num % 26 == 0)? 26: num % 26;
            sb.append(iToC(p));
            num = (num != 0 && num % 26 == 0)? num / 26 - 1: num / 26;
        }
        return sb.reverse().toString();
    }

    public Character iToC(Integer num) {
        return (char) (num + 'A' - 1);
    }

    public String mapAsString() {
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
	

    public static void main(String[] args) {
        SpreadSheetColumnEncoding columnEncoder = new SpreadSheetColumnEncoding();
        System.out.println(columnEncoder.mapAsString());
        String columnCode = "AA";
        Integer encodedNum = columnEncoder.encode(columnCode);
        String decodedCode = columnEncoder.decode(encodedNum);
        System.out.println(columnCode + " -> " + encodedNum);
        System.out.println(encodedNum + " -> " + decodedCode);
        columnCode = "ZZ";
        encodedNum = columnEncoder.encode(columnCode);
        decodedCode = columnEncoder.decode(encodedNum);
        System.out.println(columnCode + " -> " + encodedNum);
        System.out.println(encodedNum + " -> " + decodedCode);
        columnCode = "AAA";
        encodedNum = columnEncoder.encode(columnCode);
        decodedCode = columnEncoder.decode(encodedNum);
        System.out.println(columnCode + " -> " + encodedNum);
        System.out.println(encodedNum + " -> " + decodedCode);
        columnCode = "ZZZ";
        encodedNum = columnEncoder.encode(columnCode);
        decodedCode = columnEncoder.decode(encodedNum);
        System.out.println(columnCode + " -> " + encodedNum);
        System.out.println(encodedNum + " -> " + decodedCode);
    }
}
