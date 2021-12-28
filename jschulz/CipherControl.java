package jschulz;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Controller für Cipher, behinhaltet auch die Listener
 * 
 * @author Johannes Schulz
 * @version 28-12-2021
 */
public class CipherControl{
	private CipherView cView;
	private CipherFrame cFrame;
	
	public CipherControl() {
		cView = new CipherView();
		cFrame = new CipherFrame("Cipher", cView);
	}
	
    public static void main(String[] args) {
        new CipherControl();
    }
}
