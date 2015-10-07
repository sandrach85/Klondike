package playKlondike;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class PlayingCardTest {

	private PlayingCard card, card2;

	@Before
	public void init() {
		card = new PlayingCard(2, 2, true);
		card2 = new PlayingCard(4, 2, false);
	}

	@Test
	public void testGetNumber() {
		assertEquals(card.getNumber(), 2);
	}

	@Test
	public void testGetSuit() {
		assertEquals(card.getSuit(), 2);
	}

	@Test
	public void testEqualSuit() {
		assertEquals(card.getSuit(), card2.getSuit());
	}

	@Test
	public void testFaceUp() {
		assertEquals(card.faceUp(), true);
		assertEquals(card2.faceUp(), false);
	}

	@Test
	public void testSpin() {
		card.spin();
		assertEquals(card.visibility, false);
	}

}
