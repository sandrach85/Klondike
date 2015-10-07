package playKlondike;

public class GameView implements View {

	private ColocateControllerFactory colocateControllerFactory;

	public GameView(ColocateControllerFactory colocateControllerFactory) {
		this.colocateControllerFactory = colocateControllerFactory;
	}

	public void render() {
		ColocateController controller;
		do {
			controller = colocateControllerFactory.getController();
			if (controller != null) {
				controller.recibir(this);
			}
		} while (controller != null);
	}

	@Override
	public void atender(MovePackToDiscardController movePackToDiscardController) {
		new MovePackToDiscardView(movePackToDiscardController).render();
	}

	@Override
	public void atender(MoveDiscardToPackController moveDiscardToPackController) {
		new MoveDiscardToPackView(moveDiscardToPackController).render();
	}

	@Override
	public void atender(MoveDiscardToSuitController moveDiscardToSuitController) {
		new MoveDiscardToSuitView(moveDiscardToSuitController).render();
	}

	@Override
	public void atender(MoveDiscardToStairController moveDiscardToStairController) {
		new MoveDiscardToStairView(moveDiscardToStairController).render();
	}

	@Override
	public void atender(MoveStairToSuitController moveStairToSuitController) {
		new MoveStairToSuitView(moveStairToSuitController).render();
	}

	@Override
	public void atender(MoveStairToStairController moveStairToStairController) {
		new MoveStairToStairView(moveStairToStairController).render();
	}

	@Override
	public void atender(MoveSuitToStairController moveSuitToStairController) {
		new MoveSuitToStairView(moveSuitToStairController).render();
	}

	@Override
	public void atender(MoveSpinInStairController moveSpinInStairController) {
		new MoveSpinInStairView(moveSpinInStairController).render();
	}

}
