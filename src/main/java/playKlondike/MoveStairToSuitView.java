package playKlondike;

public class MoveStairToSuitView {

	private MoveStairToSuitController moveStairToSuitController;

	public MoveStairToSuitView(Controller controller) {
		this.moveStairToSuitController = (MoveStairToSuitController) controller;
	}

	public void render() {
		IO io = new IO();
		boolean ok;
		PackToWork[] packToWork = new PackToWork[7];
		for (int i = 0; i < 7; i++) {
			packToWork[i] = new PackToWork();
		}
		PackOfSuits[] packOfSuit = new PackOfSuits[7];
		for (int i = 0; i < 7; i++) {
			packOfSuit[i] = new PackOfSuits();
		}
		io.write("¿De qué escalera?");
		int stair = io.readInt(null);
		PlayingCard card = new PlayingCard();
		int suit = card.getSuit();
		ok = moveStairToSuitController.isPosibleMove(packToWork, packOfSuit, stair, suit);
		if (ok) {
			card = packToWork[stair].get();
			packOfSuit[suit].put(card);
			BoardView boardView = new BoardView(null);
			boardView.render();
		} else {
			io.writeln("No es posible relaizar este movimiento");
		}

		if (moveStairToSuitController.isGameOver()) {
			io.writeln("Enhorabuena!!!!");
		}
	}

}
