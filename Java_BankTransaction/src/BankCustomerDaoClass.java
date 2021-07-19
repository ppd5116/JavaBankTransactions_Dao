import java.util.List;
import java.util.ArrayList;

public class BankCustomerDaoClass {
	List<BankCustomer> customers;
	
	public BankCustomerDaoClass() {
		customers = new ArrayList<BankCustomer>();
		BankCustomer bankcus1 = new BankCustomer("Ayan", "ayan249@hotmail.com", "424-500-1000");
		BankCustomer bankcus2 = new BankCustomer("Pallavi", "ppd5116@psu.edu", "814-321-3940");
		customers.add(bankcus1);
		customers.add(bankcus2);
	}
	
	public void addCustomer(BankCustomer customer, float balance, String name, String email, String phoneNum) {
		customer.setBalance(balance);
		customer.setCustomerName(name);
		customer.setEmail(email);
		customer.setPhoneNum(phoneNum);
		customers.add(customer);
	}
	public void updateCustomerName(BankCustomer customer) {
		customers.get(customer.getAccountNumber()).setCustomerName(customer.getCustomerName());
	}
	
	public void updateCustomerEmail(BankCustomer customer) {
		customers.get(customer.getAccountNumber()).setEmail(customer.getEmail());
	}
	
	public void updateCustomerNum(BankCustomer customer) {
		customers.get(customer.getAccountNumber()).setPhoneNum(customer.getPhoneNum());
	}
	
	public void deleteCustomer(BankCustomer customer) {
		customers.remove(customer.getAccountNumber());
	}
	
	public List<BankCustomer> getAllCustomers(){
		return customers;
	}
	
	/*public void displayCustomer(String name) {
		if(customers.contains(name)) {
			//displayCustomerDetails();
		}
	}*/
	
	public void deposit(BankCustomer customer, float funds) {
		if(funds>5 && funds<10000) {
			customers.get(customer.getAccountNumber()).setBalance(customer.getBalance() + funds);
			System.out.println("New Account Balance:" + customers.get(customer.getAccountNumber()).getBalance());
		}
		else {
			System.out.println("Insufficient fund to deposit");
		}
	}
}
