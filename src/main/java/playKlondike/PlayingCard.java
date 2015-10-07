package playKlondike;

public class PlayingCard {
	public int number;
	public int suit;
	public boolean visibility;

	public PlayingCard() {
		this.number = 0;
		this.suit = 0;
		this.visibility = true;
	}

	public PlayingCard(int number, int suit, boolean visibility) {
		this.number = number;
		this.suit = suit;
		this.visibility = visibility;
	}

	public int getNumber() {
		return number;
	}

	public int getSuit() {
		return suit;
	}

	public boolean equalSuit(PlayingCard card) {
		return (suit == card.getSuit());
	}

	public boolean before(PlayingCard card) {
		return number + 1 == card.getNumber();
	}

	public boolean faceUp() {
		return visibility;
	}

	public void spin() {
		visibility = !visibility;
	}

	public void render() {
		IO io = new IO();
		io.writeln("(" + number + " , " + suit + ")");
	}

}
