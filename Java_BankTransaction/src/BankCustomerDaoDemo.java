import java.util.Scanner;

public class BankCustomerDaoDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Do you want to add new customers: ");
		Scanner sc = new Scanner(System.in);
		String ask = sc.nextLine();
		switch(ask) {
		case "yes": 
			String answer; //only enter yes, y , no , or n as input to this variable
			BankCustomer customer = new BankCustomer();
			BankCustomerDaoClass customerList = new BankCustomerDaoClass();
			float balance, amount;
			String name, email, phoneNum;
			balance = sc.nextFloat();
			name = sc.nextLine();
			email = sc.nextLine();
			phoneNum = sc.nextLine();
			customer.setBalance(balance);
			customer.setCustomerName(name);
			customer.setEmail(email);
			customer.setPhoneNum(phoneNum);
			
			customerList.addCustomer(customer, balance, name, email, phoneNum);
			
			System.out.println("\nDo you want to deposit funds?");
			answer = sc.nextLine();
			if(answer == "yes" || answer == "y") {
				System.out.println("\nEnter amount to deposit:");
				amount = sc.nextFloat();
				customer.depositFunds(amount);
			}
			
			System.out.println("\nDo you want to withdraw funds?");
			answer = sc.nextLine();
			if(answer == "yes" || answer == "y") {
				System.out.println("\nEnter amount to withdraw:");
				amount = sc.nextFloat();
				customer.withdrawFunds(amount);
			}
			
			System.out.println("\nDo you want to display informations?");
			answer = sc.nextLine();
			if(answer == "yes" || answer == "y") {
				customer.displayCustomerDetails();
			}
			
			System.out.println("\nDo you want to update customer name?");
			answer = sc.nextLine();
			if(answer == "yes" || answer == "y") {
				System.out.println("\nEnter new customer name: ");
				name = sc.nextLine();
				customer.setCustomerName(name);
				customerList.updateCustomerName(customer);
			}
			
			System.out.println("\nDo you want to update customer email?");
			answer = sc.nextLine();
			if(answer == "yes" || answer == "y") {
				System.out.println("\nEnter new customer email: ");
				email = sc.nextLine();
				customer.setEmail(email);
				customerList.updateCustomerEmail(customer);
			}
			
			System.out.println("\nDo you want to update customer phone number?");
			answer = sc.nextLine();
			if(answer == "yes" || answer == "y") {
				System.out.println("\nEnter new customer name: ");
				phoneNum = sc.nextLine();
				customer.setPhoneNum(phoneNum);
				customerList.updateCustomerNum(customer);
			}
			
			System.out.println("\nDo you want to delete any customer?");
			answer = sc.nextLine();
			if(answer == "yes" || answer == "y") {
				customerList.deleteCustomer(customer);
				System.out.println(customer.getCustomerName() + " account has been deleted.");
			}
			
			System.out.println("\nDo you want to display the customer list?");
			answer = sc.nextLine();
			if(answer == "yes" || answer == "y") {
				System.out.println("\nHere's the customer list:");
				customerList.getAllCustomers();
			}
			
			System.out.println("\nDo you want to deposit funds to a specific customer?");
			answer = sc.nextLine();
			if(answer == "yes" || answer == "y") {
				System.out.println("\nEnter amount to deposit: ");
				amount = sc.nextFloat();
				customerList.deposit(customer, amount);
			}
			break;
			
		case "no":
			System.out.println("\nLogging out of Bank Customer Records!!");
			break;
		default: System.out.println("Not a valid answer");
		}
	}

}
