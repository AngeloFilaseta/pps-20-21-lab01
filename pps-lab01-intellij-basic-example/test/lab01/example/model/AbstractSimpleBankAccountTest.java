package lab01.example.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public abstract class AbstractSimpleBankAccountTest {

    AccountHolder accountHolder;
    BankAccount bankAccount;

    @BeforeEach
    abstract void beforeEach();

    @Test
    void testInitialBalance() {
        assertEquals(0, bankAccount.getBalance());
    }

    @Test
    abstract void testDeposit();

    @Test
    abstract void testWithdraw();

    @Test
    abstract void testWrongDeposit();

    @Test
    abstract void testWrongWithdraw();

}
