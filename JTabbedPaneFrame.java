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
    super("Rioux Store Simulator");

    //create the tabbed pane/ holds tab formatting
    JTabbedPane tabPane = new JTabbedPane();

    //add first tab
    JLabel label1 = new JLabel ("Welcome to Rioux Mart", SwingConstants.CENTER);
    JPanel panel1 = new JPanel();
    panel1.add(label1);
    tabPane.addTab("Welcome", null, panel1, "FirstPanel");

    //add second tab
    JLabel label2 = new JLabel ("Objective: Please select items to fill out your grocery list", SwingConstants.CENTER);
    JPanel panel2 = new JPanel();
    panel2.add(label2);
    //In case you want to add buttons on the sides=
    //panel2.setLayout(new BorderLayout());
    panel2.add(new JButton("Carrots"), BorderLayout.NORTH);
    panel2.add(new JButton("Lettuce"), BorderLayout.SOUTH);
    panel2.add(new JButton("Cereal"), BorderLayout.WEST);
    panel2.add(new JButton("Steak"), BorderLayout.EAST);
    panel2.add(new JButton("Potato"), BorderLayout.EAST);
    panel2.add(new JButton("Chips"), BorderLayout.SOUTH);
    panel2.add(new JButton("Juice"), BorderLayout.SOUTH);
    panel2.add(new JButton("Bread"), BorderLayout.SOUTH);
    panel2.add(new JButton("Pasta"), BorderLayout.SOUTH);
    panel2.add(new JButton("Eggs"), BorderLayout.SOUTH);
    tabPane.addTab("Select Items", null, panel2, "SecondPanel");

    //add third tab
    JLabel label3 = new JLabel ("Please pay here. (+/-)", SwingConstants.CENTER);
    JPanel panel3 = new JPanel();
    panel3.setLayout(new BorderLayout());
    panel3.add(label3);
    //panel3.add(new JButton("North"), BorderLayout.NORTH);
    panel3.add(new JButton("Pay"), BorderLayout.SOUTH);
    panel3.add(new JButton("Increase"), BorderLayout.WEST);
    panel3.add(new JButton("Decrease"), BorderLayout.EAST);
    tabPane.addTab("Payment", null, panel3, "ThirdPanel");//keep the add below al the tab's formatting

    //keep this at the bottom
    add(tabPane);
  }//end default and only constructor
}//end class