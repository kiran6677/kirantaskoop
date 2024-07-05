package oops1;

public class Customer {
	
	private int CustomerId;
	private String CustomerName;
	private String CustomerContactno;
	private String CustomerAddress;
	
	public Customer() {
		
	}
	public Customer(int CustomerId,String CustomerName,String CustomerContactno,String CustomerAddress)
	{
		this.CustomerId=CustomerId;
		this.CustomerName=CustomerName;
		this.CustomerContactno=CustomerContactno;
		this.CustomerAddress=CustomerAddress;
	}
	public void getCustomer()
	{
		System.out.println(CustomerId);
		System.out.println(CustomerName);
		System.out.println(CustomerContactno);
		System.out.println(CustomerAddress);
	}
	

}
