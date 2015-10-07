package playKlondike;

public class MoveDiscardToSuitView {

	private MoveDiscardToSuitController moveDiscardToSuitController;

	public MoveDiscardToSuitView(Controller controller) {
		this.moveDiscardToSuitController = (MoveDiscardToSuitController) controller;
	}

	public void render() {
		IO io = new IO();
		boolean ok;
		PackOfDiscards discard = new PackOfDiscards();
		PackOfSuits[] packOfSuits = new PackOfSuits[7];
		for (int i = 0; i < 7; i++) {
			packOfSuits[i] = new PackOfSuits();
		}
		PlayingCard card = new PlayingCard();
		int suit = card.getSuit();
		ok = moveDiscardToSuitController.isPosibleMove(discard, packOfSuits, suit);
		if (ok) {
			card = discard.get();
			packOfSuits[suit].put(card);
			BoardView boardView = new BoardView(null);
			boardView.render();
		} else {
			io.writeln("No es posible relaizar este movimiento");
		}
		if (moveDiscardToSuitController.isGameOver()) {
			io.writeln("Enhorabuena!!!!");
		}

	}
}
