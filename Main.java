import java.awt.BorderLayout;
import javax.swing.*;

class Main 
{
  public static void main(String[] args) 
  {
    ItemsParent food = new ItemsParent ("potato", 4, true);
    System.out.println(food.toString());
    /*
    JTabbedPaneFrame tpf = new JTabbedPaneFrame();//tpf = tabbed pane frame
    tpf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    tpf.setSize(450, 400);//this size is up to you 
    tpf.setVisible(true);
    JOptionPane.showInputDialog("Enter first intger");
    JOptionPane.showMessageDialog(null, "Hello");
    */
  }
}