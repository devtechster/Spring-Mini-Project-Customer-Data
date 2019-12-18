package customer;

public class Customer 
{
	private int customerId;
	private String customerName;
	private Address customerAddress;
	
	public Customer()
	{
		
	}
	

	public Customer(int customerId, String customerName, Address customerAddress) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerAddress = customerAddress;
	}


	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerAddress() {
		return customerAddress.toString();
	}

	public void setCustomerAddress(Address customerAddress) {
		this.customerAddress = customerAddress;
	}
	
	
}
