package playKlondike;

public class StartController extends Controller {

	ColocateControllerFactory colocateControllerFactory;

	public StartController(Board board, ColocateControllerFactory colocateControllerFactory) {
		super(board);
		this.colocateControllerFactory = colocateControllerFactory;
	}

	public void control(int option) {
		colocateControllerFactory.setOption(option);
	}

}
