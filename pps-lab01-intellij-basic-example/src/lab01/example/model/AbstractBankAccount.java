package lab01.example.model;

import lab01.example.model.operations.OperationStrategy;

public abstract class AbstractBankAccount implements BankAccount{

    protected double balance;
    protected final AccountHolder holder;
    protected final OperationStrategy operator;

    public AbstractBankAccount(final AccountHolder holder, final double balance, final OperationStrategy operator) {
        this.holder = holder;
        this.balance = balance;
        this.operator = operator;
    }

    @Override
    public AccountHolder getHolder() {
        return this.holder;
    }

    @Override
    public double getBalance() {
        return this.balance;
    }

    @Override
    public void deposit(final int usrID, final double amount) {
        if (checkUser(usrID)) {
            balance = operator.updateBalanceAfterDeposit(balance, amount);
        }
    }

    @Override
    public void withdraw(final int usrID, final double amount) {
        if(isWithdrawAllowed(amount) && checkUser(usrID)) {
            balance = operator.updateBalanceAfterWithdraw(balance, amount);
        }
    }

    private boolean isWithdrawAllowed(final double amount){
        return this.balance >= amount;
    }

    private boolean checkUser(final int id) {
        return this.holder.getId() == id;
    }
}
