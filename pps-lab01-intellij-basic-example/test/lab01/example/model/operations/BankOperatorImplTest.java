package lab01.example.model.operations;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BankOperatorImplTest extends AbstractBankOperatorTest{

    @BeforeEach
    void beforeEach(){
        operator = new StandardOperationStrategy();
        initialValue = 100;
    }

    @Test
    void testDeposit(){
        assertEquals(200, operator.updateBalanceAfterDeposit(initialValue, 100));
    }

    @Test
    void testWithdraw(){
        assertEquals(50, operator.updateBalanceAfterWithdraw(initialValue, 50));
    }

}