public class OpenAddressingWithLinearProbing {
    public static final int DEFAULT_SIZE = 12;
    public static int a = 5;
    private Node[] table = new Node[DEFAULT_SIZE];
    private int capacity = DEFAULT_SIZE;
    private int size = 0;

    private class Node {
        String key;
        int keyHash;
        Integer value;
    }

    private interface Condition {
        boolean isTrue(int index);
    }

    public void put(String key, Integer value) {
        int index = findSlotIndex(key);
        Node newNode = new Node();
        newNode.key = key;
        newNode.keyHash = key.hashCode();
        newNode.value = value;
        table[index] = newNode;
    }

    public Integer get(String key) {
        int index = findKeyIndex(key);
        if (index != -1)
            return table[index].value;
        return null;
    }

    int findSlotIndex(String key) {
        int keyHash = key.hashCode();
        int index = getIndexFromHash(keyHash);

        int x = 1;
        while (table[index] != null) {
            index = (index + a * x) % capacity;
            x++;
        }

        return index;
    }

    int findKeyIndex(String key) {
        int keyHash = key.hashCode();
        int index = getIndexFromHash(keyHash);

        int x = 1;
        while (table[index] == null || table[index].keyHash != keyHash || !key.equals(table[index].key)) {
            index = (index + a * x) % capacity;
            x++;
        }

        return table[index] == null || table[index].keyHash != keyHash || !key.equals(table[index].key)? -1: index;
    }

    int getIndexFromHash(int keyHash) {
        return keyHash % capacity;
    }
    
    public static void main(String[] args) {
        OpenAddressingWithLinearProbing oawlp = new OpenAddressingWithLinearProbing();
        oawlp.put("one", 1);
        oawlp.put("two", 2);
        oawlp.put("three", 3);
        oawlp.put("four", 4);
        oawlp.put("five", 5);
        oawlp.put("six", 6);
        oawlp.put("seven", 7);
        oawlp.put("eight", 8);
        oawlp.put("nine", 9);
        oawlp.put("ten", 10);
   
        System.out.println("one: " + oawlp.get("one"));
        System.out.println("two: " + oawlp.get("two"));
        System.out.println("three: " + oawlp.get("three"));
        System.out.println("four: " + oawlp.get("four"));
        System.out.println("five: " + oawlp.get("five"));
        System.out.println("six: " + oawlp.get("six"));
        System.out.println("seven: " + oawlp.get("seven"));
        System.out.println("eight: " + oawlp.get("eight"));
        System.out.println("nine: " + oawlp.get("nine"));
        System.out.println("ten: " + oawlp.get("ten"));
    }
}
