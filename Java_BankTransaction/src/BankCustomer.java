
public class BankCustomer {
	private int accountNumber;
	private float balance;
	private String customerName;
	private String email;
	private String phoneNum;
	
	private static int accNum = 1000;
	static int generateAccNum() {
		accNum = accNum + 249;
		return accNum;
	}
	
	BankCustomer(){
		this.accountNumber = generateAccNum();
		this.balance = 100.0f;
		this.customerName = "Pallavi Das";
		this.email = "pdasgm2015@gmail.com";
		this.phoneNum = "814-321-1000";
	}
	
	BankCustomer(String name, String email, String phoneNum){
		this.accountNumber = generateAccNum();
		this.balance = 100.0f;
		this.customerName = name;
		this.email = email;
		this.phoneNum = phoneNum;
	}
	
	void depositFunds(float funds) {
		balance = balance + funds;
		setBalance(balance);
		System.out.println("New Balance after deposit: " + getBalance());
	}
	
	void withdrawFunds(float amtDeduct) {
		if(balance-amtDeduct >= 100) {
			setBalance(balance-amtDeduct);
			System.out.println("New Balance after withdaral: " + getBalance());
		}
		else System.out.println("No withdrawal possible : Insufficient Funds!!");
	}
	
	void displayCustomerDetails() {
		System.out.println("\n*****Bank Customer Information*****");
		System.out.println("Account Number: " + getAccountNumber());
		System.out.println("Balance Amount: " + getBalance());
		System.out.println("Customer Name: " + getCustomerName());
		System.out.println("Customer Email: " + getEmail());
		System.out.println("Customer Phone Number: " + getPhoneNum());
		System.out.println();
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	/*public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}*/

	public float getBalance() {
		return balance;
	}

	public void setBalance(float balance) {
		this.balance = balance;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNum() {
		return phoneNum;
	}

	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}
}
