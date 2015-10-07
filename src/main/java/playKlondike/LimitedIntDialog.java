package playKlondike;

public class LimitedIntDialog {

	private String title;

	private ClosedInterval limits;

	public LimitedIntDialog(String title, int min, int max) {
		this.limits = new ClosedInterval(min, max);
		this.title = title + " " + limits + ": ";
	}

	public LimitedIntDialog(String title, int max) {
		this(title, 1, max);
	}

	public int read() {
		IO io = new IO();
		int value;
		boolean ok;
		do {
			value = io.readInt(title);
			ok = limits.includes(value);
			if (!ok) {
				io.writeln("ERROR!!! La opci�n debe ser entre 1 y 9" + limits + " incluidos");
			}
		} while (!ok);
		return value;
	}
}
