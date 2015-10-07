package playKlondike;

public class BoardView {

	private Board board;

	public BoardView(Board board) {
		this.board = board;
	}

	public void render() {
		IO io = new IO();
		io.writeln("===============================");
		io.writeln("Baraja: " + board.getPack());
		io.writeln("Descarte: ");
		board.getPackOfDiscards().render();
		io.writeln("Palo oros: " + board.getPackOfSuit(0));
		io.writeln("Palo copas: " + board.getPackOfSuit(1));
		io.writeln("Palo espadas: " + board.getPackOfSuit(2));
		io.writeln("Palo bastos: " + board.getPackOfSuit(3));
		io.writeln("Escalera 1: " + board.getPackToWork(6));
		io.writeln("Escalera 2: " + board.getPackToWork(5));
		io.writeln("Escalera 3: " + board.getPackToWork(4));
		io.writeln("Escalera 4: " + board.getPackToWork(3));
		io.writeln("Escalera 5: " + board.getPackToWork(2));
		io.writeln("Escalera 6: " + board.getPackToWork(1));
		io.writeln("Escalera 7: " + board.getPackToWork(0));
		io.writeln("--------------------------------");

	}
}
