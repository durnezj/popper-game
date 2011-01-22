/**
 * 
 */
package com.chocolatefordogs.popper.bubbles;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @author Matthew Cory
 *
 */
public final class Bubble {
	
	public void addBubbleEventListener(final BubbleEventListener bubbleEventListener) {
		bubbleEventListeners.add(bubbleEventListener);
	}
	
	private final Collection<BubbleEventListener> bubbleEventListeners = new ArrayList<BubbleEventListener>();

	public void incrementHitCount() {
		for (final BubbleEventListener bel : bubbleEventListeners) {
			bel.hitCountChanged(this);
		}
	}
}
