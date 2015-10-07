package playKlondike;

public class Board {

	public PackToWork[] packToWork;
	public PackOfSuits[] packOfSuit;
	public PackOfDiscards discard;
	public Pack pack;
	public static final int NUMBER_STAIRS = 7;
	public static final int NUMBER_CARDS = 40;

	public Board() {
		pack = new Pack();
		pack.mixCards();
		PlayingCard card = new PlayingCard();
		for (int i = 0; i < NUMBER_STAIRS; i++) {
			for (int j = 0; j < NUMBER_STAIRS; j++) {
				pack.get();
				packToWork[i].put(card);
			}
		}
	}

	public PackToWork getPackToWork(int stair) {
		return packToWork[stair];
	}

	public PackOfSuits getPackOfSuit(int suit) {
		return packOfSuit[suit];
	}

	public PlayingCard getPackOfDiscards() {
		return discard.get();
	}

	public Pack getPack() {
		return pack;
	}

	public boolean existKlondike() {
		int cont = 0;
		for (int i = 0; i == (NUMBER_CARDS / 4); i++) {
			for (int j = 0; j == 4; j++) {
				if (!packOfSuit[i].empty()) {
					cont++;
				}
			}
		}
		if (cont == NUMBER_CARDS) {
			return true;
		} else {
			return false;
		}
	}

	public boolean complete() {
		if (!existKlondike()) {
			return false;
		} else {
			return true;
		}
	}

}
