package GoldenGoose5;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.PrintStream;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class ImageDrawer5 extends JPanel implements ActionListener  {
  private static final long serialVersionUID = 1L;
  static ImageIcon icon;
  Button5 button1;
  String message = "goose";
  static int rows;
  static int columns;
  static Button5[][] pictures;
  static Dimension size = Toolkit.getDefaultToolkit().getScreenSize();
  static int rLocation;
  static int cLocation;
  boolean GameEnded = false;
  static int count;
  static JTextArea textarea = new JTextArea("0 Clicks");

  public ImageDrawer5(int r, int c) {
    super(new GridLayout(r, c, 10, 5));
    setBackground(Color.BLUE);
    rows = r;
    columns = c;
    rLocation = (int)(Math.random() * columns);
    cLocation = (int)(Math.random() * rows);
    pictures = new Button5[r][c];
    icon = createImageIcon("/goose1.jpg", (int)((size.width - 10 * (columns - 1)) * 0.9D / columns), (int)(size.height * 0.7D / rows));
    count = 0;
    textarea.setEditable(false);
    for (int i = 0; i < rows * columns; i++) {
      this.button1 = new Button5(this.message, icon);
      this.button1.response = "poop";
      this.button1.addActionListener(this);
      pictures[(i / c)][(i % c)] = this.button1;
      add(this.button1);
    }
  }

  protected static ImageIcon createImageIcon(String path, int imageWidth, int imageHeight)  {
    URL imgURL = ImageDrawer5.class.getResource(path);
    ImageIcon firsticon = new ImageIcon(imgURL);
    Image image = firsticon.getImage();
    image = image.getScaledInstance(imageWidth, imageHeight, 4);
    ImageIcon secondicon = new ImageIcon(image);
    if (imgURL != null) {
      return secondicon;
    }
    System.err.println("Couldn't find file: " + path);
    return null;
  }

  protected static String getOrientation(int rowMovement, int colMovement) {
    String rowOrientation = "down";
    String colOrientation = "right";
    if (rowMovement < 0) {
      rowOrientation = "up";
    }
    if (colMovement < 0) {
      colOrientation = "left";
    }
    return "The gold moves " + Math.abs(rowMovement) + " blocks " + rowOrientation + " and " + Math.abs(colMovement) + " blocks " + colOrientation + " from previous location";
  }

  public void actionPerformed(ActionEvent a)  {
    if (!this.GameEnded) {
      count += 1;
      textarea.setText(count + " Clicks");
      for (int i = 0; i < rows; i++) {
        for (int j = 0; j < columns; j++) {
          pictures[i][j].response = "poop";
          pictures[i][j].setText(this.message);
          pictures[i][j].setForeground(Button5.color);
        }
      }

      int tempx = rLocation;
      int tempy = cLocation;
      pictures[rLocation][cLocation].response = "gold";
      rLocation = (int)(Math.random() * columns);
      cLocation = (int)(Math.random() * rows);

      if (a.getSource().equals(pictures[tempx][tempy])) {
        setBackground(Color.YELLOW);
        this.GameEnded = true;
      }
      else
      {
        Header5.texta.setText(getOrientation(rLocation - tempx, cLocation - tempy));
      }
    }
  }
}
