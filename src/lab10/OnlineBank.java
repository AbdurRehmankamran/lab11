package lab10;
class OnlineBank implements BillPayment, AccountOpening, LoanContact {

    @Override
    public void processBillPayment(double amount) {
        // Implementation for processing bill payments
        System.out.println("Bill payment processed: $" + amount);
    }

    @Override
    public void openAccount(String accountType, double initialDeposit) {
        // Implementation for opening new accounts
        System.out.println("New " + accountType + " account opened with initial deposit: $" + initialDeposit);
    }

    @Override
    public void contactExpiredLoanTaker(String customerID) {
        // Implementation for contacting loan takers with expired limits
        System.out.println("Contacting loan taker with expired limit. Customer ID: " + customerID);
    }
}
