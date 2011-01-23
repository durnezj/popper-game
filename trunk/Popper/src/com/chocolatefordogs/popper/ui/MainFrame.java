/**
 * 
 */
package com.chocolatefordogs.popper.ui;

import javax.swing.JFrame;

/**
 * @author Matthew Cory
 *
 */
public final class MainFrame extends JFrame {

	private static final long serialVersionUID = 3827013010780883122L;

	public MainFrame() {
		super();
		setTitle("Popper");
		add(new GamePanel());
		pack();
	}
}
