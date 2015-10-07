package playKlondike;

public abstract class Controller {

	protected Board board;

	protected Controller(Board boardController) {
		assert boardController != null;
		this.board = boardController;
	}

	public Board getBoard() {
		return board;
	}

}
