package lab;

public class BankAccountApp {

	public static void main(String[] args) {
		BankAccount acc1= new BankAccount("46785543");
		BankAccount acc2= new BankAccount("67890934");
		BankAccount acc3= new BankAccount("23890913");
	}

}


	class BankAccount{
		private static int iD= 10000;
		private String accountNumber;
		private String routingNumber;
		private String name;
		private String SSN;
		private String balance;
		
		public BankAccount(String SSN) {
			//System.out.println("New Bank Account Created");
			this.SSN = SSN;
			iD++;
			
			setAccountNumber();
		}
		private void setAccountNumber() {
			int random = (int) (Math.random() * 100);
			accountNumber = iD + "" + random  + SSN.substring(0,2);
			System.out.println("Your Account Number: " + accountNumber);
			
		}
	}
