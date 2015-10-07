package playKlondike;

public class PackToWork extends PackToCheck {

	@Override
	public boolean possibleToPut(PlayingCard card) {
		return card.before(playingCardHeap[position]) && card.faceUp() && playingCardHeap[position].faceUp();
	}

}
