package lab10;
	public class BankingSystemTest {
	    public static void main(String[] args) {
	        OnlineBank bank = new OnlineBank();
	        bank.processBillPayment(100.00);
	        bank.openAccount("Savings", 500.00);
	        bank.contactExpiredLoanTaker("123456");
	    }
	}
