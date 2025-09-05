package Assignment;

public class BankAccount {

	private String accountNumber;
	private double balence;
	private String owenr;
	
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public double getBalence() {
		return balence;
	}
	public void setBalence(double balence) {
		this.balence = balence;
	}
	public String getOwenr() {
		return owenr;
	}
	public void setOwenr(String owenr) {
		this.owenr = owenr;
	}
	
	public void deposit(double dep_amount)
	{
		balence+=dep_amount;
	}
	
	public void withdraw(double with_amount)
	{
		balence-=with_amount;
	}
	
	public void printStatement()
	{
		System.out.print("account number : "+accountNumber+"\n"+"owner : "+owenr+"\n"+ "balence :"+balence);
	}
	
	
	
}
