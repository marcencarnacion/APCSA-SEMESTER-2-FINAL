import java.awt.BorderLayout;
import javax.swing.*;
import java.util.Scanner;
import java.util.ArrayList;
class Main 
{
  public static void main(String[] args) 
  {
    //Instantiating objects: GroceryList, Scanner, Potato, Cereal, Chips
    ArrayList<String> GroceryList = new ArrayList<>();
    Scanner scan = new Scanner(System.in);
    ItemsParent potato = new Potatoes ("potato", 1, true, "vegetable", "Idaho");
    ItemsParent cereal = new Cereal("Froot Loops", 4, true, "Kellogs", "crunchy");
    ItemsParent chips = new Chips("Doritos", 3, true, "crispy", 150);
    Store riouxStore = new Store("Rioux Store", "Marc Encarnacion", 8, 10, 2021);

    //Est up the key infomation (name of store and objective)
    System.out.println("\n" + riouxStore.toString());
    System.out.println("\n---Rioux Store Simulator---");
    System.out.println("Objective: Get potatoes, chips, and cereal");

    //Asking user what they would like to buy
    //Uses ArrayList and .add method
    System.out.println("What item would you like to buy?");
    GroceryList.add(scan.nextLine());
    System.out.println("Next item:");
    GroceryList.add(scan.nextLine());
    System.out.println("Next item:");
    GroceryList.add(scan.nextLine());

    //Printing out the grcoery list using for loop
    System.out.println("\nYour current grocery list is: ");
    for (int i = 0; i < GroceryList.size(); i++)
    {
      System.out.println(GroceryList.get(i));
    }
    //Printing out the information of each item
    System.out.println("\nHere is information on your selection:");
    ItemsParent[] items = {potato, cereal, chips};
    //Using a for each loop to print out the information
    for(ItemsParent food : items)
    {
      System.out.println(food.toString());
      System.out.println();
    }

    //If-Else Statement: Asking user to checkout
    System.out.println("Would you like to proceed to checkout?");
    if (scan.nextLine().equals("yes"))
    {
      System.out.println("Alright, proceeding to checkout.");
    }
    else 
      System.out.println("Too bad, you're going to chekout anyways");

    System.out.println("Proceeding to checkout. Your total is $8. Enter payment: ");
    int payment = scan.nextInt();
    int price = 8;
    if (price == payment)
    {
      System.out.println("Thank you for shopping with us. Have a great day!");
    }
    if (payment < price)
    {
      int under = price - payment;
      System.out.println("You underpayed by $" + under + ". It's okay. We'll let it slide for you.");
    }
    else if (payment > price)
    {
      int over = payment - price;
      System.out.println("You overpayed by $" + over + ". Here is your change. Have a great day!");
    }
  }
}