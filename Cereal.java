//Class Composition used throughtout class
public class Cereal extends ItemsParent
{
  //1 Unique Instance Variables from parent class
  private String brand;
  private String texture;

  //2 Constructor
  //The following constructors are considered overloaded methods
  public Cereal(String itemName, int price, boolean isOnList, String brand, String texture)
  {
    super(itemName, price, isOnList);
    this.brand = brand;
    this.texture = texture;
  }//end Cereal constructor (5 argument)

  public Cereal(String itemName, int price, boolean isOnList, String brand)
  {
    super(itemName, price, isOnList);
    this.brand = brand;
    this.texture = "smooth";
  }//end Cereal constructor (4 argument)

  public Cereal(String itemName, int price, boolean isOnList)
  {
    super(itemName, price, isOnList);
    this.brand = "generic";
    this.texture = "smooth";
  }//end Cereal constructor (3 argument)

  //3 toString
  public String toString()
  {
    String output = super.toString();
    output += "\nBrand: " + brand + "\nTexture: " + texture;
    return output;
  }//end toString
}//end Cereal class