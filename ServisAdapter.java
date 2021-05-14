
public class ServisAdapter implements UserCheckService {

	@Override
	public boolean UserCheckServiceForRealPerson(Customer customer) {
		
		if(customer.getCustomerId().length()==11)
			return true;
		else
			return false;
	}
	
	

}
