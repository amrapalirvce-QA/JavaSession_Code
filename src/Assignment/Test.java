package Assignment;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount ba=new BankAccount();
		ba.setAccountNumber("101");
		ba.setOwenr("ammu");
		ba.setBalence(110.0);
		
		ba.deposit(20);
		ba.withdraw(40);
		
		ba.printStatement();
	}

}
