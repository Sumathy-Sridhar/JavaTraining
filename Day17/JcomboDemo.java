import javax.swing.JComboBox;
import javax.swing.JFrame;
 
public class JcomboDemo {
 
    JcomboDemo() {
        JFrame frame = new JFrame("JComboBox DEmo");

         String food[]={"Briyani","Shawarma","Noodles","Pasta"};
    JComboBox cb=new JComboBox(food);    
    cb.setBounds(50, 50,90,20);    
    frame.add(cb);        
    frame.setLayout(null);    
    frame.setSize(300,300);    
    frame.setVisible(true);       
    }
 
    public static void main(String[] args) {
        new JcomboDemo();
    }
}