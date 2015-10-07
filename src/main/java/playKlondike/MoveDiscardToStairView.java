package playKlondike;

public class MoveDiscardToStairView {

	private MoveDiscardToStairController moveDiscardToStairController;

	public MoveDiscardToStairView(Controller controller) {
		this.moveDiscardToStairController = (MoveDiscardToStairController) controller;
	}

	public void render() {
		IO io = new IO();
		boolean ok;
		int stair;
		PackOfDiscards discard = new PackOfDiscards();
		PackToWork[] packToWork = new PackToWork[7];
		for (int i = 0; i < 7; i++) {
			packToWork[i] = new PackToWork();
		}
		io.write("¿A qué escalera?");
		stair = io.readInt(null);
		ok = moveDiscardToStairController.isPosibleMove(discard, packToWork, stair);
		if (ok) {
			PlayingCard card = new PlayingCard();
			card = discard.get();
			packToWork[stair].put(card);
			BoardView boardView = new BoardView(null);
			boardView.render();
		} else {
			io.writeln("No es posible relaizar este movimiento");
		}
		if (moveDiscardToStairController.isGameOver()) {
			io.writeln("Enhorabuena!!!!");
		}
	}

}
