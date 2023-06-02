package model1;

public class Bank {
	private long id;
	private String name;
	private long accountNumber;
	
	public void AccountDetails() {
		System.out.println(id);
		System.out.println(name);
		System.out.println(accountNumber);
		System.out.println("-----------------------");
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}
	

}
