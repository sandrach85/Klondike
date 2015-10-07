package playKlondike;

public class MoveSpinInStairController extends ColocateController {

	public MoveSpinInStairController(Board board) {
		super(board);
	}

	public boolean isPosibleMove(PackToWork[] packToWork, int stair) {
		return (!packToWork[stair].empty());
	}

	@Override
	public void recibir(View gameView) {
		gameView.atender(this);
	}

}
