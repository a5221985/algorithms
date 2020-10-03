import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class MinIDsAfterRemoval {
    public int optimize(int[] items, int n) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < items.length; i++) {
            if (map.containsKey(items[i]))
                map.replace(items[i], map.get(items[i]) + 1);
            else
                map.put(items[i], 1);
        }
        
        List<Item> itemList = new ArrayList<>();
        for (Integer key : map.keySet()) {
            Item item = new Item();
            item.value = key;
            item.freq = map.get(key);
            itemList.add(item);
        }
        
        Collections.sort(itemList, (item1, item2) -> {
            if (item1.freq < item2.freq)
                return -1;
            else if (item1.freq > item2.freq)
                return 1;
            else
                return 0;
        });

        itemList.stream().forEach(System.out::println);
        
        while (n > 0) {
            if (n > itemList.get(0).freq) {
                n -= itemList.get(0).freq;
                itemList.remove(0);
            } else if (n == itemList.get(0).freq) {
                n = 0;
                itemList.remove(0);
            } else {
                n = 0;
            }
        }
        return itemList.size();
    }

    public static void main(String[] args) {
        MinIDsAfterRemoval miar = new MinIDsAfterRemoval();
        int[] items = {4, 3, 2, 2, 4};
        int n = 1;
        System.out.println(miar.optimize(items, n));
    }
}

class Item {
    int value;
    int freq;

    public String toString() {
        return "(" + value + ", " + freq + ")";
    }
}
