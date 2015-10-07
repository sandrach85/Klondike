package playKlondike;

public class MoveDiscardToStairController extends ColocateController {

	public MoveDiscardToStairController(Board board) {
		super(board);
	}

	public boolean isPosibleMove(PackOfDiscards discard, PackToWork[] packToWork, int stair) {
		return (!discard.empty() && packToWork[stair].possibleToPut(discard.get()));
	}

	@Override
	public void recibir(View gameView) {
		gameView.atender(this);

	}

}
