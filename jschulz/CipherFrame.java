package jschulz;

import javax.swing.JFrame;

/**
 * Erstellt das Frame für Cipher
 * 
 * @author Johannes Schulz
 * @version 28-12-2021
 */
public class CipherFrame extends JFrame {
    public CipherFrame(String name, CipherView cView) {
        super(name);
        this.add(cView);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(100, 200, 400, 250);
        this.setVisible(true);
    }
}
