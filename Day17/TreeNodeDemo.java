import javax.swing.*;  
import javax.swing.tree.DefaultMutableTreeNode;  
public class TreeNodeDemo {  
JFrame f;  
TreeNodeDemo(){  
    f=new JFrame();   
    DefaultMutableTreeNode style=new DefaultMutableTreeNode("Food");  
    DefaultMutableTreeNode color=new DefaultMutableTreeNode("Type");  
    DefaultMutableTreeNode font=new DefaultMutableTreeNode("Restaurants");  
    style.add(color);  
    style.add(font);  
    DefaultMutableTreeNode red=new DefaultMutableTreeNode("Briyani");  
    DefaultMutableTreeNode blue=new DefaultMutableTreeNode("Shawarma");  
    DefaultMutableTreeNode green=new DefaultMutableTreeNode("Burger");  
    color.add(red); color.add(blue);  color.add(green);
    DefaultMutableTreeNode res1=new DefaultMutableTreeNode("Yaa Mohideen");  
    DefaultMutableTreeNode res2=new DefaultMutableTreeNode("Shawarma Inn"); 
    DefaultMutableTreeNode res3=new DefaultMutableTreeNode("Arabian Nights");  
    DefaultMutableTreeNode res4=new DefaultMutableTreeNode("Burger House");  
    font.add(res1); font.add(res2); font.add(res3); font.add(res4);
    JTree jt=new JTree(style);  
    f.add(jt);  
    f.setSize(200,200);  
    f.setVisible(true);  
}  
public static void main(String[] args) {  
    new TreeNodeDemo();  
}}