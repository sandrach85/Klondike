package playKlondike;

public class MoveStairToStairView {

	private MoveStairToStairController moveStairToStairController;

	public MoveStairToStairView(Controller controller) {
		this.moveStairToStairController = (MoveStairToStairController) controller;
	}

	public void render() {
		IO io = new IO();
		boolean ok;
		PackToWork[] packToWorkOrigin = new PackToWork[7];
		for (int i = 0; i < 7; i++) {
			packToWorkOrigin[i] = new PackToWork();
		}
		PackToWork[] packToWorkFinal = new PackToWork[7];
		for (int i = 0; i < 7; i++) {
			packToWorkFinal[i] = new PackToWork();
		}
		io.write("¿De qué escalera?");
		int stairIn = io.readInt(null);
		io.write("¿A qué escalera?");
		int stairOut = io.readInt(null);
		ok = moveStairToStairController.isPosibleMove(packToWorkOrigin, packToWorkFinal, stairIn, stairOut);
		if (ok) {
			PlayingCard card = new PlayingCard();
			card = packToWorkOrigin[stairIn].get();
			packToWorkFinal[stairOut].put(card);
			BoardView boardView = new BoardView(null);
			boardView.render();
		} else {
			io.writeln("No es posible relaizar este movimiento");
		}

		if (moveStairToStairController.isGameOver()) {
			io.writeln("Enhorabuena!!!!");
		}
	}

}
