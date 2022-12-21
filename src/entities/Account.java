package entities;

public class Account {

	private Integer number;
	private String holder;
	public Double balance;
	private Double withdraw;
	
	public Account() {
		super();
	}

	public Account(Integer number, String holder, Double balance, Double withdraw) {
		super();
		this.number = number;
		this.holder = holder;
		this.balance = balance;
		this.withdraw = withdraw;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public Double getBalance() {
		return balance;
	}

	public void setBalance(Double balance) {
		this.balance = balance;
	}

	public Double getWithdraw() {
		return withdraw;
	}

	public void setWithdraw(Double withdraw) {
		this.withdraw = withdraw;
	}
	
	public void deposit(double amount) {
		balance += amount;
	}
	
	public void withdraw(double amount) {
		balance -= amount;
	}
}
