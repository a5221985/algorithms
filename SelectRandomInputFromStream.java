import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SelectRandomInputFromStream {
    public String getRandomCreatureName(List<String> creatureNames, double probability) {
        if (creatureNames == null || creatureNames.isEmpty())
            return "";
        int elementIndex = (int) (probability * creatureNames.size());
        return creatureNames.stream().reduce(0, (counter, creatureName) -> counter + 1).filter(counter -> counter == elementIndex).collect(Collectors.toList()).get(0); 
    }

    public static void main(String[] args) {
        SelectRandomInputFromStream srifs = new SelectRandomInputFromStream();
        List<String> creatureNames = Arrays.asList("ape", "baboon", "cat", "dog", "elephant", "frog", "goat", "hare", "iguana", "jackal", "kangaroo", "lion", "monkey", "nilgai", "owl", "parrot", "qail", "rino", "squirrel", "tiger", "urchin", "vulture", "walrus", "xerus", "yak", "zebra");
        System.out.println(srifs.getRandomCreatureName(creatureNames, Math.random())); 
    }
}
