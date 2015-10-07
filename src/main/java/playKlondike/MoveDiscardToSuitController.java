package playKlondike;

public class MoveDiscardToSuitController extends ColocateController {

	public MoveDiscardToSuitController(Board board) {
		super(board);
	}

	public boolean isPosibleMove(PackOfDiscards discard, PackOfSuits[] packOfSuit, int stair) {
		return (!discard.empty() && packOfSuit[stair].possibleToPut(discard.get()));
	}

	@Override
	public void recibir(View gameView) {
		gameView.atender(this);

	}

}
