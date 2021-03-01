import lab01.tdd.CircularList;
import lab01.tdd.CircularListImpl;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * The test suite for testing the CircularList implementation
 */
public class CircularListTest {

    CircularList circularList = new CircularListImpl();

    @Test
    public void initiallyEmptyList(){
        assertTrue(circularList.isEmpty());
        assertEquals(0, circularList.size());
    }

}
