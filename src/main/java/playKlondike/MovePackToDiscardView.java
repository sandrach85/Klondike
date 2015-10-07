package playKlondike;

public class MovePackToDiscardView {

	private MovePackToDiscardController movePackToDiscardController;

	public MovePackToDiscardView(Controller controller) {
		this.movePackToDiscardController = (MovePackToDiscardController) controller;
	}

	public void render() {
		IO io = new IO();
		boolean ok;
		Pack pack = new Pack();
		PackOfDiscards discard = new PackOfDiscards();
		PlayingCard card = new PlayingCard();
		ok = movePackToDiscardController.isPosibleMove(pack, discard);
		if (ok) {
			card = pack.get();
			discard.put(card);
			BoardView boardView = new BoardView(null);
			boardView.render();
		} else {
			io.writeln("No es posible relaizar este movimiento");
		}
		if (movePackToDiscardController.isGameOver()) {
			io.writeln("Enhorabuena!!!!");
		}

		if (movePackToDiscardController.isGameOver()) {
			io.writeln("Enhorabuena!!!!");
		}
	}
}
