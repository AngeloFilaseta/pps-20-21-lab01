package lab01.example.model.operations;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public abstract class AbstractBankOperatorTest {

    BankOperator operator;
    Integer initialValue;

    @BeforeEach
    abstract void beforeEach();

    @Test
    abstract void testDeposit();

    @Test
    abstract void testWithdraw();

}
