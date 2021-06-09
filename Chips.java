//Class Composition used throughtout class
public class Chips extends ItemsParent
{
  //1 Unique Instance Variables from parent class
  private String taste;
  private int calories;

  //2 Constructor
  //The following constructors are considered overloaded methods
  public Chips(String itemName, int price, boolean isOnList, String taste, int calories)
  {
    super(itemName, price, isOnList);
    this.taste = taste;
    this.calories = calories;
  }//end Chips constructor (5 argument)

  public Chips(String itemName, int price, boolean isOnList, String taste)
  {
    super(itemName, price, isOnList);
    this.taste = taste;
    this.calories = 0;
  }//end Chips constructor (4 argument)

  public Chips(String itemName, int price, boolean isOnList)
  {
    super(itemName, price, isOnList);
    this.taste = "bland";
    this.calories = 0;
  }//end Chips constructor (3 argument)

  //3 toString
  public String toString()
  {
    String output = super.toString();
    output += "\nTaste: " + taste + "\nCalories (per serving): " + 150;
    return output;
  }//end toString
}//end Chips class