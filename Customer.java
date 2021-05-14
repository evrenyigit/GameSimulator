
public class Customer {
	
	private String customerFirstName;
	private String customerLastName;
	private String customerId;
	private int yearOfBirth;
	
	
	public Customer(String customerFirstName, String customerLastName, String customerId, int yearOfBirth) {
		this.customerFirstName = customerFirstName;
		this.customerLastName = customerLastName;
		this.customerId = customerId;
		this.yearOfBirth = yearOfBirth;
	}
	
	public String getCustomerFirstName() {
		return customerFirstName;
	}



	public void setCustomerFirstName(String customerFirstName) {
		this.customerFirstName = customerFirstName;
	}



	public String getCustomerLastName() {
		return customerLastName;
	}



	public void setCustomerLastName(String customerLastName) {
		this.customerLastName = customerLastName;
	}



	public String getCustomerId() {
		return customerId;
	}



	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}



	public int getYearOfBirth() {
		return yearOfBirth;
	}



	public void setYearOfBirth(int yearOfBirth) {
		this.yearOfBirth = yearOfBirth;
	}
	
	


}
