import java.awt.BorderLayout;
import javax.swing.*;
import java.util.Scanner;
import java.util.ArrayList;
class Main 
{
  public static void main(String[] args) 
  {
    ArrayList<String> GroceryList = new ArrayList<>();
    Scanner scan = new Scanner(System.in);

    System.out.println("\n---Rioux Store---");
    System.out.println("Objective: Get potatoes, eggs, chips, lettuce, and cereal");
    ItemsParent potato = new ItemsParent ("potato", 4, true);
    System.out.println("What item would you like to buy?");
    GroceryList.add(scan.nextLine());
    System.out.println("Next item:");
    GroceryList.add(scan.nextLine());
    System.out.println("Next item:");
    GroceryList.add(scan.nextLine());
    System.out.println("Next item:");
    GroceryList.add(scan.nextLine());
    System.out.println("Next item");
    GroceryList.add(scan.nextLine());
    System.out.println("\nYour current grocery list is: ");
    for (int i = 0; i < GroceryList.size(); i++)
    {
      System.out.println(GroceryList.get(i));
    }
    System.out.println("Would you like to proceed to checkout?");
    if (scan.nextLine().equals("yes"))
    {
      System.out.println("Alright, proceeding to checkout.");
    }
    else 
    {
      System.out.println("Too bad, you're going to chekout anyways");
    }

    /*
    if (scan.nextLine().equals("potatoes"))
    {
      System.out.println(potato.toString());
    }
    */











    
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