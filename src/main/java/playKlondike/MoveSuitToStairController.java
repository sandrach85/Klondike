package playKlondike;

public class MoveSuitToStairController extends ColocateController {

	public MoveSuitToStairController(Board board) {
		super(board);
	}

	public boolean isPosibleMove(PackOfSuits[] packOfSuit, PackToWork[] packToWork, int suit, int stair) {
		return (!packOfSuit[suit].empty() && packToWork[stair].possibleToPut((packOfSuit[suit]).get()));
	}

	@Override
	public void recibir(View gameView) {
		gameView.atender(this);
	}

}
