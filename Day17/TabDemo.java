import javax.swing.*;
import java.awt.*;
public class TabDemo {
   public static void main(String args[]) {
      JFrame frame = new JFrame("Menus");
      JTabbedPane tp = new JTabbedPane();
      JPanel panel1;
      JPanel  panel2;
      JPanel  panel3;
      JPanel  panel4;
      
      panel1 = new JPanel();
      panel2 = new JPanel();
      panel3 = new JPanel();
      panel4 = new JPanel();
 
      tp.addTab("File", panel1);
      tp.addTab("Edit", panel2);
      tp.addTab("Terminal", panel3);
      tp.addTab("Help ", panel4);
      frame.add(tp);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setSize(550,350);
      frame.setVisible(true);
   }
}