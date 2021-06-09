//Class Composition used throughtout class
public class Potatoes extends ItemsParent
{
  //1 Unique Instance Varibles from parent class
  private String type;
  private String locationGrown;

  //2 Constructor
  public Potatoes(String itemName, int price, boolean isOnList, String type, String locationGrown)
  {
    super(itemName, price, isOnList);
    this.type = type;
    this.locationGrown = locationGrown;
  }//end Potato Constructor

  //3 toString
  public String toString()
  {
    String output = super.toString();
    output += "\nType: " + type + "\nWhere was it grown?: " + locationGrown;
    return output;
  }//end toString
}//end Potato class