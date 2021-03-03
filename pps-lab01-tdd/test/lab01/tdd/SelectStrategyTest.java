package lab01.tdd;

import lab01.tdd.selectStrategy.SelectStrategy;
import lab01.tdd.selectStrategy.factory.SelectEqualsStrategyFactory;
import lab01.tdd.selectStrategy.factory.SelectEvenStrategyFactory;
import lab01.tdd.selectStrategy.factory.SelectMultipleOfStrategyFactory;
import lab01.tdd.selectStrategy.factory.SelectStrategyFactory;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Optional;

import static lab01.tdd.TestUtility.TEST_REPETITION;
import static lab01.tdd.TestUtility.populateListWithElements;
import static org.junit.jupiter.api.Assertions.*;

class SelectStrategyTest {

    private CircularList circularList;
    private SelectStrategy strategy;
    private SelectStrategyFactory factory;

    @BeforeEach
    void beforeEach(){
        circularList = new CircularListImpl();
    }

    @Test
    void testEvenStrategy(){
        factory = new SelectEvenStrategyFactory();
        strategy = factory.createStrategy();
        assertTrue(strategy.apply(0));
        assertFalse(strategy.apply(1));
        assertTrue(strategy.apply(2));
        assertFalse(strategy.apply(3));
        //Circular List Test
        populateListWithElements(circularList, 1,2,3);
        for(int i = 0 ; i< TEST_REPETITION; i++){
            assertEquals(Optional.of(2), circularList.next(strategy));
        }
    }

    @Test
    void testEqualsStrategy() {
        factory = new SelectEqualsStrategyFactory();
        strategy = factory.createStrategy(3);
        assertTrue(strategy.apply(3));
        assertFalse(strategy.apply(2));
        assertFalse(strategy.apply(1));
        //Circular List Test
        populateListWithElements(circularList, 1,2,3);
        for(int i = 0 ; i< TEST_REPETITION; i++){
            assertEquals(Optional.of(3), circularList.next(strategy));
        }
    }

    @Test
    void testMultipleOfStrategy() {
        factory = new SelectMultipleOfStrategyFactory();
        strategy = factory.createStrategy(3);
        assertTrue(strategy.apply(6));
        assertFalse(strategy.apply(12));
        assertFalse(strategy.apply(1));
        //Circular List Test
        populateListWithElements(circularList, 1,2,6,3,10);
        for(int i = 0 ; i< TEST_REPETITION; i++){
            assertEquals(Optional.of(6), circularList.next(strategy));
        }
    }


}