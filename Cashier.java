//Student name: Zachary Flahaut
//Student number: 30056316
//Course code: ITI1121
//Lab section: Z-01

public class Cashier{

  // Instance variables

  private int customersServed;
  private int totalCustomerWaitTime;
  private int totalItemsServed;
  private Customer currentCustomer;
  private Queue<Customer> queue;

  public Cashier(){
    queue = new ArrayQueue<Customer>();
    customersServed = 0;
    totalCustomerWaitTime = 0;
    totalItemsServed = 0;
  }
  public void addCustomer(Customer c){
    queue.enqueue(c);
  }
  public int getQueueSize(){
    return queue.size();
  }
  public void serveCustomers(int currentTime){
    if(currentCustomer==null && queue.isEmpty()){
      return;
    }
    if(currentCustomer==null){
      currentCustomer=queue.dequeue();
      totalCustomerWaitTime += currentTime -currentCustomer.getArrivalTime();
      customersServed++;
    }
    currentCustomer.serve();
    if(currentCustomer.getNumberOfItems()==0){
      totalItemsServed += currentCustomer.getNumberOfServedItems();
      currentCustomer=null;
    }
  }
  public int getTotalCustomerWaitTime(){
    return totalCustomerWaitTime;
  }
  public int getTotalCustomersServed(){
    return customersServed;
  }
  public int getTotalItemsServed(){
    return totalItemsServed;
  }
  public String toString(){
    StringBuffer str = new StringBuffer();
    str.append(System.getProperty("line.separator"));
    str.append("The total number of customers served is: ");
    str.append(customersServed);
    str.append(System.getProperty("line.separator"));
    str.append("The average number of items per customer is: ");
    str.append(totalItemsServed/customersServed);
    str.append(System.getProperty("line.separator"));
    str.append("The average waiting time(seconds) is: ");
    str.append(totalCustomerWaitTime/customersServed);
    str.append(System.getProperty("line.separator"));
    return str.toString();
  }
}
