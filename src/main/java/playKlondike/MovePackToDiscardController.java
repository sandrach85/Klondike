package playKlondike;

public class MovePackToDiscardController extends ColocateController {

	protected MovePackToDiscardController(Board board) {
		super(board);
	}

	public boolean isPosibleMove(Pack pack, PackOfDiscards discard) {
		return (!pack.empty());
	}

	@Override
	public void recibir(View gameView) {
		gameView.atender(this);

	}

}
