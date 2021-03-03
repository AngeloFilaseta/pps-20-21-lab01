package lab01.example.model.operations;

public class SimpleOperationStrategy implements OperationStrategy {

    @Override
    public double updateBalanceAfterDeposit(double bankAccountAmount, double depositAmount) {
        return bankAccountAmount + depositAmount;
    }

    @Override
    public double updateBalanceAfterWithdraw(double bankAccountAmount, double withdrawAmount) {
        return bankAccountAmount - withdrawAmount;
    }
}
