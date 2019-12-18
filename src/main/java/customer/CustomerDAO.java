package customer;

import java.util.ArrayList;
import java.util.List;

public class CustomerDAO 
{
	private List<Customer> customerList;
	
	public CustomerDAO()
	{
		customerList = new ArrayList<Customer>();
	}

	public CustomerDAO(List<Customer> customerList) {
		super();
		this.customerList = customerList;
	}

	public List<Customer> getCustomerList() {
		return customerList;
	}

	public void setCustomerList(List<Customer> customerList) {
		this.customerList = customerList;
	}
	
	public void addCustomer(Customer singleCustomer)
	{
		customerList.add(singleCustomer);
	}
	
	public List<Customer> fetchCustomers()
	{
		return customerList;
	}

	public void deleteCustomer(int customerId) 
	{
		System.out.println(customerId);
		for(int i=0;i<customerList.size();i++)
		{
			if(customerList.get(i).getCustomerId()==customerId)
			{
				customerList.remove(i);
			}
		}
		
		
	}

	public Customer fetchCustomerById(Integer customerId) 
	{
		int i;
		
		for( i = 0; i<customerList.size();i++)
		{
			if(customerList.get(i).getCustomerId()==customerId)
			{
				return customerList.get(i);
			}
		}
		
		return null;
	}
}
