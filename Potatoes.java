import java.util.Scanner;
import java.util.ArrayList;
//Class Composition used throughtout class
public class Potatoes extends ItemsParent
{
  Scanner scan = new Scanner(System.in);
  //1 Unique Instance Varibles from parent class
  private String type;
  private String locationGrown;

  //2 Constructor
  //The following constructors are considered overloaded methods
  public Potatoes(String itemName, int price, boolean isOnList, String type, String locationGrown)
  {
    super(itemName, price, isOnList);
    this.type = type;
    this.locationGrown = locationGrown;
  }//end Potatoes constructor (5 argument)
  
  public Potatoes(String itemName, int price, boolean isOnList, String type)
  {
    super(itemName, price, isOnList);
    this.type = type;
    this.locationGrown = "USA";
  }//end Potatoes constructor (4 argument)

  public Potatoes(String itemName, int price, boolean isOnList)
  {
    super(itemName, price, isOnList);
    this.type = "food";
    this.locationGrown = "USA";
  }//end Potatoes constructor (3 argument)

  //overriden method
  @Override
  public String prepare()
  {
    return "You proceed to cut and peel the potato.";
  }//end prepare method
  
  //Precondition: Uses for loop to decrement the time 
  //Postcondition: Prints the time decreasing as the loop decrements

  //overriden method
  @Override
  public void cook()
  {
    String[] ingredients = new String[]{"salt", "water"};
    System.out.println("You place the slices in a pot.");
    System.out.println("\nNow time to cook!");
    for (int i = 10; i > 0; i--)
    {
      //if statement in the context of a for loop
      if (i == 10)
      {
        System.out.println("Add " + ingredients[1] + " in the pot and boil");
      }//end if statement
      //if statement in the context of a for loop with one or more boolean operators
      if (i < 10 && i > 6)
      {
        System.out.println("Add " + ingredients[0] + " between 9 and 7 minutes");
      }//end if statment
      System.out.println("You have " + i + " minutes left.");
    }//end for loop
    System.out.println("\nYou finished cooking the fries!");
  }//end method Cook

  //Precondition: The user is given a selection of condiments and is prompted to add another condiment
  //Postcondition: The method prints out the updated list of condiments after the user's input

  //overriden method
  @Override
  public void condiments()
  {
    //ArrayList is used in at least one student-designed class
    ArrayList<String> condiments = new ArrayList<>();
    Scanner scan = new Scanner(System.in);
    condiments.add("ketchup");
    condiments.add("barbeque");
    condiments.add("thousand island");
    System.out.println("You have a selection of condiments:");
    int size = condiments.size() - 2;
    for (int i = 0; i < condiments.size(); i++)
    {
      //data is counted in the context of a loop
      System.out.print("Condiment " + i + " is ");
      //data is moved in the context of a loop
      //String is used as the data
      System.out.println(condiments.get(i));
    }//end for loop

    //data is added in the context of a loop
    //String is used as the data
    for (int i = 0; i < size; i++)
    {
      System.out.println("Add a condiment: ");
      condiments.add(scan.nextLine());
    }//end for loop

    System.out.println("Your new list of condiments are: ");
    for (int i = 0; i < condiments.size(); i++)
    {
      System.out.print(condiments.get(i) + ", ");
    }
  }//end class condiments

  //3 toString
  public String toString()
  {
    String output = super.toString();
    output += "\nType: " + type + "\nWhere was it grown?: " + locationGrown;
    return output;
  }//end toString
}//end Potato class