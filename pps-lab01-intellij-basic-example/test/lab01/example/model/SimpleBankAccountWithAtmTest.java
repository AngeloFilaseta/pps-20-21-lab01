package lab01.example.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static lab01.example.model.operations.BankOperatorWithFee.TRANSACTION_FEE;
import static org.junit.jupiter.api.Assertions.assertEquals;

class SimpleBankAccountWithAtmTest extends AbstractSimpleBankAccountTest{

    @BeforeEach
    @Override
    void beforeEach() {
        accountHolder = new AccountHolder("Mario", "Rossi", 1);
        bankAccount = new SimpleBankAccountWithAtm(accountHolder, 0);
    }

    @Test
    @Override
    void testDeposit() {
        bankAccount.deposit(accountHolder.getId(), 100);
        assertEquals(100 - TRANSACTION_FEE, bankAccount.getBalance());
    }

    @Test
    @Override
    void testWithdraw() {
        bankAccount.deposit(accountHolder.getId(), 100);
        bankAccount.withdraw(accountHolder.getId(), 70);
        assertEquals(30 - (TRANSACTION_FEE * 2) , bankAccount.getBalance());
    }

    @Test
    @Override
    void testWrongDeposit() {
        bankAccount.deposit(accountHolder.getId(), 100);
        bankAccount.deposit(2, 50);
        assertEquals(100 - TRANSACTION_FEE, bankAccount.getBalance());
    }

    @Test
    @Override
    void testWrongWithdraw() {
        bankAccount.deposit(accountHolder.getId(), 100);
        bankAccount.withdraw(2, 50);
        assertEquals(100 - TRANSACTION_FEE, bankAccount.getBalance());
    }

}