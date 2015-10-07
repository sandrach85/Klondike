package playKlondike;

public class MoveStairToStairController extends ColocateController {

	public MoveStairToStairController(Board board) {
		super(board);
	}

	public boolean isPosibleMove(PackToWork[] packToWorkOrigin, PackToWork[] packToWorkFinal, int origin, int fin) {
		return (!packToWorkOrigin[origin].empty() && !packToWorkFinal[fin].empty() && packToWorkOrigin[origin]
				.possibleToPut((packToWorkFinal[fin]).get()));
	}

	@Override
	public void recibir(View gameView) {
		gameView.atender(this);
	}

}
