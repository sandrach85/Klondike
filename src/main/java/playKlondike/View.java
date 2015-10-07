package playKlondike;

public interface View {

	void render();

	void atender(MovePackToDiscardController movePackToDiscardController);

	void atender(MoveDiscardToPackController moveDiscardToPackController);

	void atender(MoveDiscardToSuitController moveDiscardToSuitController);

	void atender(MoveDiscardToStairController moveDiscardToStairController);

	void atender(MoveStairToSuitController moveStairToSuitController);

	void atender(MoveStairToStairController moveStairToStairController);

	void atender(MoveSuitToStairController moveSuitToStairController);

	void atender(MoveSpinInStairController moveSpinInStairController);
}
