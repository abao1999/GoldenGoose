/*    */ package GoldenGoose5;
/*    */ 
/*    */ import java.awt.Color;
/*    */ import java.awt.Container;
/*    */ import java.awt.event.ActionEvent;
/*    */ import java.awt.event.ActionListener;
/*    */ import javax.swing.JButton;
/*    */ import javax.swing.JFrame;
/*    */ import javax.swing.JOptionPane;
/*    */ import javax.swing.JTextArea;
/*    */ 
/*    */ public class Main5 extends JFrame
/*    */ {
/*    */   private static final long serialVersionUID = 1L;
/*    */   static int rowNumber;
/*    */   static int colNumber;
/*    */ 
/*    */   public Main5(String title)
/*    */   {
/* 19 */     super(title);
/* 20 */     rowNumber = Integer.parseInt(JOptionPane.showInputDialog("How Many Rows Do You Want? (please enter a number equal to or less than 10)"));
/* 21 */     colNumber = Integer.parseInt(JOptionPane.showInputDialog("How Many Columns Do You Want? (please enter a number equal to or less than 10)"));
/* 22 */     setDefaultCloseOperation(3);
/* 23 */     setPreferredSize(ImageDrawer5.size);
/* 24 */     add(new Header5(), "North");
/* 25 */     add(new ImageDrawer5(rowNumber, colNumber));
/* 26 */     MenuCreator();
/* 27 */     pack();
/* 28 */     setVisible(true);
/*    */   }
/*    */ 
/*    */   public static void start() {
/* 32 */     new Main5("Find the Golden Goose");
/*    */   }
/*    */   public void MenuCreator() {
/* 35 */     JButton button1 = new JButton("Restart");
/* 36 */     button1.setForeground(Color.GRAY);
/* 37 */     button1.addActionListener(new ActionListener() {
/*    */       public void actionPerformed(ActionEvent e) {
/* 39 */         ImageDrawer5.count = 0;
/* 40 */         ImageDrawer5.textarea.setText("0 clicks");
/* 41 */         Main5.this.getContentPane().remove(1);
/* 42 */         Main5.this.getContentPane().add(new ImageDrawer5(Main5.rowNumber, Main5.colNumber), 1);
/* 43 */         Main5.this.validate();
/*    */       }
/*    */     });
/* 46 */     JButton button2 = new JButton("New Game");
/* 47 */     button2.setForeground(Color.GRAY);
/* 48 */     button2.addActionListener(new ActionListener() {
/*    */       public void actionPerformed(ActionEvent e) {
/* 50 */         ImageDrawer5.count = 0;
/* 51 */         ImageDrawer5.textarea.setText("0 clicks");
/* 52 */         Main5.this.getContentPane().remove(1);
/* 53 */         Main5.rowNumber = Integer.parseInt(JOptionPane.showInputDialog("How Many Rows Do You Want? (please enter a number equal to or less than 10)"));
/* 54 */         Main5.colNumber = Integer.parseInt(JOptionPane.showInputDialog("How Many Columns Do You Want? (please enter a number equal to or less than 10)"));
/* 55 */         Main5.this.getContentPane().add(new ImageDrawer5(Main5.rowNumber, Main5.colNumber), 1);
/* 56 */         Main5.this.validate();
/*    */       }
/*    */     });
/* 60 */     Menu M = new Menu();
/* 61 */     add(M, "South");
/* 62 */     M.add(button1, "South");
/* 63 */     M.add(button2, "South");
/* 64 */     M.add(ImageDrawer5.textarea, "South");
/*    */   }
/*    */   public static void main(String[] args) {
/* 67 */     new StartPage5("Start Page");
/*    */   }
/*    */ }

/* Location:           /Users/timcoker/Desktop/GoldenGoose.jar
 * Qualified Name:     GoldenGoose5.Main5
 * JD-Core Version:    0.6.0
 */