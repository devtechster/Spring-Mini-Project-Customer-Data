package customer;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CustomerController 
{
	ApplicationContext contextRef = new ClassPathXmlApplicationContext("ApplicationContext.xml");
	
	Customer customerObject = contextRef.getBean(Customer.class);
	CustomerDAO customerDaoObject = contextRef.getBean(CustomerDAO.class);
	
	@GetMapping(path = {"/"})
	public String defaultPath()
	{
		return "index";
	}
	

	@GetMapping(path = {"/addCustomer"})
	public String mappingOne()
	{
		return "addCustomer";
	}

	@GetMapping(path = {"/display"})
	public String mappingTwo()
	{
		return "redirect:showCustomer";
	}

	@GetMapping(path = {"/fetchCustomer"})
	public String mappingThree()
	{
		return "fetchCustomer";
	}
	
	@GetMapping(path = {"/showCustomer"})
	public String fetchCustomer(ModelMap map)
	{
		List<Customer> customerList = customerDaoObject.fetchCustomers();
		map.addAttribute("allCustomerList",customerList);
		return "customer";
	}
	
	@RequestMapping(path="/saveCustomer",  method = RequestMethod.POST)
	public String addCustomer(	@RequestParam("customerId")Integer customerId,
								@RequestParam("customerName")String customerName,
								@RequestParam("city")String city,
								@RequestParam("state")String state,
								@RequestParam("country")String country)
	{
		
		Address a = contextRef.getBean(Address.class);
		a.setCity(city);
		a.setState(state);
		a.setCountry(country);

		Customer c = contextRef.getBean(Customer.class);
		c.setCustomerId(customerId);
		c.setCustomerName(customerName);
		c.setCustomerAddress(a);
		
		customerDaoObject.addCustomer(c);
		
		return "redirect:showCustomer";
		
	}
	
	
	@RequestMapping(path= {"/deleteCustomer"})
	public String deleteCustomer(@RequestParam("customerId") Integer customerId)
	{
		System.out.println("in delete");		
		customerDaoObject.deleteCustomer(customerId);
		
		return "redirect:showCustomer";
	}

	
	@RequestMapping(path="/fetchById")
	public String fetchCustomerById(ModelMap map,@RequestParam("customerId")Integer customerId)
	{
		
		Customer singleCustomer = customerDaoObject.fetchCustomerById(customerId);
		map.addAttribute("cust",singleCustomer);
		return "fetchCustomer";
	}
	
	
	
	
	
	
}
