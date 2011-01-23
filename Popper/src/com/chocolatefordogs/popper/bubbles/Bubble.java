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
	
	public static final int HIT_THRESHOLD = 4;
	
	public void addBubbleEventListener(final BubbleEventListener bubbleEventListener) {
		bubbleEventListeners.add(bubbleEventListener);
	}
	
	public int getHitCount() {
		return hitCount;
	}
	
	public boolean isAlive() {
		return (hitCount < HIT_THRESHOLD);
	}

	public void incrementHitCount() {
		hitCount++;
		for (final BubbleEventListener bel : bubbleEventListeners) {
			bel.hitCountChanged(this);
		}
	}
	
	public void destroy() {
		bubbleEventListeners.clear();
	}
	
	private int hitCount;
	
	private final Collection<BubbleEventListener> bubbleEventListeners = new ArrayList<BubbleEventListener>();

}
