package lab01.example.model.operations;

public class BankOperatorWithFee extends BankOperatorImpl{

    public static final int TRANSACTION_FEE = 1;

    @Override
    public double deposit(double bankAccountAmount, double depositAmount) {
        return super.deposit(bankAccountAmount, depositAmount) - TRANSACTION_FEE;
    }

    @Override
    public double withdraw(double bankAccountAmount, double withdrawAmount) {
        return super.withdraw(bankAccountAmount, withdrawAmount) - TRANSACTION_FEE;
    }

}
