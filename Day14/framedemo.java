import java.awt.*;

public class framedemo{
public static void main(String[] args){
Frame frm = new Frame("AWT Frame!");
Label lbl = new Label("Hi Sumathy!!.",Label.CENTER);
frm.add(lbl);
frm.setSize(400,400);
frm.setVisible(true);

  }
}