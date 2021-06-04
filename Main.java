import javax.swing.JOptionPane;
import javax.swing.JFrame;
import java.awt.BorderLayout;
import javax.swing.JTabbedPane;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.JButton;

class Main 
{
  public static void main(String[] args) 
  {
    JTabbedPaneFrame tpf = new JTabbedPaneFrame();//tpf = tabbed pane frame
    tpf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    tpf.setSize(450, 400);//this size is up to you 
    tpf.setVisible(true);
    ItemsParent food = new ItemsParent ("potato", 4, true);
    System.out.println(food.toString());

    /*
    JOptionPane.showInputDialog("Enter first intger");
    JOptionPane.showMessageDialog(null, "Hello");
    */
  }
}