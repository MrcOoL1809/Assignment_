class InsufficientBalanceException extends Exception{
	private int requiredAmount;
	
	public InsufficientBalanceException(int requiredAmount) {
		this.requiredAmount = requiredAmount;
	}
	public int getRequiredAmount() {
		return requiredAmount;
	}
	public String tostring() {
		return "Sorry, insufficient balance. you need more" + requiredAmount+ "Rupees";
	}
}
class BankAccount {
	private int balance = 2000;
	
	public void withdraw(int amount) throws InsufficientBalanceException {
		if (amount > balance) {
			throw new InsufficientBalanceException (amount - balance);
		}
		balance -= amount;
		System.out.println("Transaction successful. Remaining balance is:- "  + balance + " Rupees.");
	}
}
public class Question_27 {

	public static void main(String[] args) {
		BankAccount account = new BankAccount();
		int withdrawalamount = 2500;
		
		try {
			account.withdraw(withdrawalamount);
		}
		catch (InsufficientBalanceException e) {
			System.out.println(e);
			System.out.println("To Perform this transaction, you need to deposit more funds.");
		}
	}

}
