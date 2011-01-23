/**
 * 
 */
package com.chocolatefordogs.popper.grid;

import java.awt.Dimension;
import java.awt.Point;

import com.chocolatefordogs.popper.bubbles.Bubble;

/**
 * Represents a two-dimensional collection of
 * {@link Bubble} instances.
 * 
 * @author Matthew Cory
 *
 */
public final class BubbleGrid {
	
	public BubbleGrid(final Dimension dimension) {
		this.numCols = dimension.width;
		this.numRows = dimension.height;
		this.bubbles = new Bubble[numCols][numRows];
	}
	
	public static BubbleGrid createRandom(final Dimension dimension) {
		final BubbleGrid res = new BubbleGrid(dimension);
		final int numCols = res.getNumCols();
		final int numRows = res.getNumRows();
		
		final Point gridLoc = new Point();
		for (int col = 0; col < numCols; ++col) {
			gridLoc.x = col;
			for (int row = 0; row < numRows; ++row) {
				gridLoc.y = row;
				final Bubble bubble = Bubble.createRandom();
				res.setBubble(gridLoc, bubble);
			}
		}
		
		return res;
	}
	
	public void setBubble(final Point location, final Bubble bubble) {
		bubbles[location.x][location.y] = bubble;
	}
	
	public Bubble getBubble(final Point location) {
		return bubbles[location.x][location.y];
	}
	
	public int getNumCols() {
		return numCols;
	}

	public int getNumRows() {
		return numRows;
	}

	private final int numCols;
	private final int numRows;
	private final Bubble[][] bubbles;
}
