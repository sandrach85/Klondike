package playKlondike;

public class PackOfDiscards {
	public PlayingCard[] packOfDiscards;
	public int busy;

	public PackOfDiscards() {
		this.packOfDiscards = null;
		busy = 0;
	}

	public boolean empty() {
		return (busy == 0);
	}

	public PlayingCard get() {
		PlayingCard card = packOfDiscards[busy];
		busy = busy - 1;
		return card;
	}

	public void put(PlayingCard card) {
		busy = busy + 1;
		packOfDiscards[busy] = card;
	}

	public int getBusy() {
		return busy;
	}
}
