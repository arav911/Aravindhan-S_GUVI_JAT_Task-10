package task_10_guvi;

public class Account {
//	Declaring data member for balance
	int balance;

//	Default constructor for Account class
	Account() {
		balance = 10000;
	}

//	Parameterized constructor for Account class
	Account(int bal1) {
		balance = bal1;
	}

//	Method for withdrawing the amount
	int withdrawBalance(int withdrawAmount) {
		balance = balance - withdrawAmount;
		return balance;
	}

//	Method for depositing the amount
	int depositBalance(int depositAmount) {
		balance = balance + depositAmount;
		return balance;
	}

	public static void main(String[] args) {
//		Object creation for Default Constructor of Amount class 
		Account account = new Account();
		System.out.println("Previous Balance: " + account.balance + " | Balance after amount withdrawn: "
				+ account.withdrawBalance(5000) + " | Balance after amount deposited: " + account.depositBalance(8000));

//		Object creation for Default Constructor of Amount class for negative balance
		Account account1 = new Account();
		System.out.println("Previous Balance: " + account1.balance + " | Balance after amount withdrawn: "
				+ account1.withdrawBalance(15000) + " | Balance after amount deposited: " + account1.depositBalance(7000));
		
//		Object creation for Parameterized Constructor of Amount class 
		Account account2 = new Account(50000);
		System.out.println("Previous Balance: " + account2.balance + " | Balance after amount withdrawn: "
				+ account2.withdrawBalance(5000) + " | Balance after amount deposited: " + account2.depositBalance(8000));

//		Object creation for Parameterized Constructor of Amount class for negative balance
		Account account3 = new Account(50000);
		System.out.println("Previous Balance: " + account3.balance + " | Balance after amount withdrawn: "
				+ account3.withdrawBalance(65000) + " | Balance after amount deposited: " + account3.depositBalance(70000));

	}
}
