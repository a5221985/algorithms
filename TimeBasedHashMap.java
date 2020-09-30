import java.util.Map;
import java.util.HashMap;

public class TimeBasedHashMap<K, V, T> {
    private Map<K, Map<T, V>> map = new HashMap<>();

    public void set(K key, V value, T time) {
        if (map.containsKey(key)) {
            if (map.get(key).containsKey(time))
                map.get(key).replace(time, value);
            else
                map.get(key).put(time, value);
        } else {
            Map<T, V> timeMap = new HashMap<>();
            timeMap.put(time, value);
            map.put(key, timeMap);
        }
    }

    public V get(K key, T time) {
        if (map.containsKey(key) && map.get(key).containsKey(time))
            return map.get(key).get(time);
        return null;
    }

    public static void main(String[] args) {
        TimeBasedHashMap<Integer, Integer, Integer> tbhm = new TimeBasedHashMap<>();

        tbhm.set(1, 1, 0);
        tbhm.set(1, 2, 2);
        System.out.println(tbhm.get(1, 0));
        System.out.println(tbhm.get(1, 2));
    }
}
