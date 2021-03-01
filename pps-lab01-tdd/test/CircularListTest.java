import lab01.tdd.CircularList;
import lab01.tdd.CircularListImpl;
import org.junit.jupiter.api.Test;

import java.util.Optional;
import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.*;

/**
 * The test suite for testing the CircularList implementation
 */
public class CircularListTest {

    private static final int NUMBER_OF_INSERTED_ELEMENTS = 100;
    private static final int TEST_REPETITION = 50;

    CircularList circularList = new CircularListImpl();

    @Test
    public void initiallyEmptyList() {
        assertTrue(circularList.isEmpty());
        assertEquals(0, circularList.size());
    }

    public void testAdd(final int element) {
        circularList.add(element);
        assertFalse(circularList.isEmpty());
        assertTrue(circularList.size() != 0);
    }

    @Test
    public void testSingleAdd() {
        testAdd(1);
        assertEquals(1, circularList.size());
    }

    @Test
    public void testMultipleAdd() {
        IntStream.range(0, NUMBER_OF_INSERTED_ELEMENTS).forEach(this::testAdd);
        assertEquals(NUMBER_OF_INSERTED_ELEMENTS, circularList.size());
    }

    private void testNext(final int expectedElement){
        assertEquals(Optional.of(expectedElement), circularList.next());
    }

    @Test
    public void testNextWithEmptyList(){
        assertEquals(Optional.empty(), circularList.next());
    }

    @Test
    public void testNextSingleElement() {
        circularList.add(1);
        testNext(1);
    }

    @Test
    public void testMultipleNextSingleElement() {
        circularList.add(2);
        for(int i = 0 ; i< TEST_REPETITION; i++){
            testNext(2);
        }
    }

    private void populateListWithElements(final int ... values){
        for( int v : values){
            circularList.add(v);
        }
    }

    @Test
    public void testNextMultipleElement() {
        populateListWithElements(1,2,3);
        testNext(1);
        testNext(2);
        testNext(3);
        testNext(1);
    }

    public void testPrevious(final int expectedElement) {
        assertEquals(Optional.of(expectedElement), circularList.previous());
    }

    @Test
    public void testPreviousWithEmptyList(){
        assertEquals(Optional.empty(), circularList.previous());
    }

    @Test
    public void testPreviousSingleElement() {
        circularList.add(1);
        testPrevious(1);
    }

    @Test
    public void testMultiplePreviousSingleElement() {
        circularList.add(2);
        for(int i = 0 ; i< TEST_REPETITION; i++){
            testPrevious(2);
        }
    }

    @Test
    public void testMultiplePreviousMultipleElement() {
        populateListWithElements(1, 2, 3);
        testPrevious(3);
        testPrevious(2);
        testPrevious(1);
        testPrevious(3);
    }

    @Test
    public void testResetWithNext(){
        populateListWithElements(1, 2, 3);
        circularList.next();
        circularList.reset();
        assertEquals(Optional.of(1), circularList.next());
    }


    @Test
    public void testResetWithPrevious(){
        populateListWithElements(1, 2, 3);
        circularList.previous();
        circularList.reset();
        assertEquals(Optional.of(1), circularList.next());
    }

}
