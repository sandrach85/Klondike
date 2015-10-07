package playKlondike;

public class MoveSuitToStairView {

	private MoveSuitToStairController moveSuitToStairController;

	public MoveSuitToStairView(Controller controller) {
		this.moveSuitToStairController = (MoveSuitToStairController) controller;
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
		PlayingCard card = new PlayingCard();
		int suit = card.getSuit();
		io.write("¿A qué escalera?");
		int stair = io.readInt(null);
		ok = moveSuitToStairController.isPosibleMove(packOfSuit, packToWork, suit, stair);
		if (ok) {
			card = packOfSuit[suit].get();
			packToWork[stair].put(card);
			BoardView boardView = new BoardView(null);
			boardView.render();
		} else {
			io.writeln("No es posible relaizar este movimiento");
		}
		if (moveSuitToStairController.isGameOver()) {
			io.writeln("Enhorabuena!!!!");
		}

	}
}
