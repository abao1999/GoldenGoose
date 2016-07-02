/*    */ package GoldenGoose5;
/*    */ 
/*    */ import java.awt.Color;
/*    */ import java.awt.Dimension;
/*    */ import java.awt.GridLayout;
/*    */ import java.awt.Image;
/*    */ import java.awt.Toolkit;
/*    */ import java.awt.event.ActionEvent;
/*    */ import java.awt.event.ActionListener;
/*    */ import java.io.PrintStream;
/*    */ import java.net.URL;
/*    */ import javax.swing.ImageIcon;
/*    */ import javax.swing.JPanel;
/*    */ import javax.swing.JTextArea;
/*    */ 
/*    */ public class ImageDrawer5 extends JPanel
/*    */   implements ActionListener
/*    */ {
/*    */   private static final long serialVersionUID = 1L;
/*    */   static ImageIcon icon;
/*    */   Button5 button1;
/* 14 */   String message = "goose";
/*    */   static int rows;
/*    */   static int columns;
/*    */   static Button5[][] pictures;
/* 18 */   static Dimension size = Toolkit.getDefaultToolkit().getScreenSize();
/*    */   static int rLocation;
/*    */   static int cLocation;
/* 21 */   boolean GameEnded = false;
/*    */   static int count;
/* 24 */   static JTextArea textarea = new JTextArea("0 Clicks");
/*    */ 
/* 26 */   public ImageDrawer5(int r, int c) { super(new GridLayout(r, c, 10, 5));
/* 27 */     setBackground(Color.BLUE);
/* 28 */     rows = r;
/* 29 */     columns = c;
/* 30 */     rLocation = (int)(Math.random() * columns);
/* 31 */     cLocation = (int)(Math.random() * rows);
/* 32 */     pictures = new Button5[r][c];
/* 33 */     icon = createImageIcon("/goose1.jpg", (int)((size.width - 10 * (columns - 1)) * 0.9D / columns), (int)(size.height * 0.7D / rows));
/* 34 */     count = 0;
/* 35 */     textarea.setEditable(false);
/* 36 */     for (int i = 0; i < rows * columns; i++) {
/* 37 */       this.button1 = new Button5(this.message, icon);
/* 38 */       this.button1.response = "poop";
/* 39 */       this.button1.addActionListener(this);
/* 40 */       pictures[(i / c)][(i % c)] = this.button1;
/* 41 */       add(this.button1);
/*    */     }
/*    */   }
/*    */ 
/*    */   protected static ImageIcon createImageIcon(String path, int imageWidth, int imageHeight)
/*    */   {
/* 47 */     URL imgURL = ImageDrawer5.class.getResource(path);
/* 48 */     ImageIcon firsticon = new ImageIcon(imgURL);
/* 49 */     Image image = firsticon.getImage();
/* 50 */     image = image.getScaledInstance(imageWidth, imageHeight, 4);
/* 51 */     ImageIcon secondicon = new ImageIcon(image);
/* 52 */     if (imgURL != null) {
/* 53 */       return secondicon;
/*    */     }
/* 55 */     System.err.println("Couldn't find file: " + path);
/* 56 */     return null;
/*    */   }
/*    */ 
/*    */   protected static String getOrientation(int rowMovement, int colMovement) {
/* 60 */     String rowOrientation = "down";
/* 61 */     String colOrientation = "right";
/* 62 */     if (rowMovement < 0) {
/* 63 */       rowOrientation = "up";
/*    */     }
/* 65 */     if (colMovement < 0) {
/* 66 */       colOrientation = "left";
/*    */     }
/* 68 */     return "The gold moves " + Math.abs(rowMovement) + " blocks " + rowOrientation + " and " + Math.abs(colMovement) + " blocks " + colOrientation + " from previous location";
/*    */   }
/*    */ 
/*    */   public void actionPerformed(ActionEvent a)
/*    */   {
/* 73 */     if (!this.GameEnded) {
/* 74 */       count += 1;
/* 75 */       textarea.setText(count + " Clicks");
/* 76 */       for (int i = 0; i < rows; i++) {
/* 77 */         for (int j = 0; j < columns; j++) {
/* 78 */           pictures[i][j].response = "poop";
/* 79 */           pictures[i][j].setText(this.message);
/* 80 */           pictures[i][j].setForeground(Button5.color);
/*    */         }
/*    */       }
/*    */ 
/* 84 */       int tempx = rLocation;
/* 85 */       int tempy = cLocation;
/* 86 */       pictures[rLocation][cLocation].response = "gold";
/* 87 */       rLocation = (int)(Math.random() * columns);
/* 88 */       cLocation = (int)(Math.random() * rows);
/*    */ 
/* 90 */       if (a.getSource().equals(pictures[tempx][tempy])) {
/* 91 */         setBackground(Color.YELLOW);
/* 92 */         this.GameEnded = true;
/*    */       }
/*    */       else
/*    */       {
/* 96 */         Header5.texta.setText(getOrientation(rLocation - tempx, cLocation - tempy));
/*    */       }
/*    */     }
/*    */   }
/*    */ }

/* Location:           /Users/timcoker/Desktop/GoldenGoose.jar
 * Qualified Name:     GoldenGoose5.ImageDrawer5
 * JD-Core Version:    0.6.0
 */