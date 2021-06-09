//Class Composition used throughtout class
public class Chips extends ItemsParent
{
  //1 Unique Instance Variables from parent class
  private String taste;
  private int calories;

  //2 Constructor
  public Chips(String itemName, int price, boolean isOnList, String taste, int calories)
  {
    super(itemName, price, isOnList);
    this.taste = taste;
    this.calories = calories;
  }//end Cereal constructor

  //3 toString
  public String toString()
  {
    String output = super.toString();
    output += "\nTaste: " + taste + "\nCalories (per serving): " + 150;
    return output;
  }//end toString
}//end Chips class