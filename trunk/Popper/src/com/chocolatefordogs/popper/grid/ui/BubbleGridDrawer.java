/**
 * 
 */
package com.chocolatefordogs.popper.grid.ui;

import java.awt.Graphics;
import java.awt.Point;

import com.chocolatefordogs.popper.bubbles.Bubble;
import com.chocolatefordogs.popper.bubbles.ui.BubbleDrawer;
import com.chocolatefordogs.popper.grid.BubbleGrid;
import com.chocolatefordogs.popper.ui.UIConstants;

/**
 * @author Matthew Cory
 *
 */
public final class BubbleGridDrawer {

	public void drawGrid(final BubbleGrid grid, final Graphics gfx) {
		final int numCols = grid.getNumCols();
		final int numRows = grid.getNumRows();
		
		final Point gridLoc = new Point();
		final Point bubbleLoc = new Point();
		for (int col = 0; col < numCols; ++col) {
			gridLoc.x = col;
			bubbleLoc.x = (col * UIConstants.BUBBLE_DIAMETER);
			for (int row = 0; row < numRows; ++row) {
				gridLoc.y = row;
				bubbleLoc.y = (row * UIConstants.BUBBLE_DIAMETER);
				final Bubble bubble = grid.getBubble(gridLoc);
				if (bubble.isAlive()) {
					bubbleDrawer.draw(bubble, bubbleLoc, gfx);
				}
			}
		}
	}

	private static final BubbleDrawer bubbleDrawer = new BubbleDrawer();
}
