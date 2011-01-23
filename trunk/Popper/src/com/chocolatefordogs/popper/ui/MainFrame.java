/**
 * 
 */
package com.chocolatefordogs.popper.ui;

import java.awt.Dimension;

import javax.swing.JFrame;

import com.chocolatefordogs.popper.grid.BubbleGrid;

/**
 * @author Matthew Cory
 *
 */
public final class MainFrame extends JFrame {

	private static final long serialVersionUID = 3827013010780883122L;

	public MainFrame() {
		super();
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setTitle("Popper");
		bubbleGrid = BubbleGrid.createRandom(new Dimension(5, 8));
		gamePanel = new GamePanel(bubbleGrid);
		add(gamePanel);
		pack();
	}
	
	private BubbleGrid bubbleGrid;
	private final GamePanel gamePanel;
}
