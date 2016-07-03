package GoldenGoose5;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JFrame;

public class StartPage5 extends JFrame implements MouseListener {
  static int width = ImageDrawer5.size.width;
  static int height = ImageDrawer5.size.height;
  Font title = new Font("Comic-Sans", 1, 30);
  Font subtitle = new Font("Times", 2, 10);

  public StartPage5(String title) {
    super(title);
    setLayout(null);
    addMouseListener(this);
    setBackground(Color.ORANGE);
    setDefaultCloseOperation(3);
    setPreferredSize(ImageDrawer5.size);
    pack();
    setVisible(true);
  }

  public void paint(Graphics g) {
    g.setFont(this.title);
    g.setColor(Color.BLUE);
    g.drawString("WELCOME TO IMAGE-FLIPPER 5.0", (int)(0.3D * width), 100);
    g.setColor(Color.MAGENTA);
    g.setFont(this.subtitle);
    g.drawString("Click Anywhere On The Screen To Begin", (int)(0.435D * width), 400);
  }

  public void mouseClicked(MouseEvent e)  {}

  public void mouseEntered(MouseEvent e)  {}

  public void mouseExited(MouseEvent e) {}

  public void mousePressed(MouseEvent e)  {
    Main5.start();
  }

  public void mouseReleased(MouseEvent e) {}
}
