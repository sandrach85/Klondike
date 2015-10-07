package playKlondike;

public class MoveStairToSuitController extends ColocateController {

	public MoveStairToSuitController(Board board) {
		super(board);
	}

	public boolean isPosibleMove(PackToWork[] packToWork, PackOfSuits[] packOfSuit, int stair, int suit) {
		return (!packToWork[stair].empty() && packToWork[stair].possibleToPut((packOfSuit[suit]).get()));
	}

	@Override
	public void recibir(View gameView) {
		gameView.atender(this);
	}

}
