package playKlondike;

public class MoveDiscardToPackController extends ColocateController {

	public MoveDiscardToPackController(Board board) {
		super(board);
	}

	public boolean isPosibleMove(PackOfDiscards discard, Pack pack) {
		return (!discard.empty() && pack.empty());
	}

	@Override
	public void recibir(View gameView) {
		gameView.atender(this);

	}

}
