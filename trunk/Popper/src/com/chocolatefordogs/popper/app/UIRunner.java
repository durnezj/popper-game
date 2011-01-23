/**
 * 
 */
package com.chocolatefordogs.popper.app;

import com.chocolatefordogs.popper.ui.MainFrame;

/**
 * @author Matthew Cory
 *
 */
public final class UIRunner implements Runnable {

	/* (non-Javadoc)
	 * @see java.lang.Runnable#run()
	 */
	@Override
	public void run() {
		mainFrame = new MainFrame();
		mainFrame.setVisible(true);
	}

	private MainFrame mainFrame;
}
