package playKlondike;

public class Klondike {

	private Board board;

	private StartController startController;

	private ColocateControllerFactory colocateControllerFactory;

	private StartView startView;

	private GameView gameView;

	public Klondike() {
		board = new Board();
		colocateControllerFactory = new ColocateControllerFactory(board);
		gameView = new GameView(colocateControllerFactory);
		startController = new StartController(board, colocateControllerFactory);
		startView = new StartView(startController);
	}

	public void play() {
		startView.render();
		gameView.render();
	}

	public static void main(String[] args) {
		new Klondike().play();
	}
}
