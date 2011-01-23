/**
 * 
 */
package com.chocolatefordogs.popper.bubbles.ui;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;

import com.chocolatefordogs.popper.bubbles.Bubble;
import com.chocolatefordogs.popper.ui.UIConstants;

/**
 * @author Matthew Cory
 *
 */
public final class BubbleDrawer {
	
	
	
	public void draw(final Bubble bubble, final Point location, final Graphics gfx) {
		if (!bubble.isAlive()) {
			return;
		}
		
		final Color bubbleColor = getColor(bubble);
		gfx.setColor(bubbleColor);
		gfx.fillOval(location.x, location.y, UIConstants.BUBBLE_DIAMETER, UIConstants.BUBBLE_DIAMETER);
	}
	
	private static Color getColor(final Bubble bubble) {
		return BUBBLE_COLORS[bubble.getHitCount()];
	}
	
	private static final Color[] BUBBLE_COLORS = new Color[] {Color.BLUE, Color.YELLOW, Color.GREEN, Color.RED, Color.BLACK};
}
