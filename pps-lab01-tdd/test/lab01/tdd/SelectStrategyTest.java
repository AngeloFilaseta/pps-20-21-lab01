package lab01.tdd;

import lab01.tdd.selectStrategy.SelectEqualsStrategy;
import lab01.tdd.selectStrategy.SelectEvenStrategy;
import lab01.tdd.selectStrategy.SelectStrategy;
import org.junit.jupiter.api.Test;

import java.util.Optional;

import static lab01.tdd.TestUtility.TEST_REPETITION;
import static lab01.tdd.TestUtility.populateListWithElements;
import static org.junit.jupiter.api.Assertions.*;

class SelectStrategyTest {

    private CircularList circularList;
    private SelectStrategy strategy;

    private void assignStrategyToList(final SelectStrategy strategy){
        circularList = new CircularListImpl(strategy);
    }

    @Test
    void testEvenStrategy(){
        strategy = new SelectEvenStrategy();
        assertTrue(strategy.apply(0));
        assertFalse(strategy.apply(1));
        assertTrue(strategy.apply(2));
        assertFalse(strategy.apply(3));
        assignStrategyToList(strategy);
        //Circular List Test
        populateListWithElements(circularList, 1,2,3);
        for(int i = 0 ; i< TEST_REPETITION; i++){
            assertEquals(Optional.of(2), circularList.next());
        }
    }

    @Test
    void testEqualsStrategy() {
        strategy = new SelectEqualsStrategy(3);
        assertTrue(strategy.apply(3));
        assertFalse(strategy.apply(2));
        assertFalse(strategy.apply(1));
        assignStrategyToList(strategy);
        //Circular List Test
        populateListWithElements(circularList, 1,2,3);
        for(int i = 0 ; i< TEST_REPETITION; i++){
            assertEquals(Optional.of(3), circularList.next());
        }
    }


}