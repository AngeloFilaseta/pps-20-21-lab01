package lab01.example.model.operations;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankOperatorWithFeeTest extends  AbstractBankOperatorTest{

    @Override
    void beforeEach() {
        operator = new BankOperatorWithFee();
        initialValue = 100;
    }

    @Override
    void testDeposit() {
        assertEquals(199, operator.deposit(initialValue, 100));
    }

    @Override
    void testWithdraw() {
        assertEquals(49, operator.withdraw(initialValue, 50));
    }
}
