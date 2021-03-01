package lab01.example.model.operations;

/**
 * This interface defines the logic of the deposit and withdraw operation of a BankAccount
 */
public interface BankOperator {

    /**
     * @param bankAccountBalance the balance of the Bank Account
     * @param depositAmount the amount to deposit
     * @return the new Bank account balance
     */
    double deposit(final double bankAccountBalance, final double depositAmount);

    /**
     * @param bankAccountBalance the balance of the Bank Account
     * @param withdrawAmount the amount to withdraw
     * @return the new Bank account balance
     */
    double withdraw(final double bankAccountBalance, final double withdrawAmount);

}
