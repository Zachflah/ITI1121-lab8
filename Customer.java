//Student name: Zachary Flahaut
//Student number: 30056316
//Course code: ITI1121
//Lab section: Z-01

public class Customer{

  // Constant

  private static final int MAX_NUM_ITEMS = 30;

  // Instance variables
  
  private int numberOfItems;
  private int initialNumberOfItems;
  private int arrivalTime;

  public Customer(int arrivalTime){
    this.arrivalTime=arrivalTime;
    numberOfItems=(int)((MAX_NUM_ITEMS-1) * Math.random() +1);
    initialNumberOfItems=numberOfItems;
  }
  public int getArrivalTime(){
    return arrivalTime;
  }
  public int getNumberOfItems(){
    return numberOfItems;
  }
  public int getNumberOfServedItems(){
    return initialNumberOfItems-numberOfItems;
  }
  public void serve(){
    numberOfItems--;
  }
}
