package playKlondike;

public class PackOfSuits extends PackToCheck {

	@Override
	public boolean possibleToPut(PlayingCard card) {
		return playingCardHeap[position].before(card) && card.faceUp();
	}

}
