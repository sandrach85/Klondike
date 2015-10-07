package playKlondike;

public class MoveSpinInStairView {
	private MoveSpinInStairController moveSpinInStairController;

	public MoveSpinInStairView(Controller controller) {
		this.moveSpinInStairController = (MoveSpinInStairController) controller;
	}

	public void render() {
		IO io = new IO();
		boolean ok;
		PackToWork[] packToWork = new PackToWork[7];
		for (int i = 0; i < 7; i++) {
			packToWork[i] = new PackToWork();
		}
		PlayingCard card = new PlayingCard();
		int stair;
		io.write("¿Qué escalera?");
		stair = io.readInt(null);
		ok = moveSpinInStairController.isPosibleMove(packToWork, stair);
		if (ok) {
			card = packToWork[stair].get();
			card.spin();
			BoardView boardView = new BoardView(null);
			boardView.render();
		} else {
			io.writeln("No es posible relaizar este movimiento");
		}
		if (moveSpinInStairController.isGameOver()) {
			io.writeln("Enhorabuena!!!!");
		}

		if (moveSpinInStairController.isGameOver()) {
			io.writeln("Enhorabuena!!!!");
		}
	}

}
