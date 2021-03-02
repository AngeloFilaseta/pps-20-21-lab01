package lab01.tdd;

import org.junit.jupiter.api.Test;

import java.util.Optional;

import static lab01.tdd.TestUtility.TEST_REPETITION;
import static lab01.tdd.TestUtility.populateListWithElements;
import static org.junit.jupiter.api.Assertions.*;

class SelectStrategyTest {

    CircularList circularList;
    SelectStrategy strategy;

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
        populateListWithElements(circularList, 1,2,3);
        for(int i = 0 ; i< TEST_REPETITION; i++){
            assertEquals(Optional.of(2), circularList.next());
        }

    }


}