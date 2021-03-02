package lab01.tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SelectStrategyTest {

    SelectStrategy strategy;

    @Test
    void testEvenStrategy(){
        strategy = new SelectEvenStrategy();
        assertTrue(strategy.apply(0));
        assertFalse(strategy.apply(1));
        assertTrue(strategy.apply(2));
        assertFalse(strategy.apply(3));
    }
    
}