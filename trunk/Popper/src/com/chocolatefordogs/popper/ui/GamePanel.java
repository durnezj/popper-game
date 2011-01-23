/**
 * 
 */
package com.chocolatefordogs.popper.ui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JPanel;

import com.chocolatefordogs.popper.grid.BubbleGrid;
import com.chocolatefordogs.popper.grid.ui.BubbleGridDrawer;

/**
 * @author Matthew Cory
 *
 */
public final class GamePanel extends JPanel {

	private static final long serialVersionUID = -2264167437496802723L;

	public GamePanel(final BubbleGrid bubbleGrid) {
		super();
		this.bubbleGrid = bubbleGrid;
	}
	
	@Override
	public Dimension getPreferredSize() {
		if (gridSize == null) {
			final int width = bubbleGrid.getNumCols() * UIConstants.BUBBLE_DIAMETER;
			final int height = bubbleGrid.getNumRows() * UIConstants.BUBBLE_DIAMETER;
			gridSize = new Dimension(width, height);
		}
		return gridSize;
	}

	@Override
	public Dimension getSize() {
		return getPreferredSize();
	}

	@Override
	protected void paintComponent(final Graphics gfx) {
		super.paintComponent(gfx);

		gfx.setColor(Color.BLUE);
		gfx.fillRect(0, 0, 160, 256);
		gridDrawer.drawGrid(bubbleGrid, gfx);
	}
	
	private static final BubbleGridDrawer gridDrawer = new BubbleGridDrawer();
	private BubbleGrid bubbleGrid;
	private Dimension gridSize;
}
