/*    */ package GoldenGoose5;
/*    */ 
/*    */ import java.awt.Color;
/*    */ import java.awt.Dimension;
/*    */ import java.awt.Font;
/*    */ import java.awt.Graphics;
/*    */ import java.awt.event.MouseEvent;
/*    */ import java.awt.event.MouseListener;
/*    */ import javax.swing.JFrame;
/*    */ 
/*    */ public class StartPage5 extends JFrame
/*    */   implements MouseListener
/*    */ {
/* 13 */   static int width = ImageDrawer5.size.width;
/* 14 */   static int height = ImageDrawer5.size.height;
/* 15 */   Font title = new Font("Comic-Sans", 1, 30);
/* 16 */   Font subtitle = new Font("Times", 2, 10);
/*    */ 
/*    */   public StartPage5(String title) {
/* 19 */     super(title);
/* 20 */     setLayout(null);
/* 21 */     addMouseListener(this);
/* 22 */     setBackground(Color.ORANGE);
/* 23 */     setDefaultCloseOperation(3);
/* 24 */     setPreferredSize(ImageDrawer5.size);
/* 25 */     pack();
/* 26 */     setVisible(true);
/*    */   }
/*    */ 
/*    */   public void paint(Graphics g) {
/* 30 */     g.setFont(this.title);
/* 31 */     g.setColor(Color.BLUE);
/* 32 */     g.drawString("WELCOME TO IMAGE-FLIPPER 5.0", (int)(0.3D * width), 100);
/* 33 */     g.setColor(Color.MAGENTA);
/* 34 */     g.setFont(this.subtitle);
/* 35 */     g.drawString("Click Anywhere On The Screen To Begin", (int)(0.435D * width), 400);
/*    */   }
/*    */ 
/*    */   public void mouseClicked(MouseEvent e)
/*    */   {
/*    */   }
/*    */ 
/*    */   public void mouseEntered(MouseEvent e)
/*    */   {
/*    */   }
/*    */ 
/*    */   public void mouseExited(MouseEvent e)
/*    */   {
/*    */   }
/*    */ 
/*    */   public void mousePressed(MouseEvent e)
/*    */   {
/* 59 */     Main5.start();
/*    */   }
/*    */ 
/*    */   public void mouseReleased(MouseEvent e)
/*    */   {
/*    */   }
/*    */ }

/* Location:           /Users/timcoker/Desktop/GoldenGoose.jar
 * Qualified Name:     GoldenGoose5.StartPage5
 * JD-Core Version:    0.6.0
 */