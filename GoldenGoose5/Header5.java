package GoldenGoose5;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class Header5 extends JPanel {
  static JTextArea texta = new JTextArea("Ready Player One");

  public Header5() {
    texta.setBackground(Color.YELLOW);
    texta.setEditable(false);
    setPreferredSize(new Dimension(ImageDrawer5.size.width, 30));
    setBackground(Color.YELLOW);
    add(texta);
  }
}
