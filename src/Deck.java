import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
	private List<Card> cardDeck = new ArrayList<Card>();;

	public void initializeCards() {
		String[] color = { "R", "G", "B", "Y" };
		String[] rank = { "1", "2", "3", "4", "5", "6", "7", "8", "9", "0" };

		// Initialize normal cards
		for (String c : color) {
			for (String r : rank) {
				Card temp = new Card(c, r);
				cardDeck.add(temp);
			}
		}

		// Initialize skip cards
		for (String c : color) {
			Card d = new Skip(c);
			cardDeck.add(d);
		}
	}

	public void displayCards() {
		for (Card d : cardDeck) {
			System.out.println(d.getColor() + ", " + d.getSymbol());
		}
	}

	public Card pop() {
		return cardDeck.remove(0);
	}

	public void push(Card c) {
		cardDeck.add(c);
	}

	public void ShuffleCards() {
		Collections.shuffle(cardDeck);
	}

	public Card atIndex(int n) {
		return cardDeck.get(n);
	}

	public int length() {
		return cardDeck.size();
	}

}