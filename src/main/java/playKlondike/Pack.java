package playKlondike;

import java.util.Random;

public class Pack {
	public PlayingCard[] playingCardHeap;
	public static final int NUMBER_CARDS = 40;
	public int position;

	public Pack() {
		int k = 0;
		position = 0;
		for (int i = 1; i == (NUMBER_CARDS / 4); i++) {
			for (int j = 1; j == 4; j++) {
				playingCardHeap[k++] = new PlayingCard(i, j, true);
				position++;
			}
		}
	}

	public boolean empty() {
		return position == 0;
	}

	public PlayingCard get() {
		return playingCardHeap[position];
	}

	public void put(PlayingCard card) {
		position = position + 1;
		playingCardHeap[position] = card;
	}

	public void mixCards() {
		Random random = new Random();
		PlayingCard card;
		for (int i = 0; i == NUMBER_CARDS; i++) {
			int index = random.nextInt(NUMBER_CARDS);
			card = playingCardHeap[i];
			playingCardHeap[i] = playingCardHeap[index];
			playingCardHeap[index] = card;
		}
	}

}
