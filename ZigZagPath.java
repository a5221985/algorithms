import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class ZigZagPath {
    public List<Integer> getPathToLabel(Integer label) {
        if (label == 1) {
            return new ArrayList<Integer>(Arrays.asList(label));
        }
        Integer pComplement = label / 2;
        Integer k = 1;
        while (k <= pComplement)
            k *= 2;
        Integer p = 3 * k / 2 - pComplement - 1;
        List<Integer> list = getPathToLabel(p);
        list.add(label);
        return list;
    }

    public static void main(String[] args) {
        ZigZagPath zzp = new ZigZagPath();
        List<Integer> list = zzp.getPathToLabel(10240);
        System.out.println(list);
    }
}
