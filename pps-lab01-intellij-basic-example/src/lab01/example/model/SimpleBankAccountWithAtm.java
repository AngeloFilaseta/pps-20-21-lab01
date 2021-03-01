package lab01.example.model;

import lab01.example.model.operations.BankOperatorWithFee;

public class SimpleBankAccountWithAtm extends AbstractBankAccount {

    public SimpleBankAccountWithAtm(final AccountHolder holder, final int balance) {
        super(holder, balance, new BankOperatorWithFee());
    }

}