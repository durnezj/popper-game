/**
 * 
 */
package com.chocolatefordogs.popper.app;

import javax.swing.SwingUtilities;

/**
 * @author Matthew Cory
 *
 */
public final class GameMain {

	public static void main(final String[] args) {
		final GameMain gm = new GameMain();
		gm.launch();
	}

	public void launch() {
		final UIRunner runner = new UIRunner();
		SwingUtilities.invokeLater(runner);
	}
}
