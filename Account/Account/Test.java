package Account;

public class Test {
    public static void main(String[] args) {
        SavingsAccount sa = new SavingsAccount();
        sa.withdraw();
        sa.deposit();
        sa.fixedDeposit();
        sa.closeAccount();

        LoanAccount la = new LoanAccount();
        la.payEmi();
        la.topUpLoan();
        la.repayment();
        la.closeAccount();
    }
}
