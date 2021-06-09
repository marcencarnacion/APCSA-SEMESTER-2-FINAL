//this is a class not within the ItemsParent hierarchy
//Class Composition used throughtout class
public class Store 
{
  //1 Instance Variables
  private String name;
  private String employee;
  private int openingTime;
  private int closingTime;
  private int established;

  //2 Constructor
  public Store(String name, String employee, int openingTime, int closingTime, int established)
  {
    this.name = name;
    this.employee = employee;
    this.openingTime = openingTime;
    this.closingTime = closingTime;
    this.established = established;
  }//end Store constructor

  //3 toString
  public String toString()
  {
    String output = "Background information: The name of this store is " + name + ", and it was established in " + established + "." + "\nI am the employee of this store, " + employee + ", and our store hours are from " + openingTime + "AM to " + closingTime + "PM."; 
    return output;
  }//end toString
}//end Store class