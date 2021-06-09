import java.util.Scanner;
import java.util.ArrayList;
class Main 
{
  public static void main(String[] args) 
  {
    //Instantiating objects: GroceryList, Scanner, Potato, Cereal, Chips
    //An ArrayList is utilized 
    ArrayList<String> GroceryList = new ArrayList<>();
    Scanner scan = new Scanner(System.in);

    //The following are instance of polymorphism: Using the parent class ItemsParent and child classes Potatoes, Cereal, and Chips
    ItemsParent potato = new Potatoes ("potato", 1, true, "vegetable", "Idaho");
    ItemsParent cereal = new Cereal("Cocoa Puffs", 4, true, "Kellogs", "crunchy");
    ItemsParent chips = new Chips("Doritos", 3, true, "cheesy", 150);
    Store riouxStore = new Store("Rioux Store", "Marc Encarnacion", 8, 10, 2021);

    //Est up the key infomation (name of store and objective)
    System.out.println("\n" + riouxStore.toString());
    System.out.println("\n---Rioux Store Simulator---");
    System.out.println("Objective: Get potatoes, chips, and cereal");
    
    //Asking user what they would like to buy
    //Uses ArrayList and .add method
    System.out.println("What items would you like to buy?");
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
    System.out.println("Would you like to proceed to checkout? (yes or no)");
    if (scan.nextLine().equals("yes"))
    {
      System.out.println("Alright, proceeding to checkout.");
    }
    else 
      System.out.println("Too bad, you're going to chekout anyways");

    //The following is how the user pays for their groceries
    //The if and else if statements use ==, <, and > with each scenario providing different dialogue
    System.out.println("Proceeding to checkout. Your total is $8. Enter payment: ");
    int payment = scan.nextInt();
    int price = 8;
    if (price == payment)
    {
      System.out.println("Thank you for shopping with us. Have a great day!");
    }//end if statement
    if (payment < price)
    {
      int under = price - payment;
      System.out.println("You underpayed by $" + under + ". It's okay. We'll let it slide for you.");
    }//end if statement
    else if (payment > price)
    {
      int over = payment - price;
      System.out.println("You overpayed by $" + over + ". Here is your change. Have a great day!");
    }//end else if statment

    //This is the next part of the storyline: You go back home and prepare the food you bought.
    System.out.println("\n---Cooking at Rioux's House--- (Part 2)");
    System.out.println("You return home and prepare your groceries");
    //Methods from one class are called from another clas (methods: prepare, cook, condiments)
    String finish = new String ("You finish cooking the fries and you eat it with the condiments. Congratualtions!");
    System.out.println(chips.prepare());
    System.out.println(cereal.prepare());
    System.out.println(potato.prepare());
    potato.cook();
    potato.condiments();
    System.out.println("\n");
    System.out.println(eat(finish));
  }//end main method

  //Precondition: Passes a string object to the method
  //Postcondition: Returns a modified version of the string

  //Passing a String object as a parameter to a method (Level 6)
  //A string is passed as a parameter as data and uses methods toUpperCase and toString (Level 8)
  public static String eat(String finish)
  {
    String output = finish.toUpperCase();
    
    //Returning an object as a parameter to a method
    return output.toString();
  }//end toString
}//end Main class