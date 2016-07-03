package GoldenGoose5;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class Main5 extends JFrame {
  private static final long serialVersionUID = 1L;
  static int rowNumber;
  static int colNumber;

  public Main5(String title)  {
    super(title);
    rowNumber = Integer.parseInt(JOptionPane.showInputDialog("How Many Rows Do You Want? (please enter a number equal to or less than 10)"));
    colNumber = Integer.parseInt(JOptionPane.showInputDialog("How Many Columns Do You Want? (please enter a number equal to or less than 10)"));
    setDefaultCloseOperation(3);
    setPreferredSize(ImageDrawer5.size);
    add(new Header5(), "North");
    add(new ImageDrawer5(rowNumber, colNumber));
    MenuCreator();
    pack();
    setVisible(true);
  }

  public static void start() {
    new Main5("Find the Golden Goose");
  }
  public void MenuCreator() {
    JButton button1 = new JButton("Restart");
    button1.setForeground(Color.GRAY);
    button1.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        ImageDrawer5.count = 0;
        ImageDrawer5.textarea.setText("0 clicks");
        Main5.this.getContentPane().remove(1);
        Main5.this.getContentPane().add(new ImageDrawer5(Main5.rowNumber, Main5.colNumber), 1);
        Main5.this.validate();
      }
    });
    JButton button2 = new JButton("New Game");
    button2.setForeground(Color.GRAY);
    button2.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        ImageDrawer5.count = 0;
        ImageDrawer5.textarea.setText("0 clicks");
        Main5.this.getContentPane().remove(1);
        Main5.rowNumber = Integer.parseInt(JOptionPane.showInputDialog("How Many Rows Do You Want? (please enter a number equal to or less than 10)"));
        Main5.colNumber = Integer.parseInt(JOptionPane.showInputDialog("How Many Columns Do You Want? (please enter a number equal to or less than 10)"));
        Main5.this.getContentPane().add(new ImageDrawer5(Main5.rowNumber, Main5.colNumber), 1);
        Main5.this.validate();
      }
    });
    Menu M = new Menu();
    add(M, "South");
    M.add(button1, "South");
    M.add(button2, "South");
    M.add(ImageDrawer5.textarea, "South");
  }
  public static void main(String[] args) {
    new StartPage5("Start Page");
  }
}
