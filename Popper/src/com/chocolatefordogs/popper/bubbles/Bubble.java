/**
 * 
 */
package com.chocolatefordogs.popper.bubbles;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Random;

/**
 * @author Matthew Cory
 *
 */
public final class Bubble {
	
	public static final int HIT_THRESHOLD = 4;
	
	public Bubble() { }
	
	public Bubble(final int initHitCount) {
		this();
		hitCount = initHitCount;
	}
	
	public static Bubble createRandom() {
		final int randHitCount = random.nextInt((HIT_THRESHOLD + 1));
		return new Bubble(randHitCount);
	}
	
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

	private static Random random = new Random();
}
