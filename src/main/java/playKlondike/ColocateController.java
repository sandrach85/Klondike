package playKlondike;

public abstract class ColocateController extends Controller {

	public ColocateController(Board board) {
		super(board);
	}

	public boolean isGameOver() {
		return board.existKlondike();
	}

	public abstract void recibir(View gameView);
}
