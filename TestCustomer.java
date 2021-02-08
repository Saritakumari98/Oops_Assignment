package aggregationAndEncapsulation;

public class TestCustomer {

	public static void main(String[] args) {
		Address a=new Address("1st Main HSR Layout", "Banglore");
		Address a1=new Address("17th Main BTM Layout", "Banglore");
		
		Customer c1=new Customer();
		c1.setCustomerName("Jhon");
		c1.setResidentialAddress(a);
		System.out.println("Customer Name: "+c1.getCustomerName()+"\nResidential Address: "+c1.getResidentialAddress());
		 
		 
		 Customer c2=new Customer("Alex",a1);
		 System.out.println(c2.getCustomerDetails());
		 
		 

	}

}
