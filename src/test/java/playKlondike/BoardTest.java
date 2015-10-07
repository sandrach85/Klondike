package playKlondike;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class BoardTest {

	private Board board;
	private PackOfDiscards[] packOfDiscards;
	private PlayingCard card;

	@Before
	public void init() {
		board = new Board();
		packOfDiscards = new PackOfDiscards[4];
		card = new PlayingCard(1, 1, true);
	}

	@Test
	public void testGetPackToWork() {
		assertEquals(board.getPackToWork(0), null);
	}

	@Test
	public void testGetPackOfSuit() {
		assertEquals(board.getPackOfSuit(0), null);
	}

	@Test
	public void testExistKlondike() {
		for (int j = 0; j == 4; j++) {
			packOfDiscards[j].put(card);
		}
		assertTrue(board.existKlondike());
	}

	@Test
	public void testComplete() {
		assertTrue(board.existKlondike());
	}

}
