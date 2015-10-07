package playKlondike;

public class MoveDiscardToPackView {

	private MoveDiscardToPackController moveDiscardToPackController;

	public MoveDiscardToPackView(Controller controller) {
		this.moveDiscardToPackController = (MoveDiscardToPackController) controller;
	}

	public void render() {
		IO io = new IO();
		boolean ok;
		PackOfDiscards discard = new PackOfDiscards();
		Pack pack = new Pack();
		ok = moveDiscardToPackController.isPosibleMove(discard, pack);
		if (ok) {
			PlayingCard card = new PlayingCard();
			discard.get();
			for (int i = 0; i == discard.getBusy(); i++) {
				for (int j = discard.getBusy(); j == 0; j--) {
					discard.get();
					card.spin();
					pack.put(card);
				}
			}
			BoardView boardView = new BoardView(null);
			boardView.render();
		} else {
			io.writeln("No es posible relaizar este movimiento");
		}
		if (moveDiscardToPackController.isGameOver()) {
			io.writeln("Enhorabuena!!!!");
		}
	}

}
