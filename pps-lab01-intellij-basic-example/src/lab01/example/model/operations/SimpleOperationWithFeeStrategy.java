package lab01.example.model.operations;

public class SimpleOperationWithFeeStrategy extends SimpleOperationStrategy {

    public static final int TRANSACTION_FEE = 1;

    @Override
    public double updateBalanceAfterDeposit(double bankAccountAmount, double depositAmount) {
        return super.updateBalanceAfterDeposit(bankAccountAmount, depositAmount) - TRANSACTION_FEE;
    }

    @Override
    public double updateBalanceAfterWithdraw(double bankAccountAmount, double withdrawAmount) {
        return super.updateBalanceAfterWithdraw(bankAccountAmount, withdrawAmount) - TRANSACTION_FEE;
    }

}
