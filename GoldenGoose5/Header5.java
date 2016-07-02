/*    */ package GoldenGoose5;
/*    */ 
/*    */ import java.awt.Color;
/*    */ import java.awt.Dimension;
/*    */ import javax.swing.JPanel;
/*    */ import javax.swing.JTextArea;
/*    */ 
/*    */ public class Header5 extends JPanel
/*    */ {
/* 11 */   static JTextArea texta = new JTextArea("Ready Player One");
/*    */ 
/*    */   public Header5() {
/* 14 */     texta.setBackground(Color.YELLOW);
/* 15 */     texta.setEditable(false);
/* 16 */     setPreferredSize(new Dimension(ImageDrawer5.size.width, 30));
/* 17 */     setBackground(Color.YELLOW);
/* 18 */     add(texta);
/*    */   }
/*    */ }

/* Location:           /Users/timcoker/Desktop/GoldenGoose.jar
 * Qualified Name:     GoldenGoose5.Header5
 * JD-Core Version:    0.6.0
 */