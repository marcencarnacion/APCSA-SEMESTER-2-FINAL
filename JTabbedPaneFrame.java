import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JTabbedPane;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.JButton;

public class JTabbedPaneFrame extends JFrame
{
  public JTabbedPaneFrame()
  {
    super("JTabbedPaneFrame Demo");

    //create the tabbed pane/ holds tab formatting
    JTabbedPane tabPane = new JTabbedPane();

    //add first tab
    JLabel label1 = new JLabel ("Welcome to Rioux Mart", SwingConstants.CENTER);
    JPanel panel1 = new JPanel();
    panel1.add(label1);
    tabPane.addTab("Tab One", null, panel1, "FirstPanel");

    //add second tab
    JLabel label2 = new JLabel ("Objective: Please select items to fill out your grocery list", SwingConstants.CENTER);
    JPanel panel2 = new JPanel();
    panel2.add(label2);
    tabPane.addTab("Tab Two", null, panel2, "SecondPanel");

    //add third tab
    JLabel label3 = new JLabel ("These are fabulous buttons here", SwingConstants.CENTER);
    JPanel panel3 = new JPanel();
    panel3.setLayout(new BorderLayout());
    panel3.add(label3);
    panel3.add(new JButton("North"), BorderLayout.NORTH);
    panel3.add(new JButton("South"), BorderLayout.SOUTH);
    panel3.add(new JButton("West"), BorderLayout.WEST);
    panel3.add(new JButton("East"), BorderLayout.EAST);
    tabPane.addTab("Tab Three", null, panel3, "ThirdPanel");//keep the add below al the tab's formatting

  


    //keep this at the bottom
    add(tabPane);

  }//end default and only constructor

}//end class