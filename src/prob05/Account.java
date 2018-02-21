package prob05;

public class Account {
	private String accountNo;
	private int balance;
	
	public Account(String accountNo) {
		this.accountNo = accountNo;
	}
	
	public void save(int inputMoney) {
		if(inputMoney < 0) {
			return;
		}
		
		balance += inputMoney;
	}
	
	public void deposit(int depositMoney) {
		if(balance < 0) {
			return;
		}
		
		balance -= depositMoney;
	}

	public String getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

}