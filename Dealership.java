package car_dealership;

public class Dealership {

	public static void main(String[] args) {
		Customer cust1 = new Customer()	;
		cust1.setName("Tommy") ;
		cust1.setAddress("123 , Abc street") ;
		cust1.setCashOnHand(1000000) ;
		
		Vehicle vehicle = new Vehicle("Mercedes Benz" , "C Class" , 1500000) ;
		Employee emp = new Employee() ;
		
		cust1.purchaseCar(vehicle, emp, true);
		Vehicle car = new Vehicle("BMW" , "M5 CS" , 2000000) ;
		boolean value = car.equals(vehicle) ;
		System.out.println(value);
	
	 if(finance == true)
     runCreditHistory(Customer cust , double doubleAmount)
	 else if(vehicle.getPrice<= cust.getcashOnHand())
	 processTransaction(Customer cust , Vehicle vehicle)
	 else
		 System.out.println(Tell customer to bring more money);
	
	}
	
	

	}
