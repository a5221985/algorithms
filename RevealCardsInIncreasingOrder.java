import java.util.Arrays;

class RevealCardsInIncreasingOrder {
    public int[] deckRevealedIncreasing(int[] deck) {
        if (deck == null || deck.length == 0)
            return new int [0];
        return _deckRevealedIncreasing(deck);
    }

    int[] _deckRevealedIncreasing(int[] deck) {
        if (deck.length == 1)
            return deck;
        if (deck.length == 2) {
            Arrays.sort(deck);
            return deck;
        }
        int[] shuffledDeck = new int [deck.length];
        int smallestIndex = 0;
        for (int i = 0; i < deck.length; i++) {
            if (deck[smallestIndex] > deck[i]) {
                smallestIndex = i;
            }
        }
        int[] subDeck = new int[deck.length - 1];
        if (smallestIndex > 0)
            System.arraycopy(deck, 0, subDeck, 0, smallestIndex);
        System.arraycopy(deck, smallestIndex + 1, subDeck, smallestIndex, deck.length - smallestIndex - 1);
        int[] shuffledSubDeck = _deckRevealedIncreasing(subDeck);
        shuffledDeck[0] = deck[smallestIndex];
        shuffledDeck[1] = shuffledSubDeck[shuffledSubDeck.length - 1];
        if (shuffledSubDeck.length > 0)
            System.arraycopy(shuffledSubDeck, 0, shuffledDeck, 2, shuffledSubDeck.length - 1);
        return shuffledDeck;
    }

    public void print(int[] cards) {
        if (cards == null)
            return;
        for (int i = 0; i < cards.length; i++)
            System.out.print(cards[i] + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        int[] cards = {17, 13, 11, 2, 3, 5, 7};
        RevealCardsInIncreasingOrder rciio = new RevealCardsInIncreasingOrder();
        rciio.print(cards);
        int[] ordered = rciio.deckRevealedIncreasing(cards);
        rciio.print(ordered);
    }
}
