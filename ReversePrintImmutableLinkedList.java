import java.util.Arrays;
import java.util.List;

public class ReversePrintImmutableLinkedList<T> {
    public <T> void reversePrint(List<T> list) {
        if (list.isEmpty())
            return;
        reversePrint(list.subList(1, list.size()));
        System.out.println(list.get(0));
    }

    public static void main(String[] args) {
        ReversePrintImmutableLinkedList<Integer> rpil = new ReversePrintImmutableLinkedList<>();
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        rpil.reversePrint(list);
    }
}
