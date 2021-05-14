
public class CustomerManager implements UserService {
	
	private UserCheckService userCheckService;
	

	public CustomerManager(UserCheckService userCheckService) {
		this.userCheckService = userCheckService;
	}
	

	@Override
	public void add(Customer customer) {
		if(userCheckService.UserCheckServiceForRealPerson(customer))
			System.out.println(customer.getCustomerFirstName() + " You have succesfully registered");
		
	}

	@Override
	public void delete(Customer customer) {
		if(userCheckService.UserCheckServiceForRealPerson(customer))
			System.out.println(customer.getCustomerFirstName() + " You have succesfully deleted");
		
		
	}

	@Override
	public void update(Customer customer) {
		if(userCheckService.UserCheckServiceForRealPerson(customer))
			System.out.println(customer.getCustomerFirstName() + " You have succesfully updated");
		
	}
	
	
	}
	
	
