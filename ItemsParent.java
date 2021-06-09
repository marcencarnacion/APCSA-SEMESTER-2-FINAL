//Class Composition used throughtout class
public class ItemsParent 
{
  //1 Instance Variables 
  public String itemName;
  public int price;
  public boolean isOnList;

  //2 Constructor
  //Overloaded methods
  public ItemsParent(String itemName, int price, boolean isOnList)
  {
    this.itemName = itemName;
    this.price = price;
    this.isOnList = isOnList;
  }//end ItemsParent constructor (3 Argument)

  public ItemsParent(String itemName, int price)
  {
    this.itemName = itemName;
    this.price = price;
    this.isOnList = false;
  }//end ItemParent constructor (2 Argument)

  public ItemsParent(String itemName)
  {
    this.itemName = itemName;
    this.price = 0;
    this.isOnList = false;
  }//end ItemsParent constructor (1 Argument)

  public ItemsParent()
  {
    this.itemName = "";
    this.price = 0;
    this.isOnList = false;
  }//end ItemsParent constructor (0 Argument)
  //Getters and Setters
  public String itemName()
  {
    return itemName;
  }//end itemName getter

  public void setName(String itemName)
  {
    this.itemName = itemName;
  }//brain method
  
  //3 toString
  public String toString()
  {
    return "Name: " + itemName + "\nPrice: $" + price + "\nOn List: " + isOnList;
  }//end toString
}//end class Restaurant