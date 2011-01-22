/**
 * 
 */
package com.chocolatefordogs.popper.bubbles.tests;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.chocolatefordogs.popper.bubbles.Bubble;
import com.chocolatefordogs.popper.bubbles.BubbleEventListener;

/**
 * Unit tests to ensure proper function of Bubble
 * events.
 * 
 * @author Matthew Cory
 *
 */
public class BubbleEventTests {

	@Test
	public void ensureHitCountIncrementResultsInEventTriggered() {
		final Bubble bubble = new Bubble();
		
		final BubbleEventHandler beh = new BubbleEventHandler();
		bubble.addBubbleEventListener(beh);
		
		bubble.incrementHitCount();
		
		assertTrue(beh.isHitCountModified());
	}
	
	private static final class BubbleEventHandler implements BubbleEventListener {

		@Override
		public void hitCountChanged(final Bubble bubble) {
			this.hitCountModified = true;
		}

		public boolean isHitCountModified() {
			return hitCountModified;
		}

		private boolean hitCountModified;
	}
}
