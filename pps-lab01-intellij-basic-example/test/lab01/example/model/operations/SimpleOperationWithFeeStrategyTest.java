package lab01.example.model.operations;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SimpleOperationWithFeeStrategyTest extends AbstractOperationStrategyTest {

    @Override
    void beforeEach() {
        operator = new SimpleOperationWithFeeStrategy();
        initialValue = 100;
    }

    @Override
    void testDeposit() {
        assertEquals(199, operator.updateBalanceAfterDeposit(initialValue, 100));
    }

    @Override
    void testWithdraw() {
        assertEquals(49, operator.updateBalanceAfterWithdraw(initialValue, 50));
    }
}
