package GoldenGoose5;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class Button5 extends JButton implements ActionListener  {
  String text;
  ImageIcon image;
  String response;
  Font font = new Font("Verdana", 1, 15);
  static Color color = new Color(102, 204, 255);

  public Button5(String txt, ImageIcon imgicon) {
    super(txt, imgicon);
    setVerticalTextPosition(0);
    setHorizontalTextPosition(0);
    this.text = txt;
    this.image = imgicon;
    this.response = "";
    setFont(this.font);
    setForeground(color);
    addActionListener(this);
  }

  public void actionPerformed(ActionEvent a)  {
    if (this.response == "poop")
      setForeground(new Color(153, 51, 0));
    else {
      setForeground(Color.ORANGE);
    }
    setText(this.response);
  }
}
