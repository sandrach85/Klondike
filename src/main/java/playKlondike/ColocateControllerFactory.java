package playKlondike;

public class ColocateControllerFactory {

	private Board board;
	private ColocateController[] moveControllers;

	public ColocateControllerFactory(Board board) {
		assert board != null;
		this.board = board;
		moveControllers = new ColocateController[1];
	}

	public void setOption(int option) {
		switch (option) {
		case 1:
			moveControllers[1] = new MovePackToDiscardController(board);
			break;
		case 2:
			moveControllers[2] = new MoveDiscardToPackController(board);
			break;
		case 3:
			moveControllers[3] = new MoveDiscardToSuitController(board);
			break;
		case 4:
			moveControllers[4] = new MoveDiscardToStairController(board);
			break;
		case 5:
			moveControllers[5] = new MoveStairToSuitController(board);
			break;
		case 6:
			moveControllers[6] = new MoveStairToStairController(board);
			break;
		case 7:
			moveControllers[7] = new MoveSuitToStairController(board);
			break;
		case 8:
			moveControllers[8] = new MoveSpinInStairController(board);
			break;
		case 9:
			break;
		}
	}

	public ColocateController getController() {
		if (board.existKlondike()) {
			return null;
		}
		ColocateController colocateController = null;
		if (!board.complete()) {
			colocateController = moveControllers[0];
		}
		return colocateController;
	}

}
