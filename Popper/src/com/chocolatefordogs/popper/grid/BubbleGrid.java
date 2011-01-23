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
