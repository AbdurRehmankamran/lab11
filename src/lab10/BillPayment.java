package lab10;

interface BillPayment {
    void processBillPayment(double amount);
}

// Define an interface for opening new accounts
interface AccountOpening {
    void openAccount(String accountType, double initialDeposit);
}

// Define an interface for contacting loan takers with expired limits
interface LoanContact {
    void contactExpiredLoanTaker(String customerID);
}