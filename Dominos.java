import java.util.List;
import java.util.LinkedList;
import java.util.Iterator;

public class Dominos {
    public void complete(char[] dominos) {
        List<Integer> pending = new LinkedList<>();
        for (int i = 0; i < dominos.length; i++)
            if (dominos[i] == '.')
                pending.add(i);

        int prevSize = 0;
        while (!pending.isEmpty() && prevSize != pending.size()) {
            print(dominos);
            prevSize = pending.size();
            for (Iterator<Integer> iterator = pending.iterator(); iterator.hasNext();) {
                int index = iterator.next();
                if (index > 0 && index < dominos.length - 1) {
                    if (dominos[index - 1] == 'R' && dominos[index] == '.' && dominos[index + 1] == '.' && index < dominos.length - 2 && dominos[index + 2] == 'L') {
                        dominos[index] = 'R';
                        dominos[index + 1] = 'L';
                        iterator.remove();
                        if (iterator.hasNext())
                            iterator.next();
                        iterator.remove();
                    } else if (dominos[index - 1] == 'R' && (dominos[index + 1] == '.' || dominos[index + 1] == 'R')) {
                        dominos[index] = 'R';
                        iterator.remove();
                        if (iterator.hasNext() && index < dominos.length - 2 && dominos[index + 2] != 'L')
                            iterator.next();
                    } else if ((dominos[index - 1] == '.' || dominos[index - 1] == 'L') && dominos[index + 1] == 'L') {
                        dominos[index] = 'L';
                        iterator.remove();
                    } else if (dominos[index - 1] == 'R' && dominos[index + 1] == 'L' || dominos[index - 1] == 'L' && dominos[index + 1] == 'R') {
                        iterator.remove();
                    }
                } else if (index == 0) {
                    if (dominos[index + 1] == 'L') {
                        dominos[index] = 'L';
                        iterator.remove();
                    }
                } else if (index == dominos.length - 1) {
                    if (dominos[index - 1] == 'R') {
                        dominos[index] = 'R';
                        iterator.remove();
                        if (iterator.hasNext())
                            iterator.next();
                    }
                }
            }
        }
    }

    public void print(char[] dominos) {
        for (int i = 0; i < dominos.length; i++) {
            System.out.print(dominos[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        char[] dominos = {'.', 'L', 'R', '.', '.', '.', '.', 'L'};
        //char[] dominos = {'.', '.', 'R', '.', '.', '.', 'L', '.', 'L'};
        //char[] dominos = {'R', '.', '.', '.', '.', '.', '.', '.'};

        Dominos d = new Dominos();
        d.print(dominos);
        System.out.println();

        d.complete(dominos);

        d.print(dominos);
    }
}
