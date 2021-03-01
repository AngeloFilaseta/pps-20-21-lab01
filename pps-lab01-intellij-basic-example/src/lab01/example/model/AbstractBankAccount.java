package lab01.example.model;

import lab01.example.model.operations.BankOperator;

public abstract class AbstractBankAccount implements BankAccount{

    protected double balance;
    protected final AccountHolder holder;
    protected final BankOperator operator;

    public AbstractBankAccount(final AccountHolder holder, final double balance, final BankOperator operator) {
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
            balance = operator.deposit(balance, amount);
        }
    }

    @Override
    public void withdraw(final int usrID, final double amount) {
        if(isWithdrawAllowed(amount) && checkUser(usrID)) {
            balance = operator.withdraw(balance, amount);
        }
    }

    private boolean isWithdrawAllowed(final double amount){
        return this.balance >= amount;
    }

    private boolean checkUser(final int id) {
        return this.holder.getId() == id;
    }
}
