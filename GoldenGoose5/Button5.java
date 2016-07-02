/*    */ package GoldenGoose5;
/*    */ 
/*    */ import java.awt.Color;
/*    */ import java.awt.Font;
/*    */ import java.awt.event.ActionEvent;
/*    */ import java.awt.event.ActionListener;
/*    */ import javax.swing.ImageIcon;
/*    */ import javax.swing.JButton;
/*    */ 
/*    */ public class Button5 extends JButton
/*    */   implements ActionListener
/*    */ {
/*    */   String text;
/*    */   ImageIcon image;
/*    */   String response;
/* 17 */   Font font = new Font("Verdana", 1, 15);
/* 18 */   static Color color = new Color(102, 204, 255);
/*    */ 
/*    */   public Button5(String txt, ImageIcon imgicon) {
/* 21 */     super(txt, imgicon);
/* 22 */     setVerticalTextPosition(0);
/* 23 */     setHorizontalTextPosition(0);
/* 24 */     this.text = txt;
/* 25 */     this.image = imgicon;
/* 26 */     this.response = "";
/* 27 */     setFont(this.font);
/* 28 */     setForeground(color);
/* 29 */     addActionListener(this);
/*    */   }
/*    */ 
/*    */   public void actionPerformed(ActionEvent a)
/*    */   {
/* 34 */     if (this.response == "poop")
/* 35 */       setForeground(new Color(153, 51, 0));
/*    */     else {
/* 37 */       setForeground(Color.ORANGE);
/*    */     }
/* 39 */     setText(this.response);
/*    */   }
/*    */ }

/* Location:           /Users/timcoker/Desktop/GoldenGoose.jar
 * Qualified Name:     GoldenGoose5.Button5
 * JD-Core Version:    0.6.0
 */