package car_dealership;

public class Employee {
 public void handleCustomer(Customer cust ,boolean finance , Vehicle vehicle )
 {
    if(finance == true)
    {
    	double loanAmount = vehicle.getPrice() - cust.getCashOnHand() ;
    	runCreditHistory(cust , loanAmount) ;
    }
    else if(vehicle.getPrice() <= cust.cashOnHand)
    {
    	processTransaction(cust , vehicle);
    }
    else 
    {
    System.out.println("Customer needs more money to buy the vehicle" + vehicle) ;	
    }
 }
 
  public void runCreditHistory(Customer cust , double loanAmount)
  {
	System.out.println("Run credit history for Customer");
	System.out.println("Customer purchase has been approved");
  }
  public void processTransaction(Customer cust , Vehicle vehicle)
  {
	  System.out.println("Customer has purchased the vehicle " + vehicle + " for the price " 
  + vehicle.getPrice());
  }
}
