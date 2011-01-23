/**
 * 
 */
package com.chocolatefordogs.popper.ui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JPanel;

/**
 * @author Matthew Cory
 *
 */
public final class GamePanel extends JPanel {

	private static final long serialVersionUID = -2264167437496802723L;

	public GamePanel() {
		super();
	}
	
	@Override
	public Dimension getPreferredSize() {
		return new Dimension(160, 256);
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
	}
}
