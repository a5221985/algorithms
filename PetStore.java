import java.util.Queue;
import java.util.LinkedList;
import java.util.Map;
import java.util.HashMap;

public class PetStore {
    private enum PetType {
        DOG,
        CAT
    }

    private Map<PetType, String> types = new HashMap<>();
    private Queue<String> queue1 = new LinkedList<>();
    private Queue<String> queue2 = new LinkedList<>();

    public PetStore() {
        types.put(PetType.DOG, "d");
        types.put(PetType.CAT, "c");
    } 

    public boolean add(String animal) {
        return queue1.add(animal);
    }

    public String get() {
        if (!queue2.isEmpty())
            return queue2.remove();
        else if (!queue1.isEmpty())
            return queue1.remove();
        return "";
    }

    public String get(PetType type) {
        if (!queue2.isEmpty()) {
            if (queue2.peek().contains(types.get(type))) {
                return queue2.remove();
            } else if (!queue1.isEmpty()) {
                return removeFromQueue1(type);
            }
        } else {
            if (!queue1.isEmpty()) {
                return removeFromQueue1(type);
            }
        }
        return "";
    }

    String removeFromQueue1(PetType type) {
        if (queue1.peek().contains(types.get(type))) {
            return queue1.remove();
        } else {
            while (!queue1.isEmpty() && !queue1.peek().contains(types.get(type))) {
                queue2.add(queue1.remove());
            }
            if (!queue1.isEmpty())
                return queue1.remove();
        }
        return "";
    }

    public static void main(String[] args) {
        PetStore petStore = new PetStore();

        petStore.add("c1");
        petStore.add("c2");
        petStore.add("d1");
        petStore.add("c3");
        petStore.add("c4");
        petStore.add("c5");
        petStore.add("d2");
        petStore.add("d3");
        petStore.add("d4");
        petStore.add("c6");
        petStore.add("c7");
        petStore.add("c8");

        System.out.println(petStore.get());
        System.out.println(petStore.get(PetType.DOG));
        System.out.println(petStore.get(PetType.DOG));
        System.out.println(petStore.get(PetType.DOG));
        System.out.println(petStore.get(PetType.DOG));
        System.out.println(petStore.get(PetType.DOG));
        System.out.println(petStore.get(PetType.CAT));
        System.out.println(petStore.get(PetType.CAT));
    }
}
