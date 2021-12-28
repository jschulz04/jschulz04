package jschulz;

import java.awt.*;
import javax.swing.*;

public class CipherView extends JPanel {
    private JButton cButton;
    private JPanel menu, cipher; 
    private JLabel kLabel, iLabel, oLabel;
    private JTextField key, input, output;
    private String[] Ciphers  = { "Shift Cipher",
                         "Substitution Cipher"};
    private JRadioButton encrypt, decrypt;
    private ButtonGroup bGroup = new ButtonGroup();

    public CipherView() {
        setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));
        menu = new JPanel(new FlowLayout());
        menu.add(new JComboBox(Ciphers));
        menu.setBorder(BorderFactory.createTitledBorder("Select Cipher"));
        encrypt = new JRadioButton("Encrypt");
        decrypt = new JRadioButton("Decrypt");
        bGroup.add(encrypt);
        bGroup.add(decrypt);
        menu.add(encrypt);
        menu.add(decrypt);
        add(menu);
    
        kLabel = new JLabel("Shift Value or Alphabet:");
        key = new JTextField();
        iLabel = new JLabel("Text or Key Input:");
        input = new JTextField();
        oLabel = new JLabel("Output:");
        output = new JTextField();

        cipher = new JPanel(new GridLayout(3,2));        
        cipher.add(kLabel);
        cipher.add(key);
        cipher.add(iLabel);
        cipher.add(input);
        cipher.add(oLabel);
        cipher.add(output);
        cipher.setBorder(BorderFactory.createTitledBorder("Input and Output"));
        add(cipher);
        cButton = new JButton("Cipher");
        cButton.setAlignmentX(Component.CENTER_ALIGNMENT);
        add(cButton);
    }
}
