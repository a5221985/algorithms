import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;
import java.util.Arrays;

public class UnionFind {
    Map<Character, Integer> map;
    List<Integer> uf;

    public UnionFind(final List<Character> list) {
        map = list.stream().collect(Collectors.toMap(e -> e, e -> (int) (e - 'a')));
        uf = list.stream().map(e -> (int) (e - 'a')).collect(Collectors.toList()); 
    }

    public Boolean find(Character a, Character b) {
        Integer i1 = map.get(a);
        Integer i2 = map.get(b);
        Integer r1 = findRoot(i1);
        Integer r2 = findRoot(i2);
        compress(i1, r1);
        compress(i2, r2);     
        return r1 == r2;
    }

    public Integer findRoot(Integer e) {
        while (e != uf.get(e))
            e = uf.get(e);
        return e;
    }

    public void union(Character a, Character b) {
        Integer i1 = map.get(a);
        Integer i2 = map.get(b);
        Integer r1 = findRoot(i1);
        Integer r2 = findRoot(i2);
        uf.set(r2, r1);
        compress(i1, r1);
        compress(i2, r1);
    }

    public void compress(Integer i, Integer r) {
        while (uf.get(i) != r) {
            uf.set(i, r);
            i = uf.get(i);
        }
    }

    public void printMap() {
        map.keySet().stream().forEach(i -> System.out.println("{" + i + " -> " + map.get(i) + "}"));        
    }

    public void print() {
        uf
         .stream()
         .forEach(e -> System.out.print(e + " "));
        System.out.println();
    }

    public static void main(String[] args) {
        UnionFind uf = new UnionFind(Arrays.asList('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'));
        uf.printMap();
        uf.print();
        System.out.println(uf.find('a', 'a'));
        System.out.println(uf.find('a', 'c'));
        uf.print();
        uf.union('a', 'b');
        uf.union('a', 'c');
        uf.union('d', 'e');
        uf.print();
        uf.union('b', 'e');
        uf.print();
        uf.union('j', 'k');
        uf.union('l', 'm');
        uf.union('n', 'o');
        uf.print();
        uf.union('e', 'k');
        uf.print();
    }
}
