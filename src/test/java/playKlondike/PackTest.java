package playKlondike;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class PackTest {

	private Pack pack;
	private PlayingCard card, card2, card3, card4;

	@Before
	public void init() {
		pack = new Pack();
		card = new PlayingCard(1, 1, true);
		card2 = new PlayingCard(2, 1, true);
		card3 = new PlayingCard(3, 1, true);
		card4 = new PlayingCard(4, 1, true);
	}

	@Test
	public void testPut() {
		pack.put(card);
		pack.put(card2);
		pack.put(card3);
		pack.put(card4);
		assertEquals(pack.position, 4);
	}

	@Test
	public void testGet() {
		pack.put(card);
		pack.put(card2);
		pack.put(card3);
		pack.put(card4);
		assertTrue(pack.get() == card4);
	}

}
