package lab01.example.model.operations;

/**
 * This interface defines the logic of the deposit and withdraw operation of a BankAccount
 */
public interface OperationStrategy {

    double updateBalanceAfterDeposit(final double bankAccountBalance, final double depositAmount);

    double updateBalanceAfterWithdraw(final double bankAccountBalance, final double withdrawAmount);

}
